
package eti.br.beatriz.garagem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Veiculos")
public class Veiculo {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 private long id;
 private String marca;
 private String modelo;
 private String cor;
 private int ano;
 private int km;
 private String avarias;

 @Column(name = "LINKIMAGEM")
 private String linkImagem;
 
 @Column(name = "DESCRICAOCOMPLETA")
 private String DescricaoCompleta;

 
}