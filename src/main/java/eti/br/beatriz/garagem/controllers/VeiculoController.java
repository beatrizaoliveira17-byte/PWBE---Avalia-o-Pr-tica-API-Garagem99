
package eti.br.beatriz.garagem.controllers;

import eti.br.beatriz.garagem.entities.Veiculo;
import eti.br.beatriz.garagem.repositories.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Porta de entrada do BackEnd.

 * @author digma
 */

@RestController
public class VeiculoController {
    
    
    @Autowired
    private VeiculoService veiculoService;
    
    /**
     * Endpoint /veiculos/veiculo
     *Retorna TODOS os veiculos  da base de dados.
     * @return
     * 
     */
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll(){
    List<Veiculo> result = veiculoService.findAll();
    return result;
     
             
}
}
