package services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dataTransferObjects.ProdutosDTO;
import model.Produtos;
import repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;
    
    //listar todos os produtos
    public List<Produtos> getAll(){
        return produtoRepository.findAll();
    }
    //buscar produto por Id
    public Optional<Produtos> find(Integer id){
        return produtoRepository.findById(id);
    }
    // cadastrar produto
    public Produtos post(Produtos produtos) {
        return produtoRepository.save(produtos);
    }
    // deletar produto por nome	
    public void deleteByObject(Produtos produtos){
        produtoRepository.deleteById(produtos.getId());
    }
    // deletar produto por id
    public void deleteById1(Integer id) {
        produtoRepository.deleteById(id);
    }
    

    //DTO approach, need delete this if i decide not use it
    public ProdutosDTO toDTO(Produtos produtos) {
    	ProdutosDTO produtosDTO = new ProdutosDTO();
        produtosDTO.setId(produtos.getId());
        produtosDTO.setNome(produtos.getNome());
        produtosDTO.setPreço(produtos.getPreço());
        produtosDTO.setDescrição(produtos.getDescrição());
        produtosDTO.setIngredientes(produtos.getIngredientes());
        return produtosDTO;
    }

   
    
    
    
}
