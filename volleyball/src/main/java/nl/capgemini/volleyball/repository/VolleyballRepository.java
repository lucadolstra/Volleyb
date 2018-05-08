package nl.capgemini.volleyball.repository;

import nl.capgemini.volleyball.model.Volleyball;
import org.springframework.data.repository.CrudRepository;

public interface VolleyballRepository extends CrudRepository<Volleyball, Integer> {
}
