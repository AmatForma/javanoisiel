package fr.amat.bean;

public class Personne {
	
	private String nom;
	private String mail;
	private String password;
	
	public Personne() {
		
	}
	
	
	public Personne(String nom, String mail, String password) {
		
		this.nom = nom;
		this.mail = mail;
		this.password = password;
	}
	
public Personne(String mail, String password) {
		
		this.mail = mail;
		this.password = password;
	}


	
	public String getNom() {
		return nom;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
