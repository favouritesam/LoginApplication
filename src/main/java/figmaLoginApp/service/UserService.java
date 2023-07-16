package figmaLoginApp.service;

import figmaLoginApp.data.models.User;
import figmaLoginApp.dto.request.LoginRequest;
import figmaLoginApp.dto.request.RegisterUserRequest;
import figmaLoginApp.dto.response.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerNewUser(RegisterUserRequest registerUserRequest);
    RegisterUserResponse login(LoginRequest loginRequest);
    User findUser(String password);
}
