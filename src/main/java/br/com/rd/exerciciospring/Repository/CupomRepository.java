package br.com.rd.exerciciospring.Repository;

import br.com.rd.exerciciospring.Model.Dto.CupomDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<CupomDto, Long> {

    public List<CupomDto> findByIdClienteAndDtVenda(Long id_Cliente, String dt_Venda);
}
