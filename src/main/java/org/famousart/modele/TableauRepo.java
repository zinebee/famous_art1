package org.famousart.modele;

import org.hibernate.engine.jdbc.batch.spi.Batch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface TableauRepo extends MongoRepository<Tableau,Long>{
   // Batch findTopByOrderByCreatedDesc();

}
