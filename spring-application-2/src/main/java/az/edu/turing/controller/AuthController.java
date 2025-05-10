package az.edu.turing.controller;

import az.edu.turing.dto.*;
import az.edu.turing.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }

    @PostMapping("/logout")
    public void logout(@RequestParam String username) {
        authService.logout(username);
    }

    @PostMapping("/refresh")
    public AuthResponse refresh(@RequestParam String username, @RequestParam String refreshToken) {
        return authService.refreshToken(username, refreshToken);
    }
}
