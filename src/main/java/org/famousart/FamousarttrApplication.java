package org.famousart;
import org.springframework.data.mongodb.MongoDbFactory;
import org.famousart.modele.Artiste;
import org.famousart.modele.ArtisteRepo;
import org.famousart.modele.Tableau;
import org.famousart.modele.TableauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class FamousarttrApplication {
@Autowired
private TableauRepo repositoryy;
@Autowired
private ArtisteRepo repository;
	public static void main(String[] args) {
		SpringApplication.run(FamousarttrApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args->{
			Artiste artiste=new Artiste(1,"van","gogh","1853-03-30");
			repository.save(artiste);
			
			repositoryy.save(new Tableau(4,"Terrase de cafe la nuit","1888"));
			repositoryy.save(new Tableau(5,"Cahmbre à Arles","1888"));
			repositoryy.save(new Tableau(6,"Iris","1889"));
				
		};
	}
	
     
}
