package edu.wf.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.wf.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
}
