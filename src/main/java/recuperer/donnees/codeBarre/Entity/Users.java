package recuperer.donnees.codeBarre.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class Users extends BaseEntity {
	private String email;
	private String username;
	private  String password;
	private  String role;
}