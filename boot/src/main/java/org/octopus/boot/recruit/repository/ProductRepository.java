package org.octopus.boot.recruit.repository;



import org.octopus.boot.recruit.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
