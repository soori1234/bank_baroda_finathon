package com.bank.baroda.finathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.baroda.finathon.dao.LocationDAO;
import com.bank.baroda.finathon.model.Greeting;
import com.bank.baroda.finathon.model.Location;

@RestController
public class LocationRestController {

	
	@Autowired
	private LocationDAO locationDAO;

	
	 @RequestMapping(value = "/greetings", method=RequestMethod.GET)
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(100,"soori");
	    }
	
	
	
	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public List<Location> getLocations() {
		
		return locationDAO.list();
	}
	
	@RequestMapping(value="/locations/{id}", method = RequestMethod.GET)
	public Location getLocation(@PathVariable("id") Long id) {
		Location location = locationDAO.get(id);
		if (location == null) {
			return null;
		}

		return location;
	}
/*
	@PostMapping(value = "/locations")
	public ResponseEntity createLocation(@RequestBody Location location) {

		locationDAO.create(location);

		return new ResponseEntity(location, HttpStatus.OK);
	}

	@DeleteMapping("/locations/{id}")
	public ResponseEntity deleteLocation(@PathVariable Long id) {

		if (null == locationDAO.delete(id)) {
			return new ResponseEntity("No Location found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);*/

	/*}

	@PutMapping("/locations/{id}")
	public ResponseEntity updateCustomer(@PathVariable Long id, @RequestBody Location location) {

		location = locationDAO.update(id, location);

		if (null == location) {
			return new ResponseEntity("No Location found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(location, HttpStatus.OK);
	}
*/
}