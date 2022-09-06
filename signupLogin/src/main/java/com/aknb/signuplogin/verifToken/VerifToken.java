package com.aknb.signuplogin.verifToken;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import com.aknb.signuplogin.user.User;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class VerifToken {

        @Id
        @SequenceGenerator(name = "confirmation_token_sequence", sequenceName = "confirmation_token_sequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "confirmation_token_sequence")
        private Long id;

        @Column(name = "token", nullable = false, length = 64)
        private String token;

        @Column(name = "created_at", nullable = false)
        private LocalDateTime createdAt;

        @Column(name = "expires_at", nullable = false)
        private LocalDateTime expiresAt;

        @Column(name = "confirmed_at")
        private LocalDateTime confirmedAt;

        @ManyToOne
        @JoinColumn(nullable = false, name = ("user_id"))
        private User user;

        public VerifToken(String token,
                        LocalDateTime createdAt,
                        LocalDateTime expiresAt,
                        User user) {

                this.token = token;
                this.createdAt = createdAt;
                this.expiresAt = expiresAt;
                this.user = user;
        }

        public VerifToken(){

        }
}
