package org.famousart.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import lombok.*;
import java.util.*;
@Document(collection="Artiste")
public class Artiste {
@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
@Indexed(unique=true)
//@Field(value="$inc")
private long id;
@Field(value="nom_artiste")
private String nom;
@Field(value="preno_artiste")
private String prenom;
@Field(value="datenaissance_artiste")
private String datenaissance;
public Artiste() {}
public Artiste(long id,String nom,String prenom,String datenaissance) {
	this.id=id;
	this.nom=nom;
	this.prenom=prenom;
	this.datenaissance=datenaissance;
}
//@OneToMany(cascade=CascadeType.ALL,mappedBy="artiste")
//@JsonIgnore
//private List<Tableau> tableaux;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getDatenaissance() {
	return datenaissance;
}
public void setDatenaissance(String datenaissance) {
	this.datenaissance = datenaissance;
}
/*public List<Tableau> getTableaux() {
	return tableaux;
}*/
/*public void setTableaux(List<Tableau> tableaux) {
	this.tableaux = tableaux;
}*/
public Artiste(Artiste artiste) {
	this.id=artiste.getId();
	this.datenaissance=artiste.getDatenaissance();
    this.nom=artiste.getNom();
    this.prenom=artiste.getPrenom();
}
@Override 
public String toString() {
	return "c'est la classe Artiste";
}
}
