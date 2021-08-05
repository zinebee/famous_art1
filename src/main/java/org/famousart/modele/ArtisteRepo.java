package org.famousart.modele;

import org.hibernate.engine.jdbc.batch.spi.Batch;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;

public interface ArtisteRepo extends MongoRepository<Artiste,Long>{
   // Batch findTopByOrderByCreatedDesc();

}
