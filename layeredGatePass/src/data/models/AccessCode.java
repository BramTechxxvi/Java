package data.models;

import java.time.LocalDateTime;

public class AccessCode {

    private String id;
    private String code;
    private LocalDateTime timeCreated;
    private LocalDateTime timeUpdated;
    private LocalDateTime expiryTime;
}
