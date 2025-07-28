package chapter15.src.chapter15;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private String sender;
    private String recipient;
    private LocalDateTime date;
    private BigDecimal amount;

    public Transactions(String sender, String recipient, BigDecimal amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.date =  LocalDateTime.now();
        this.amount = amount;
    }




    public String saveTransactions(String path,List<Transactions> transactions){
        String createdFile = "";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(path)))) {

            for (Transactions transaction : transactions) {
                writer.write(transaction.toString());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
