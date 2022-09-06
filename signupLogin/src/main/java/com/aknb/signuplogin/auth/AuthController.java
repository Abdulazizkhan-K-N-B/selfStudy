package com.aknb.signuplogin.auth;

import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.aknb.signuplogin.auth.dto.CheckPasswordDto;
import com.aknb.signuplogin.auth.dto.RegistrationDto;
import com.aknb.signuplogin.auth.dto.ResetPasswordDto;
import com.aknb.signuplogin.auth.dto.UpdatePasswordDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody @Valid RegistrationDto request){
        log.info("Request register email: {}", request.getEmail());
        return ResponseEntity.ok(authService.register(request));
    }

    @GetMapping("/confirm")
    public ResponseEntity<Boolean> confirm(@RequestParam(value = "token", required = true) String token){
        log.info("Request confirm token: {}", token);
        return ResponseEntity.ok(authService.confirmToken(token));
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordDto resetPasswordDto){
        log.info("Request reset-password email: {}", resetPasswordDto.getEmail());
        return ResponseEntity.ok(authService.resetPassword(resetPasswordDto));
    }

    @GetMapping("/check-password-token")
    public ResponseEntity<CheckPasswordDto> checkPasswordToken(@RequestParam("token") String token){
        log.info("Request check-password-token: {}", token);
        return ResponseEntity.ok(authService.checkPasswordToken(token));
    }

    @PostMapping("/update-user-password")
    public ResponseEntity<?> updateUserPassword(@RequestBody UpdatePasswordDto updatePasswordDto){
        log.info("Request update-user-password email; {}", updatePasswordDto.getEmail());
        return ResponseEntity.ok(authService.updateUserPassword(updatePasswordDto));
    }
}
