package br.spacemonkeys.ms_farmv3.repository;

import br.spacemonkeys.ms_farmv3.model.Nutrients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NutrientRepository extends MongoRepository<Nutrients,Long> {
}
