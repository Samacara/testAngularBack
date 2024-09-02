package recuperer.donnees.codeBarre.Util;

import org.springframework.stereotype.Service;

@Service
public class JwtUtil {

	public static String SECRET="ephaitos630!";
	public static String   AUTH_HEADER="Authorization";
	public static String   PREFIX= "Bearer";
	public static long   EXPIRE_ACCESS_TOKEN=86400000;
	public static long   EXPIRE_REFRESH_TOKEN=86400000;

}
