package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        List<Double> doubles = Arrays.asList(80.0, 90.0, 100.0);

        GradeService gradeService = new GradeService(new GradeSystemMock(doubles));
        double result = gradeService.calculateAverageGrades(1);

        Assertions.assertEquals(90.0, result);
    }
}
