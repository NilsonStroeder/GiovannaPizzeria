package br.com.giovannapizzeria.giovannaPizzeria.repository;

import br.com.giovannapizzeria.giovannaPizzeria.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient,Long> {

}
