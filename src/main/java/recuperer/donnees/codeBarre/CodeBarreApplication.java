package recuperer.donnees.codeBarre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeBarreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeBarreApplication.class, args);
	}
//
//	@Bean
//	public CommandLineRunner init(KeyboardListener keyboardListener) {
//		return args -> {
//			JFrame frame = new JFrame();
//			frame.addKeyListener(keyboardListener);
//			frame.setVisible(true);
//		};
//	}
}
