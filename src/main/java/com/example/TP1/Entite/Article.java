package com.example.TP1.Entite;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Date date_publication;

    @ManyToOne
    @JoinColumn(name = "id")
    private User auteur;
    private String contenu;

    public Article() {

    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public User getAuteur() {
        return auteur;
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Article{" + "date_publication=" + date_publication + ", auteur="+ auteur.toString() + ", contenu=" + contenu + '}';
    }
}
