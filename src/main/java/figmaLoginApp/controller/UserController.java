package figmaLoginApp.controller;

import figmaLoginApp.dto.request.LoginRequest;
import figmaLoginApp.dto.request.RegisterUserRequest;
import figmaLoginApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/register-user")
    public Object registerUser(@RequestBody RegisterUserRequest registerUserRequest){
        return userService.registerNewUser(registerUserRequest);

    }
    @GetMapping("/register-user/login-user")
    public Object loginUser(LoginRequest loginRequest){
        return userService.login(loginRequest);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Integer>> getAllIntegers(){
        List<Integer> list = List.of(1,2,3,4,5,5,6);
        return ResponseEntity.of(Optional.of(list));
    }

}
