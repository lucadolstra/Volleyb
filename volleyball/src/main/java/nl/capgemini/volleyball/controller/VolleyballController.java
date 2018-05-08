package nl.capgemini.volleyball.controller;

import nl.capgemini.volleyball.model.Volleyball;

import nl.capgemini.volleyball.repository.VolleyballRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/volleyball")
public class VolleyballController {

    @Autowired
    private VolleyballRepository repo;

    @PutMapping("{id}")
    public Volleyball updateById(@PathVariable int id, @RequestBody Volleyball volleyball) {
        Volleyball volley = this.repo.findById(id).get();
        volley.setPressure(volleyball.getPressure());
        return this.repo.save(volley);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        this.repo.deleteById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Volleyball> findById(@PathVariable int id) {        //use the response entity so you dont return null;

        Optional<Volleyball> optionalVolleyball = this.repo.findById(id);
        if (optionalVolleyball.isPresent()) {
            return new ResponseEntity<Volleyball>(optionalVolleyball.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Volleyball>(HttpStatus.NOT_FOUND);
        }
    }
}



