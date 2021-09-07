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


@Entity
@Table(name = "TB_CATEGORIA")
public class CategoriaModel{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idCategoria;

    @NotBlank(message = "Nome da Categoria")
    @Size(min = 2, max = 50)
    private String nomeCategoria;

    @NotBlank(message = "Descrição da categoria")
    @Size(min = 2, max = 100)
    private String descricaoCategoria;


    public Long getId() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }
}
