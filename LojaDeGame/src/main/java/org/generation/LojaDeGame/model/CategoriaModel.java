package org.generation.LojaDeGame.model;


/**
 * Classe utilizada como entidade no banco de dados para a criação das categorias.
 *
 * @author Diego Silva
 * @since 1.0
 *
 */
import javax.persistence.*;


@Entity
@Table(name = "TB_CATEGORIA")
public class CategoriaModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String nomeCategoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
