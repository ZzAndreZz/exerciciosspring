package br.com.rd.exerciciospring.Service;

import br.com.rd.exerciciospring.Model.Dto.CupomDto;
import br.com.rd.exerciciospring.Repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CupomService {

    @Autowired
    private CupomRepository cupomRepository;

    public ResponseEntity find(CupomDto cupomDto) {

        if (cupomDto == null)
            return ResponseEntity.badRequest().body(new Exception("Cliente não informado"));

        if (cupomDto.getListaDeCupons() == null)
            return ResponseEntity.badRequest().body(new Exception("Pedido não encontrado"));

        CupomDto cupomDto1 = new CupomDto();
        cupomDto1.setId_Cliente(cupomDto1.getId_Cliente());
        cupomDto1.setDt_Venda(cupomDto1.getDt_Venda());


    }
}
