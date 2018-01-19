package kata4.view;
import java.awt.Color;
import kata4.model.Histogram;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;


public class HistogramDisplay  {
    
    
    public void createBarChart (Histogram histo) {
        JFreeChart chart = ChartFactory.createBarChart("Statistic", "Emails", "Average", histo.getHistogram(), PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar Chart for emails", chart);
        frame.setVisible(true);
        frame.setSize(1000, 1000);
    }
    
}