package br.spacemonkeys.ms_farmv3.repository;

import br.spacemonkeys.ms_farmv3.model.Conductivity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConductivityRepository extends MongoRepository<Conductivity, Long> {
}
