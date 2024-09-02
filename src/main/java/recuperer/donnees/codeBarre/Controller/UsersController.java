package recuperer.donnees.codeBarre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import recuperer.donnees.codeBarre.Controller.Api.UsersApi;
import recuperer.donnees.codeBarre.Entity.Users;
import recuperer.donnees.codeBarre.Service.UsersService;

@RestController
public class UsersController implements UsersApi {

	private UsersService usersService;
	@Autowired
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}

	@Override
	public ResponseEntity<Object> saveUsers(Users users) {
		return ResponseEntity.ok().body(usersService.saveUsers(users));
	}

	@Override
	public ResponseEntity<Object> updateUsers(Users users, Integer idUsers) {
		return ResponseEntity.ok().body(usersService.updateUsers(users, idUsers));
	}

	@Override
	public ResponseEntity<Object> getOneUser(Integer idUsers) {
		return ResponseEntity.ok().body(usersService.getOneUser(idUsers));
	}

	@Override
	public ResponseEntity<Object> getAllUsers() {
		return ResponseEntity.ok().body(usersService.getAllUsers());
	}

	@Override
	public void deleteOneUser(Integer idUsers) {
		usersService.deleteUsers(idUsers);

	}
}
