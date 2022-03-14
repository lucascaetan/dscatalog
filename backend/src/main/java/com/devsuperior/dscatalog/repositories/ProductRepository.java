package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> 63cd9a3a8d53969f475e5c04a071d46d3a74ce3d
	@Query("SELECT DISTINCT obj FROM Product obj INNER JOIN obj.categories cats WHERE "
			+ "(COALESCE(:categories) IS NULL OR cats IN :categories) AND "
			+ "(LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%')) )")
	Page<Product> find(List<Category> categories, String name, Pageable pageable);
	
	@Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products ")
	List<Product> findProductsWithCategories(List<Product> products);
<<<<<<< HEAD

=======
=======
>>>>>>> parent of 50c490d (Fix: Postgres compatibility)
>>>>>>> 63cd9a3a8d53969f475e5c04a071d46d3a74ce3d
}
