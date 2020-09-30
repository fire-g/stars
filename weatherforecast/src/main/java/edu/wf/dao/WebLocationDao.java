package edu.wf.dao;

import java.util.List;

import edu.wf.model.Location;

public interface WebLocationDao {
	public List<Location> getWebLocation(String city);
}
