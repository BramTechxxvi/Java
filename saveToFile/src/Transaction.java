import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private String sender;
    private String recipient;
    @JsonSerialize(using = TransactionDateSerializer.class)
    private LocalDate date;
    private BigDecimal amount;



}
