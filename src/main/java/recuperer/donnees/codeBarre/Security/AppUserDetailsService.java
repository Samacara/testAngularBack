package recuperer.donnees.codeBarre.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import recuperer.donnees.codeBarre.Entity.Users;
import recuperer.donnees.codeBarre.Service.UsersService;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class AppUserDetailsService implements UserDetailsService {
	  @Autowired
	private UsersService usersService;


	public AppUserDetailsService(UsersService usersService) {
		this.usersService = usersService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users utilisateurs = usersService.getUserByUsername(username);
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(utilisateurs.getRole()));
		return new User(utilisateurs.getUsername(), utilisateurs.getPassword(), authorities);
	}
}
