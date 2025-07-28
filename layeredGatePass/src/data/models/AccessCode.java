package data.models;

import java.time.LocalDateTime;

public class AccessCode {

    private String id;
    private String code;
    private final LocalDateTime timeCreated = LocalDateTime.now();
    private LocalDateTime expiryTime = timeCreated.plusHours(5);
    private Resident resident;
    private Visitor visitor;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public LocalDateTime getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(LocalDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }
}
