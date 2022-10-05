package com.aknb.signuplogin.email;

public interface EmailSender {

    void send(String to, String buildMail);
}
