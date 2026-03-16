package eti.br.beatriz.garagem.controllers;

import eti.br.beatriz.garagem.DTO.VeiculoMinDTO;
import eti.br.beatriz.garagem.entities.Veiculo;
import eti.br.beatriz.garagem.repositories.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoService.findAll();
        return result;
    }

    @GetMapping("/color/{corName}")
    public ResponseEntity<List<Veiculo>> findByCorIgnoreCase(@PathVariable String corName) {
        List<Veiculo> result = veiculoService.findByColor(corName);

        if (result.isEmpty()) {

            return ResponseEntity.notFound().build();

        } else {

            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("/ano/{anoName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByAno (@PathVariable int anoName){
        
        List<VeiculoMinDTO> result = veiculoService.findByAno(anoName);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }

}