package recuperer.donnees.codeBarre.Controller.Api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recuperer.donnees.codeBarre.Entity.Users;

public interface UsersApi {

	@PostMapping("/utilisateur/connexion/ghx")
	public ResponseEntity<Object> saveUsers(@RequestBody Users users);

	@PutMapping("/api/v1/users/{idUsers}")
	public ResponseEntity<Object> updateUsers(@RequestBody  Users users, @PathVariable(value = "idUsers") Integer idUsers);

	@GetMapping("/api/v1/users/{idUsers}")
	public ResponseEntity<Object> getOneUser(@PathVariable(value = "idUsers") Integer idUsers);

	@GetMapping("api/v1/users")
	public ResponseEntity<Object> getAllUsers();

	@DeleteMapping("/api/v1/users/{idUsers}")
	public void deleteOneUser(@PathVariable(value = "idUsers") Integer idUsers);
}
