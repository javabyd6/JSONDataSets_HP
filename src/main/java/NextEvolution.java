import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author perczynski
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextEvolution {
    private List<Evolution> nextEvolutions;
    private String num;
    private String name;



}
