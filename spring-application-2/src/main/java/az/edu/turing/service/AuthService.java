package az.edu.turing.service;

import az.edu.turing.dto.*;
import az.edu.turing.entity.Role;
import az.edu.turing.entity.User;
import az.edu.turing.repository.UserRepository;
import az.edu.turing.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;
    private final TokenService tokenService;

    public AuthResponse register(RegisterRequest request) {
        User user = new User();
        user.setUsername(request.username());
        user.setPassword(passwordEncoder.encode(request.password()));
        user.setRole(Role.USER);

        userRepository.save(user);
        return generateTokens(user);
    }

    public AuthResponse login(LoginRequest request) {
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.username(), request.password())
        );

        User user = userRepository.findByUsername(request.username()).orElseThrow();
        return generateTokens(user);
    }

    public void logout(String username) {
        tokenService.deleteRefreshToken(username);
    }

    public AuthResponse refreshToken(String username, String providedToken) {
        String savedToken = tokenService.getRefreshToken(username);

        if (!providedToken.equals(savedToken)) {
            throw new RuntimeException("Invalid refresh token");
        }

        User user = userRepository.findByUsername(username).orElseThrow();
        return generateTokens(user);
    }

    private AuthResponse generateTokens(User user) {
        String access = jwtService.generateToken(user);
        String refresh = jwtService.generateRefreshToken(user);
        tokenService.saveRefreshToken(user.getUsername(), refresh);
        return new AuthResponse(access, refresh);
    }
}
