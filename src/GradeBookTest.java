import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

public class GradeBookTest {

    private GradeBook gradeBook;

    @Test
    public void createGradeBook(){
        gradeBook = new GradeBook();
        assertNotNull(gradeBook);
    }

}
