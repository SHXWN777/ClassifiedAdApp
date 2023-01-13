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
//import com.eannonce.app.model.Status;
////import com.eannonce.app.repository.CategoryRepository;
//import com.eannonce.app.repository.StatusRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class StatusRepositoryTests {
//	
//	@Autowired
//	private StatusRepository statusRepository;
//	
//	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testCreateStatus() {
//		Status status = new Status();		
//		status.setName("Active");
//		
//		Status savedStatus = statusRepository.save(status);
//		
//		Status existStatus = entityManager.find(Status.class, savedStatus.getIdStatus());
//		
//		assertThat(existStatus.getName()).isEqualTo(status.getName());
//	}
//
//}
