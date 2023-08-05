package com.epicode.gestione_device.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_device.security.entity.Dispositivo;
import com.epicode.gestione_device.security.entity.Laptop;
import com.epicode.gestione_device.security.entity.Smartphone;
import com.epicode.gestione_device.security.entity.StatoDispositivo;
import com.epicode.gestione_device.security.entity.Tablet;
import com.epicode.gestione_device.security.entity.User;
import com.epicode.gestione_device.security.repository.DispositivoRepository;
import com.epicode.gestione_device.security.repository.UserRepository;



@Service
public class DispositivoService {

	@Autowired DispositivoRepository dispositivoRepo;
	@Autowired @Qualifier("smartphoneBean") private ObjectProvider<Smartphone> smartphoneProvider;
	@Autowired @Qualifier("tabletBean") private ObjectProvider<Tablet> tabletProvider;
	@Autowired @Qualifier("laptopBean") private ObjectProvider<Laptop> laptopProvider;
	@Autowired UserRepository userRepo;
	
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
	
	public List<Dispositivo> findByUser(User user){
		return dispositivoRepo.findByUser(user);
	}
	
	public Dispositivo assegnaSmartphone(long id) {
		User u = userRepo.findById(id).get();
		List<Dispositivo> listD = dispositivoRepo.findByStato(StatoDispositivo.DISPONIBILE);
		List<Smartphone> listS = new ArrayList<Smartphone>();
		for(Dispositivo d : listD){
			if(d instanceof Smartphone) {
				listS.add((Smartphone) d);
			}
		}
		if(listS.size()== 0){
			System.out.println("ERRORE");
			return null;
			}else {
				Smartphone s = listS.get(0);
				s.setUser(u);
				s.setStato(StatoDispositivo.ASSEGNATO);
				dispositivoRepo.save(s);
				return s;
			}
	}
		 
		public Dispositivo assegnaTablet(long id) {
			User u = userRepo.findById(id).get();
			List<Dispositivo> listD = dispositivoRepo.findByStato(StatoDispositivo.DISPONIBILE);
			List<Tablet> listT = new ArrayList<Tablet>();
			for(Dispositivo d : listD){
				if(d instanceof Tablet) {
					listT.add((Tablet) d);
				}
			}
			if(listT.size()== 0){
				System.out.println("ERRORE");
				return null;
				}else {
					Tablet t = listT.get(0);
					t.setUser(u);
					t.setStato(StatoDispositivo.ASSEGNATO);
					dispositivoRepo.save(t);
					return t;
				}	
	}
	
		public Dispositivo assegnaLaptop(long id) {
			User u = userRepo.findById(id).get();
			List<Dispositivo> listD = dispositivoRepo.findByStato(StatoDispositivo.DISPONIBILE);
			List<Laptop> listL = new ArrayList<Laptop>();
			for(Dispositivo d : listD){
				if(d instanceof Laptop) {
					listL.add((Laptop) d);
				}
			}
			if(listL.size()== 0){
				System.out.println("ERRORE");
				return null;
				}else {
					Laptop l = listL.get(0);
					l.setUser(u);
					l.setStato(StatoDispositivo.ASSEGNATO);
					dispositivoRepo.save(l);
					return l;
				}	
	}
		public Dispositivo manutenzione(long id) {
			Dispositivo d = getDispositivoByID(id);
			if(d.getStato().equals(StatoDispositivo.INMANUTENZIONE)) {
				d.setStato(StatoDispositivo.DISPONIBILE);
				dispositivoRepo.save(d);
				return d;
			}else{
				d.setStato(StatoDispositivo.INMANUTENZIONE);
				d.setUser(null);
				dispositivoRepo.save(d);
				return d;
			}
		}
}
