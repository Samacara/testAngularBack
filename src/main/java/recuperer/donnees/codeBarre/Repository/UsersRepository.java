package recuperer.donnees.codeBarre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recuperer.donnees.codeBarre.Entity.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByUsername(String username);
}
