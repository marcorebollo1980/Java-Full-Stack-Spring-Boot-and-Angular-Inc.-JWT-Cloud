package security.jwt;

import org.springframework.stereotype.Component;
import security.UserPrincipal;

@Component
public class JwtProvider implements IjwtProvider{

    @value("${app.jwt.secret}")
    private String JWT_SECRET;


    @value("${app.jwt.expiration-in-ms}")
    private String JWT_EXPIRATION_IN_MS;

    public String generateToken(UserPrincipal auth) {

        return null;
    }
}
