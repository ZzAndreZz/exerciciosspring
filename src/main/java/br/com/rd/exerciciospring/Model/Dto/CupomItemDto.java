package br.com.rd.exerciciospring.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CupomItemDto {

    private long id_Cupom_Item;
    private CupomDto id_Cupom;
    private ProdutoDto id_Produto;
    private long qt_Produto;
    private BigDecimal vl_produto;



}
