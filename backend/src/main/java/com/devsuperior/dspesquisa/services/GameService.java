package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;


// UM SERVIÇO PARA TRABALHAR COM GAMES. ESTE SIM PODE TER UM DEPENDÊNCIA PARA O GAME REPOSITORY

@Service // PERMITE QUE O GameService POSSA SER INJETADO EM OUTRAS CLASSES
public class GameService {
	
	@Autowired // INJETA A DEPENDÊNCIA AUTOMATICAMENTE
	private GameRepository repository;
	
	//MÉTODO PARA RETORNAR OS GAMES -> CONVERSÃO DA LISTA GAME EM UMA LISTA GAMEDTO
	@Transactional(readOnly = true) // GARANTE QUE TODA PARTE DE BANCO DE DAOS SEJA FEITA E FINALIZADA NO SERVICE
				   // EVITA O LOKIN NO BANCO DE DADOS	
	public List<GameDTO> findAll() {
		List<Game> list = repository.findAll(); 
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}

}
