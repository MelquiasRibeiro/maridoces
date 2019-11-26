package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Produtos;

@Repository
public interface ProdutoRepository extends JpaRepository<Produtos,Integer> {

}
