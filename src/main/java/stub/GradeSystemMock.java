package stub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeSystemMock extends GradeSystem {


    List<Double> doubles;

    public GradeSystemMock(List<Double> doubles) {
        this.doubles = doubles;
    }

    public List<Double> gradesFor(long studentId) {
        return doubles;
    }
}
