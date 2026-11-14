package in.saha.JWTAuthentication.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequestDto {
    private String username;

    private String password;
}
