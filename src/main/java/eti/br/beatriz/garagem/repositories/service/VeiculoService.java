package eti.br.beatriz.garagem.repositories.service;

import eti.br.beatriz.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import eti.br.beatriz.garagem.repositories.VeiculoRepository;

/**
 * Service: Implementa a regra de negócio (consulta/atualiza banco usando o
 * repository).
 *
 * @author digma
 */
@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
    }
    /**
     * Retorna DTO Filtrado por
     * @param cor
     * @param Veiculo
     * @return
     */
    
    public List<Veiculo>findByColor(String cor) {
        List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);
        
           return result;
        
    }

}

