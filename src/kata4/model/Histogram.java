/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author marc
 * @param <T>
 */
public class Histogram<T> {
    private final Map<T, Integer> map;
    
    public Histogram () {
        map = new TreeMap<>();
    }
    
    public void mapList (List<T> list) {
        for(T str:list) {
            if (map.containsKey(str)) continue;
            Integer times = (int) list.stream().filter(s -> s.equals(str)).count();
            map.put(str, times);
        }
    }
    
    public boolean put (T key, int times) {
        if (map.containsKey(key)) return false;
        map.put(key, times);
        return true;
    }
    
    public DefaultCategoryDataset getHistogram() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 

        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            dataset.addValue(entry.getValue(), "", (Comparable)entry.getKey());
        }
        return dataset;
    } 
}
