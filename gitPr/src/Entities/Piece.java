package Entities;

public class Piece {

	private String couleur;
	private String position;
	public Piece(String couleur, String position) {
		super();
		this.couleur = couleur;
		this.position = position;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
