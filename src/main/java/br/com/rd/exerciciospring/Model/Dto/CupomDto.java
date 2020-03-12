package br.com.rd.exerciciospring.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CupomDto {

    private long id_Cupom;
    private long id_Cliente;
    private String dt_Venda;
    private BigDecimal vl_Venda;

    List<CupomItemDto> listaDeCupons;
}
