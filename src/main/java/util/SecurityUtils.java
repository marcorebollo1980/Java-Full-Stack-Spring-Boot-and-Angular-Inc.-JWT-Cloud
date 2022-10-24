package util;

import model.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SecurityUtils {

    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority converToAuthority(String role){

        String formattedRole = role.startsWith(ROLE_PREFIX) ? role: ROLE_PREFIX + role;

        return new SimpleGrantedAuthority(formattedRole);
    }

}
