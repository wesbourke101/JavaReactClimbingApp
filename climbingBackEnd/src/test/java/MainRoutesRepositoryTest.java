import com.climbingApp.climbingBackEnd.MainRoutes.MainRoutesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MainRoutesRepositoryTest {

    @Autowired
    private MainRoutesRepository mainRoutesRepository;

    @Autowired
    private MainRoutesTestData mainRoutesTestData;

    @Test
    public void testFindAll() {
        mainRoutesTestData.createTestData();

        // Run your tests here
    }

    // Add more test methods as needed
}





