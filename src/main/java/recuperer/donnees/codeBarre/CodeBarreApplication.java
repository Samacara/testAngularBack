package recuperer.donnees.codeBarre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CodeBarreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeBarreApplication.class, args);
	}

	@Bean
	//encodage des mot de passe
	PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}
