package recuperer.donnees.codeBarre.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import recuperer.donnees.codeBarre.Entity.Users;
import recuperer.donnees.codeBarre.Repository.UsersRepository;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {

	private final PasswordEncoder passwordEncoder;
	private UsersRepository usersRepository;

	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
		this.usersRepository = usersRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<Users> getAllUsers() {
		return List.of();
	}

	@Override
	public Users saveUsers(Users users) {
		users.setPassword(passwordEncoder.encode(users.getPassword()));
		return usersRepository.save(users);
	}

	@Override
	public Users updateUsers(Users users, Integer idUsers) {
		if (idUsers == null) {
			return null;
		}
		Users foundUsers = usersRepository.findById(idUsers).get();
		foundUsers.setId(users.getId());
		foundUsers.setEmail(users.getEmail());
		foundUsers.setUsername(users.getUsername());
		foundUsers.setRole(users.getRole());
		foundUsers.setPassword(passwordEncoder.encode(users.getPassword()));

		return usersRepository.save(foundUsers);
}

	@Override
	public Users getOneUser(Integer idUsers) {
		if (idUsers == null) {
			return null;
		}
		return usersRepository.findById(idUsers).get();
	}

	@Override
	public Users getUserByUsername(String username) {
		if (username == null) {
			return null;
		}
		return usersRepository.findByUsername(username).get();
	}

	@Override
	public void deleteUsers(Integer idUsers) {

	}
}
