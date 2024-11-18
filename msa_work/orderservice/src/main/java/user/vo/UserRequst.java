package user.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequst {

    private  Long id;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    private String userId;

    private String name;

//    @NotNull(message = "Password cannot be null")
//    @Size(min = 8, message = "Password must be at least 8 characters")
}
