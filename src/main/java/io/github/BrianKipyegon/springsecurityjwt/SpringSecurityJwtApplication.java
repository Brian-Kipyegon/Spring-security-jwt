package io.github.BrianKipyegon.springsecurityjwt;

import io.github.BrianKipyegon.springsecurityjwt.model.Role;
import io.github.BrianKipyegon.springsecurityjwt.model.User;
import io.github.BrianKipyegon.springsecurityjwt.userservice.UserService;
import io.github.BrianKipyegon.springsecurityjwt.userservice.UserServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
    public CommandLineRunner runner(@Autowired UserServiceImplementation userService) {
		return args -> {
			/*userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));

			userService.saveUser(new User(null,  "John", "JJ",  "John@gmail.com", "0000", new ArrayList<Role>()));
			userService.saveUser(new User(null,  "Brian", "Bk",  "Brian@gmail.com", "0000", new ArrayList<Role>()));
			userService.saveUser(new User(null,  "Ray", "Ry",  "Ray@gmail.com", "0000", new ArrayList<Role>()));
			userService.saveUser(new User(null,  "Claire", "CC",  "Claire@gmail.com", "0000", new ArrayList<Role>()));

			userService.addRoleToUser("JJ", "ROLE_USER");
			userService.addRoleToUser("Bk", "ROLE_ADMIN");
			userService.addRoleToUser("Bk", "ROLE_USER");
			userService.addRoleToUser("Ry", "ROLE_USER");
			userService.addRoleToUser("CC", "ROLE_USER");*/
		};

	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return  new BCryptPasswordEncoder();
	}

}
