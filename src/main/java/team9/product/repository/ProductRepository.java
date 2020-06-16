package team9.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import team9.product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findByBrand(String brand);

	List<Product> findByProductname(String productname);

	List<Product> findByCategory(String category);

//	Iterable<Product> findBySellerid(Integer sellerid);
	
}
