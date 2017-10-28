package com.bank.baroda.finathon.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bank.baroda.finathon.model.Address;
import com.bank.baroda.finathon.model.Location;

@Component
public class LocationDAO {

	// Dummy database. Initialize with some dummy values.
	private static List<Location> locations;
	{
		locations = new ArrayList<Location>();
		Location location = new Location();
		location.setLocationId(101l);
		Address address = new Address();
		address.setAddressId(101l);
		address.setCity("Vijayawada");
		location.setAddress(address);
		
		locations.add(location);
		
		/*customers = new ArrayList();
		customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		customers.add(new Customer(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));*/
	}

	/**
	 * Returns list of customers from dummy database.
	 * 
	 * @return list of customers
	 */
	public List<Location> list() {
		return locations;
	}

	
	public Location get(Long id) {

		for (Location l : locations) {
			if (l.getLocationId().equals(id)) {
				return l;
			}
		}
		return null;
	}


	public Location create(Location location) {
		location.setLocationId(System.currentTimeMillis());
		locations.add(location);
		return location;
	}

	public Long delete(Long id) {

		for (Location l : locations) {
			if (l.getLocationId().equals(id)) {
				locations.remove(l);
				return id;
			}
		}

		return null;
	}

	public Location update(Long id, Location location) {

		for (Location l : locations) {
			if (l.getLocationId().equals(id)) {
				location.setLocationId(l.getLocationId());
				locations.remove(l);
				locations.add(location);
				return location;
			}
		}

		return null;
	}

}