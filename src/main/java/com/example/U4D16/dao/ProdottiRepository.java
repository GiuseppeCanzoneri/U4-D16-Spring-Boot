package com.example.U4D16.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.U4D16.entities.Prodotti;

@Repository
public interface ProdottiRepository extends JpaRepository<Prodotti, Long> {

}