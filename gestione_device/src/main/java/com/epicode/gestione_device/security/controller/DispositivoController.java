package com.epicode.gestione_device.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestione_device.security.entity.Dispositivo;
import com.epicode.gestione_device.security.entity.Laptop;
import com.epicode.gestione_device.security.entity.Smartphone;
import com.epicode.gestione_device.security.entity.Tablet;
import com.epicode.gestione_device.security.entity.User;
import com.epicode.gestione_device.security.service.DispositivoService;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {
	
	@Autowired DispositivoService dservice;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public List<Dispositivo> getAll() {
		return dservice.getAllDispositivi();
	}

	@GetMapping("/{id}")
	@PreAuthorize("isAuthenticated()")
	public Dispositivo getById(@PathVariable Long id) {
		return dservice.getDispositivoByID(id);
	}
	
	@GetMapping("/user")
	@PreAuthorize("isAuthenticated()")
	public List<Dispositivo> getByUser(@RequestBody User user){
		return dservice.findByUser(user);
	}
	
	@PostMapping("/s")
	@PreAuthorize("isAuthenticated()")
	public Dispositivo createDispositivoS() {
		return dservice.createDispositivo(new Smartphone());
	}
	
	@PostMapping("/l")
	@PreAuthorize("isAuthenticated()")
	public Dispositivo createDispositivoL() {
		return dservice.createDispositivo(new Laptop());
	}
	
	@PostMapping("/t")
	@PreAuthorize("isAuthenticated()")
	public Dispositivo createDispositivoT() {
		return dservice.createDispositivo(new Tablet());
	}
	
	@PutMapping("/s/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR')")
	public Dispositivo assegnaDispositivoS(@PathVariable Long id) {
		return dservice.assegnaSmartphone(id);
	}
	
	@PutMapping("/t/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR')")
	public Dispositivo assegnaDispositivoT(@PathVariable Long id) {
		return dservice.assegnaTablet(id);
	}
	
	@PutMapping("/l/{id}")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR')")
	public Dispositivo assegnaDispositivoL(@PathVariable Long id) {
		return dservice.assegnaLaptop(id);
	}
}
