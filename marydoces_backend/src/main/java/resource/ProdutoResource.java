package resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Produtos;
import services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {
	
	@Autowired
	public ProdutoService produtoServices;
	
	
	@GetMapping
    public List<Produtos> getAll(){
	      return produtoServices.getAll();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Produtos> get(@PathVariable Integer id){
        Optional<Produtos> produtos = produtoServices.find(id);
        if (!(produtos.isPresent())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtos.get());
    }
	/**/
}
