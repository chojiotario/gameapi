package br.com.lucasviannasantos.gameapi.repository;

import br.com.lucasviannasantos.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface playerRepository extends
    MongoRepository<Player, String>{
}
