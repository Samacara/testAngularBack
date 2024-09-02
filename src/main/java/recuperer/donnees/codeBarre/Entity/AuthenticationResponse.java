package recuperer.donnees.codeBarre.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
	private String jwtAccessToken;
	private String jwtRefreshToken;
}
