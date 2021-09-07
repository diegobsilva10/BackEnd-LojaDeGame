package org.generation.LojaDeGame.model;
/**
 * Classe utilizada como entidade no banco de dados para a criação das categorias.
 *
 * @author Diego Silva
 * @since 1.0
 *
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoModel {
    private static final long servialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Nome do Produto")
    @Size(min = 2, max = 50)
    private String nomeProduto;

    @NotBlank
    private BigDecimal valor;

    private Date dataHora;
}
