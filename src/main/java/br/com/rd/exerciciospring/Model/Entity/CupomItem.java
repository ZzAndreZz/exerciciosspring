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
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private long id_Cupom_Item;

    @OneToMany
    @JoinColumn(name = "id_cupom")
    private Cupom id_Cupom;

    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto id_Produto;

    @Column(name = "qt_produto")
    private long qt_Produto;

    @Column(name = "vl_produto")
    private BigDecimal vl_produto;

}
