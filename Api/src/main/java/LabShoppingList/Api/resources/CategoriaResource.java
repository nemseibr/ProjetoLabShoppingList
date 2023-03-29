package LabShoppingList.Api.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LabShoppingList.Api.models.Categoria;
import LabShoppingList.Api.models.Produto;
import LabShoppingList.Api.repository.CategoriaRepository;

@RestController
@RequestMapping(value="/api")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;
	private CrudRepository<Categoria, Long> produtoaRepository;
	
    @GetMapping("/categoria")
    public List<Categoria> listaCategoria() {
        return categoriaRepository.findAll();
    }
    
    @GetMapping("/categoria/{id}")
    public Optional<Categoria> buscaCategoriaPorId(@PathVariable(value = "id") long id) {
        return categoriaRepository.findById(id);
    }

	
    @PostMapping("/categoria")
    public Categoria salvaCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/categoria")
    public void deletaCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @PutMapping("/categoria")
    public Categoria atualizaCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
	
    @PostMapping("/categoria/produto")
    public Categoria salvaProdutoCategoria(@RequestBody Produto produto) {
        Categoria categoria = produto.getCategoria();
        categoria.addProduto(produto);
        return categoriaRepository.save(categoria);
    }
    
    @GetMapping("/produto/{id}")
    public Optional<Categoria> buscaProdutoPorId(@PathVariable(value = "id") long id) {
        produtoaRepository = null;
		return produtoaRepository.findById(id);
    }
}
