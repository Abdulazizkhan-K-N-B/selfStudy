package com.aknb.signuplogin.verifToken;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface VerifTokenRepository extends JpaRepository<VerifToken, Long> {

    @Query("SELECT c FROM VerifToken c WHERE c.token = :token")
    Optional<VerifToken> findByToken(@Param("token") String token);
}
