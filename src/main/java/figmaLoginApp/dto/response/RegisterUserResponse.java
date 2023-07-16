package figmaLoginApp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {
    private String userName;
    private String password;

    public String getMessage() {
        return ("registration successful");
    }


}
