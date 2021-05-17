package br.spacemonkeys.ms_farmv3.repository;

import br.spacemonkeys.ms_farmv3.model.HtModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HTRepository extends MongoRepository<HtModel,Long> {
}
