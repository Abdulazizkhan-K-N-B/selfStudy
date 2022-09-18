package com.aknb.signuplogin.auth;

import com.aknb.signuplogin.auth.dto.CheckPasswordDto;
import com.aknb.signuplogin.auth.dto.RegistrationDto;
import com.aknb.signuplogin.auth.dto.ResetPasswordDto;
import com.aknb.signuplogin.auth.dto.UpdatePasswordDto;
import com.aknb.signuplogin.email.EmailSender;
import com.aknb.signuplogin.user.User;
import com.aknb.signuplogin.user.UserService;
import com.aknb.signuplogin.verifToken.VerifToken;
import com.aknb.signuplogin.verifToken.VerifTokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Service
@Slf4j
public class AuthService {

    @Value("${site.url}")
    private String url;

    private final UserService userService;
    private final EmailSender emailSender;
    private final VerifTokenService verifTokenService;

    public AuthService(UserService appUserService,
            EmailSender emailSender,
            VerifTokenService verifTokenService) {

        this.verifTokenService = verifTokenService;
        this.userService = appUserService;
        this.emailSender = emailSender;
    }

    public String register(RegistrationDto request) {

        User user = new User(
                request.getFirstname(),
                request.getLastname(),
                request.getEmail(),
                request.getPassword());

        String token = userService.signUp(user);

        String link = String.format("%s%s", this.url, token);

        emailSender.send(
        request.getEmail(),
        buildEmail(request.getFirstname(), link));

        return token;
    }

    @Transactional
    public Boolean confirmToken(String token) {

        VerifToken verifToken = verifTokenService.getVerifTokenByToken(token);

        if (verifToken == null) {
            throw new IllegalStateException("Invalid token.");
        }

        if (verifToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        if (verifToken.getExpiresAt().isBefore(LocalDateTime.now())) {

            throw new IllegalStateException("Confirmation token is expired!");
        }

        verifTokenService.setConfirmedAt(verifToken);
        userService.enableAppUser(verifToken.getUser());
        log.info("Confirmed user email: {}", verifToken.getUser().getEmail());
        return true;
    }

    public String resetPassword(ResetPasswordDto resetPasswordDto) {
        User user = userService.getUserByEmail(resetPasswordDto.getEmail());

        String token = verifTokenService.createNewVerifToken(user);

        // String link = String.format("%s%s", this.url, token);

        // emailSender.send(user.getEmail(), buildEmail(user.getFirstname(), link));

        return token;
    }

    public CheckPasswordDto checkPasswordToken(String token) {

        VerifToken verifToken = verifTokenService.getVerifTokenByToken(token);

        if (verifToken.getExpiresAt().isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("Token is expired!");
        }

        return new CheckPasswordDto(
                verifToken.getUser().getEmail(),
                verifToken.getUser().getPassword());
    }

    public Object updateUserPassword(UpdatePasswordDto updatePasswordDto) {

        userService.getUserByEmail(updatePasswordDto.getEmail());

        
        
        return null;
    }

    // |- SECONDARY FUNCTIONS -|

    private String buildEmail(String name, String link) {
        return "<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:16px;margin:0;color:#0b0c0c\">\n" +
                "\n" +
                "<span style=\"display:none;font-size:1px;color:#fff;max-height:0\"></span>\n" +
                "\n" +
                "  <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;min-width:100%;width:100%!important\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td width=\"100%\" height=\"53\" bgcolor=\"#0b0c0c\">\n" +
                "        \n" +
                "        <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;max-width:580px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n"
                +
                "          <tbody><tr>\n" +
                "            <td width=\"70\" bgcolor=\"#0b0c0c\" valign=\"middle\">\n" +
                "                <table role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n"
                +
                "                  <tbody><tr>\n" +
                "                    <td style=\"padding-left:10px\">\n" +
                "                  \n" +
                "                    </td>\n" +
                "                    <td style=\"font-size:28px;line-height:1.315789474;Margin-top:4px;padding-left:10px\">\n"
                +
                "                      <span style=\"font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block\">Confirm your email</span>\n"
                +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "              </a>\n" +
                "            </td>\n" +
                "          </tr>\n" +
                "        </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td width=\"10\" height=\"10\" valign=\"middle\"></td>\n" +
                "      <td>\n" +
                "        \n" +
                "                <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n"
                +
                "                  <tbody><tr>\n" +
                "                    <td bgcolor=\"#1D70B8\" width=\"100%\" height=\"10\"></td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\" height=\"10\"></td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n"
                +
                "    <tbody><tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "      <td style=\"font-family:Helvetica,Arial,sans-serif;font-size:19px;line-height:1.315789474;max-width:560px\">\n"
                + "        \n" +
                "            <p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\">Hi " + name
                + ",</p><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\"> Thank you for registering. Please click on the below link to activate your account: </p><blockquote style=\"Margin:0 0 20px 0;border-left:10px solid #b1b4b6;padding:15px 0 0.1px 15px;font-size:19px;line-height:25px\"><p style=\"Margin:0 0 20px 0;font-size:19px;line-height:25px;color:#0b0c0c\"> <a href=\""
                + link + "\">Activate Now</a> </p></blockquote>\n Link will expire in 15 minutes. <p>See you soon</p>" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td height=\"30\"><br></td>\n" +
                "    </tr>\n" +
                "  </tbody></table><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "\n" +
                "</div></div>";
    }
}