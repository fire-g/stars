package edu.wf.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.wf.model.LifeIndex;

@Repository
public interface LifeIndexRepository extends CrudRepository<LifeIndex, Integer> {
	@Query("select * from life_index where location_id = :condition")
	List<LifeIndex> findByLocationId(@Param("condition") String locationId);
}
