package br.spacemonkeys.ms_farmv3.repository;

import br.spacemonkeys.ms_farmv3.model.Ph;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PhRepository extends MongoRepository<Ph, Long> {

}
