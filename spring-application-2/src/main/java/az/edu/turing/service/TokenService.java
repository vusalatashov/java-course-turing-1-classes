package az.edu.turing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final RedisTemplate<String, String> redisTemplate;

    private final Duration REFRESH_TOKEN_TTL = Duration.ofDays(7);

    public void saveRefreshToken(String username, String refreshToken) {
        redisTemplate.opsForValue().set("refresh:" + username, refreshToken, REFRESH_TOKEN_TTL);
    }

    public String getRefreshToken(String username) {
        return redisTemplate.opsForValue().get("refresh:" + username);
    }

    public void deleteRefreshToken(String username) {
        redisTemplate.delete("refresh:" + username);
    }
}
