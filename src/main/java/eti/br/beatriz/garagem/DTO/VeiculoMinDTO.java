
package eti.br.beatriz.garagem.DTO;

import eti.br.beatriz.garagem.entities.Veiculo;

/**
 *
 * @author digma
 */
public class VeiculoMinDTO {

    private long id;
    private int km;
    private String marca;
    private String modelo;
    private int ano;

    public VeiculoMinDTO() {
    }

    public VeiculoMinDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.km = veiculo.getKm();
        this.marca = veiculo.getModelo();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
    }

    public long getId() {
        return id;
    }

    public int getKm() {
        return km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
    
    
            
            
    
}
