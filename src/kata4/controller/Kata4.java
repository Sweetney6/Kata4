/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.controller;

import kata4.model.Histogram;
import kata4.view.HistogramDisplay;
import kata4.view.MailListReader;

/**
 *
 * @author marc
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> hist = new Histogram<>();
        hist.mapList(MailListReader.read("C:\\Users\\marc\\Documents\\NetBeansProjects\\Kata4\\src\\kata4\\controller\\emails.txt", "@"));
        HistogramDisplay histo = new HistogramDisplay();
        histo.createBarChart(hist);
    }
    
}
