package br.com.rd.exerciciospring.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private long id_Cupom;

    @Column(name = "id_cliente")
    private long id_Cliente;

    @Column(name = "dt_venda")
    private String dt_Venda;

    @Column(name = "vl_venda")
    private BigDecimal vl_Venda;
}
