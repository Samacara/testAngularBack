package recuperer.donnees.codeBarre.Service;

import recuperer.donnees.codeBarre.Entity.Users;

import java.util.List;

public interface UsersService {

	public List<Users> getAllUsers();

	public Users saveUsers(Users users);

	public Users updateUsers(Users users, Integer idUsers);

	public Users getOneUser(Integer idUsers);

	public  Users getUserByUsername(String Username);

	public void deleteUsers(Integer idUsers);
}
