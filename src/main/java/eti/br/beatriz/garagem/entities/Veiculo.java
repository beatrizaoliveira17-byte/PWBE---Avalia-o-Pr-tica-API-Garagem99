
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public String getDescricaoCompleta() {
        return DescricaoCompleta;
    }

    public void setDescricaoCompleta(String DescricaoCompleta) {
        this.DescricaoCompleta = DescricaoCompleta;
    }
}