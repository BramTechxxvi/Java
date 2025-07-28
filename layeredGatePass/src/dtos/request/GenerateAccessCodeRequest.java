package dtos.request;

import java.time.LocalDateTime;

public class GenerateAccessCodeRequest {

    private String id;
    private String accessCode;
    private final LocalDateTime timeCreated = LocalDateTime.now();
    private LocalDateTime expiryTime = timeCreated.plusHours(5);

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(LocalDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }
}
