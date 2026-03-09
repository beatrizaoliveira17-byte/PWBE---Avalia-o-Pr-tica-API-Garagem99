
package eti.br.beatriz.garagem.repositories;

import eti.br.beatriz.garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *Repository: Camada de acesso a dados: faz a consulta no banco.
 * @author digma
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    
}
