package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    /*
        - 我们需要测试GradeService中计算平均值的方法，因此只需要定义好需要测试的数据
            通过求平均值方法得到我们预期的结果即可
        - 可以将按照id查询的方法打桩，让其返回固定值

     */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        GradeSystem gradeSystemMock = mock(GradeSystem.class);

        // stub
        when(gradeSystemMock.gradesFor(1)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));

        GradeService gradeService = new GradeService(gradeSystemMock);
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
