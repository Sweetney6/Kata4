import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;
  
public class Kata4 {
 
         
    private Histogram<String> hist;
    
    public static void main(String[] args) {
        Histogram<String> hist = new Histogram<>();
        Kata4 kata4 = new Kata4();
        kata4.execute();
        
    }
    
    public void execute() {
        input();
        output();
    }
    
    public void input() {
        hist = new Histogram<>();
        hist.mapList(MailListReader.read("C:/Users/test/Documents/NetBeansProjects/Kata4/src/kata4/controller/emails.txt", "@"));
    }
    
    public void output() {
        HistogramDisplay hd = new HistogramDisplay();
        hd.createBarChart(hist);
    }
    
 }