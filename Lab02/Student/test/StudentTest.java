import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void nuovoStudenteTest()  {
        Student nuovo = new Student("Marcello", "WHATisIT");
        Assert.assertEquals("Marcello", nuovo.getFirstName());
        Assert.assertEquals("WHATisIT", nuovo.getLastName());
    }
@Test
    public void registraEsame() {
        Student nuovo = new Student("Marcello", "WHATisIT");
        Exam scienze = new Exam("Science", new GregorianCalendar(2022, 07, 11), 30);
        nuovo.registerExam(scienze);
        Assert.assertEquals("Science", scienze.getTopic());
        Assert.assertEquals(22/07/11, scienze.getDate());
        Assert.assertEquals(30, scienze.getGrade());
    }
@Test
    public void mediaVoti() {
        Student nuovo = new Student("Marcello", "WHATisIT");
        Exam scienze = new Exam("Science", new GregorianCalendar(2022, 07, 11), 30);
        Exam wow = new Exam("Fisica", new GregorianCalendar(2021, 06, 15), 27);
        Exam poo = new Exam("Object Oriented Programming", new GregorianCalendar(2022, 02, 2), 26);
        nuovo.registerExam(scienze);
        nuovo.registerExam(wow);
        nuovo.registerExam(poo);
        double medium = nuovo.computeAverageGrade();
        Assert.assertEquals(27.6, medium);
    }
}