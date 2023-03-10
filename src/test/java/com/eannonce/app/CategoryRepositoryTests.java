//package com.eannonce.app;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import com.eannonce.app.model.Category;
//import com.eannonce.app.repository.CategoryRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class CategoryRepositoryTests {
//	
//	@Autowired
//	private CategoryRepository categoryRepository;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreateCategory() {
//		Category category = new Category();		
//		category.setName("Real estate");
//		
//		Category savedCategory = categoryRepository.save(category);
//		
//		Category existCategory = entityManager.find(Category.class, savedCategory.getIdCategory());
//		
//		assertThat(existCategory.getName()).isEqualTo(category.getName());
//	}
//
//}
