package ma.rest.spring.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    // Constructeur par défaut
    public Compte() {
    }

    // Constructeur avec tous les paramètres
    public Compte(Long id, double solde, Date dateCreation, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public TypeCompte getType() {
        return type;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                ", type=" + type +
                '}';
    }
}