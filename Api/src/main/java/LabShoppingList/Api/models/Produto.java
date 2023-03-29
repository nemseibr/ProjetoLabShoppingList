package LabShoppingList.Api.models;

import java.math.BigDecimal;
import java.util.Objects;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="TB_PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Nonnull
    @ManyToOne
    private Categoria categoria;
    
    @Nonnull
    private String nome;
    
    @Nonnull
    private BigDecimal valor;
    
    @Enumerated(EnumType.STRING)
    private StatusProduto status;
    
    public Produto() {
    }
    
    public Produto(Categoria categoria, String nome, BigDecimal valor, StatusProduto status) {
        this.categoria = categoria;
        this.nome = nome;
        this.valor = valor;
        this.status = status;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public StatusProduto getStatus() {
        return status;
    }
    
    public void setStatus(StatusProduto status) {
        this.status = status;
    }
    
    // métodos adicionais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getNome(), produto.getNome());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}

enum StatusProduto {
    COMPRADO,
    NAO_COMPRADO,
    PENDENTE
}