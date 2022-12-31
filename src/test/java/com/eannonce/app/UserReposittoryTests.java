//package com.eannonce.app;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import com.eannonce.app.model.User;
//import com.eannonce.app.repository.UserRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UserReposittoryTests {
//	
//	@Autowired
//	private UserRepository userRepo;
//	
//	@Autowired
//	private EntityManager entityManager;
//	
//	public void testCreateUser() {
//		User user = new User();
//		user.setFirstName("papa");
//		user.setLastName("mulumba");
//		user.setUsername("shxwn");
//		user.setEmail("test@shxwn.com");
//		user.setPassword("Jesusislord");
//		//user.setDtBirth("15-02-2000");
//		user.setContact("1684989");
//		user.setAddress("Kinshasa");
//		
//		User savedUser = userRepo.save(user);
//		User existUser = entityManager.find(User.class, savedUser.getIdUser());
//		assertThat(existUser.getFirstName());
//		
//	}
//
//}
