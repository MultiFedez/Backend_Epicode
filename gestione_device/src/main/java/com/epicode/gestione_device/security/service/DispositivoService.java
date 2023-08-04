package com.epicode.gestione_device.security.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_device.security.entity.Dispositivo;
import com.epicode.gestione_device.security.entity.Laptop;
import com.epicode.gestione_device.security.entity.Smartphone;
import com.epicode.gestione_device.security.entity.Tablet;
import com.epicode.gestione_device.security.repository.DispositivoRepository;



@Service
public class DispositivoService {

	@Autowired DispositivoRepository dispositivoRepo;
	@Autowired @Qualifier("smartphoneBean") private ObjectProvider<Smartphone> smartphoneProvider;
	@Autowired @Qualifier("tabletBean") private ObjectProvider<Tablet> tabletProvider;
	@Autowired @Qualifier("laptopBean") private ObjectProvider<Laptop> laptopProvider;
	
	public Dispositivo createDispositivo(Dispositivo d) {
		if(d instanceof Smartphone) {
			Smartphone s = smartphoneProvider.getObject();
			dispositivoRepo.save(s);
			return s;
		}else if(d instanceof Tablet) {
			Tablet t = tabletProvider.getObject();
			dispositivoRepo.save(t);
			return t;
		}else if(d instanceof Laptop) {
			Laptop l = laptopProvider.getObject();
			dispositivoRepo.save(l);
			return l;
		}else {
			return null;
		}
	}
	
	public List<Dispositivo> getAllDispositivi() {
		return (List<Dispositivo>) dispositivoRepo.findAll();
	}
	
	public Dispositivo getDispositivoByID(Long id) {
		return dispositivoRepo.findById(id).get();
	}
}
