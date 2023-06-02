package com.example.U4D16.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.U4D16.entities.Prodotti;

@Service
public class ProdottiService {
	@Autowired
	ProdottiRepository prodottiRepo;

	public void create(Prodotti p) {
		prodottiRepo.save(p);
	}

	public List<Prodotti> find() {
		return prodottiRepo.findAll();
	}

	public Prodotti findById(Long id) {
		return prodottiRepo.findById(id).orElseThrow(() -> new NullPointerException());
	}

	public void findByIdAndUpdate(Long id, Prodotti p) {

		Prodotti found = this.findById(id);
		found.setId(id);
		found.setName(p.getName());
		found.setPrezzo(p.getPrezzo());
		prodottiRepo.save(found);
	}

	public void findByIdAndDelete(Long id) {
		Prodotti found = this.findById(id);
		prodottiRepo.delete(found);
	}

	public long count() {
		return prodottiRepo.count();
	}

}
