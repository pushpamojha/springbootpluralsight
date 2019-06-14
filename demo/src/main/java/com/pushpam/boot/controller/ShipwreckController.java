package com.pushpam.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushpam.boot.model.Shipwreck;

@RestController
@RequestMapping("/api/v1")
public class ShipwreckController {

	
	@GetMapping("shipwrecks")
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
	
	@PostMapping("shipwrecks")
	public void create(Shipwreck shipwreck) {
		 ShipwreckStub.create(shipwreck);
	}
	
	@GetMapping("shipwrecks/{id}")
	public Shipwreck list(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}
	
	@PutMapping("shipwrecks/{id}")
	public void update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		 ShipwreckStub.update(id, shipwreck);
	}
	
	@DeleteMapping("shipwrecks/{id}")
	public void delete(@PathVariable Long id) {
		 ShipwreckStub.delete(id);
	}
}
