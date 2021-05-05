package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() { //método para retornar uma lista de seller
		List<Seller> result = repository.findAll(); 
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); //para cada x na lista de seller, cria um SelletDTO com o x como argumento
	}

}
