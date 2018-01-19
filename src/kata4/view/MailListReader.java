
package kata4.view;

import java.util.List;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MailListReader {
    
    public static List<String> read (String path, String pattern) {
        List<String> domains = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path).toAbsolutePath())) {
            domains.addAll(stream.collect(Collectors.toList()));
        } catch (IOException e) {
            System.out.println("Exect");
        }
        System.out.println("domains -->"+domains.get(0).split(pattern)[1]);
        domains=domains.stream().filter(s->s.contains(pattern)).map(s -> (s.split(pattern))[1]).collect(Collectors.toList());
        //System.out.println(domains);
        return domains;
    }
}