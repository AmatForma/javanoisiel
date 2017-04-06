package fr.amat.bean;

public class Personne {
	
        private int idPersonne;
        private String prenom;
        private String nom;
	private String mail;
	private String adresse;
	private String codePostal;
	private String ville;
	private String password;
	private String telephone;
	private String photo;
	private boolean isAdmin;

    public Personne(int idPersonne, String prenom, String nom, String mail, String adresse, String codePostal, String ville, String password, String telephone, String photo, boolean isAdmin) {
        this.idPersonne = idPersonne;
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.password = password;
        this.telephone = telephone;
        this.photo = photo;
        this.isAdmin = isAdmin;
    }

    public Personne(int idPersonne, String prenom, String nom, String mail, String adresse, String codePostal, String ville, String telephone) {
        this.idPersonne = idPersonne;
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
    }
    
    public Personne(String prenom, String nom, String mail, String adresse, String codePostal, String ville, String password, String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.mail = mail;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.password = password;
        this.telephone = telephone;
    }

    public Personne(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getMail() {
        return mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getPhoto() {
        return photo;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Personne{" + "idPersonne=" + idPersonne + ", prenom=" + prenom + ", nom=" + nom + ", mail=" + mail + ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", password=" + password + ", telephone=" + telephone + ", photo=" + photo + ", isAdmin=" + isAdmin + '}';
    }
	
	
        

}
