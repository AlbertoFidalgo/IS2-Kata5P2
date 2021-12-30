package kata4.view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import kata4.model.Mail;

public class MailListReader {
    
    public static List<Mail> read(String filename) throws FileNotFoundException{
        Scanner scanner = new Scanner(new FileReader("email/email.txt"));
        List<Mail> mailList = new ArrayList<>(); 
        while(scanner.hasNext()){
            String string = scanner.next();
            if(string.contains("@")){
                mailList.add(new Mail(string));
            }
        }
        
        return mailList;   
    }
    
    
}
