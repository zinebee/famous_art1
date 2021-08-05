package org.famousart.modele;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.*;

@Document(collection="tableau")
public class Tableau {
@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
@Indexed(unique=true)
//@Field(value="$inc")
private long id;
@Field(value="nomTableau_tableau")
private String nomTableau;
@Field(value="datepublication_tableau")
private String datepublication;
public Tableau() {}
public Tableau(long id,String nomTableau,String datepublication) {
	this.id=id;
	this.nomTableau=nomTableau;
	this.datepublication=datepublication;
}

//@ManyToOne(fetch=FetchType.LAZY)
//@JoinColumn(name="artiste")
//@NonNull
private Artiste artiste;
public Tableau(String nomTableau,String datepublication,Artiste artiste) {
	this.nomTableau=nomTableau;
	this.datepublication=datepublication;
	this.artiste=new Artiste(artiste);
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNomTableau() {
	return nomTableau;
}
public void setNomTableau(String nomTableau) {
	this.nomTableau = nomTableau;
}
public String getDatepublication() {
	return datepublication;
}
public void setDatepublication(String datepublication) {
	this.datepublication = datepublication;
}
public Artiste getArtiste() {
	return artiste;
}
public void setArtiste(Artiste artiste) {
	this.artiste = artiste;
}
@Override
public String toString() {
	return "c'est la classe tableau";
}
}
