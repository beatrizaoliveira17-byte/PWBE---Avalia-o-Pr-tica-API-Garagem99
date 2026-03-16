
package eti.br.beatriz.garagem.repositories;

import eti.br.beatriz.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *Repository: Camada de acesso a dados: faz a consulta no banco.
 * @author digma
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByCorIgnoreCase(String cor);
    List<Veiculo> findByMarcaIgnoreCase(String marca);
    
    public List<Veiculo> findByAno (int ano);
}
