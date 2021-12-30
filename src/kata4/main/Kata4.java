package kata4.main;

import java.io.FileNotFoundException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import static kata4.view.MailHistogramBuilder.build;
import static kata4.view.MailListReader.read;
import static kata4.view.MailListReaderBD.readBD;

public class Kata4 {
    List<Mail> mailList;
    Histogram<String> histogram;
    

    public static void main(String[] args) throws FileNotFoundException {
        Kata4 kata4 = new Kata4();
        kata4.execute();
    }
    
    private void execute() throws FileNotFoundException{
        input();
        process();
        output();
    }
    
    private void input() throws FileNotFoundException{
        //mailList = read("email/email.txt");
        mailList = readBD();
    }
    
    private void process(){
        histogram = build(mailList);
    }
    
    private void output(){
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}