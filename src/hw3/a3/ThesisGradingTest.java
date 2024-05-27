package hw3.a3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThesisGradingTest {

    private static ThesisGrading tg = new ThesisGrading();
    @BeforeAll
    public static void setup() {
        tg = new ThesisGrading();
    }
    @Test
    public void gradeTest1() throws NoSuchGradeException, ThirdExaminerNeededException {
        assertDoesNotThrow(() -> tg.calculcateFinalGrade(1.0, 2.0, 0.0));
        assertEquals(1.5,tg.calculcateFinalGrade(1.0, 2.0, 0.0));
    }

    @Test
    public void gradeTest2() {
        assertThrows(NoSuchGradeException.class, () -> tg.calculcateFinalGrade(0.0,3.0,0.0));
    }

    @Test
    public void gradeTest3() {
        assertThrows(ThirdExaminerNeededException.class, () -> tg.calculcateFinalGrade(1.0,5.0,0.0));
    }

    @Test
    public void gradeTest4() throws NoSuchGradeException, ThirdExaminerNeededException {
        assertEquals(2.15, tg.calculcateFinalGrade(1.0,5.0,3.3));
    }

}