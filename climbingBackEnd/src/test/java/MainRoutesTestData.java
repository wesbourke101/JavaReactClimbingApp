import com.climbingApp.climbingBackEnd.MainRoutes.MainRoutes;
import com.climbingApp.climbingBackEnd.MainRoutes.MainRoutesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class MainRoutesTestData {

    @Autowired
    private MainRoutesRepository mainRoutesRepository;

    public void createTestData() {
        MainRoutes mainRoute1 = new MainRoutes();
        mainRoute1.setRouteName("Test route 1");
        mainRoute1.setHeightOfClimb(100);
        mainRoute1.setGradeOfClimb(5.9);
        mainRoute1.setDescriptionOfAscent("A fun climb");
        mainRoute1.setGearId(1);
        mainRoute1.setUserId(1);
        mainRoute1.setClimbCompleted(true);
        mainRoutesRepository.save(mainRoute1);

        MainRoutes mainRoute2 = new MainRoutes();
        mainRoute2.setRouteName("Test route 2");
        mainRoute2.setHeightOfClimb(200);
        mainRoute2.setGradeOfClimb(5.10);
        mainRoute2.setDescriptionOfAscent("A challenging climb");
        mainRoute2.setGearId(2);
        mainRoute2.setUserId(2);
        mainRoute2.setClimbCompleted(false);
        mainRoutesRepository.save(mainRoute2);

        // Add more test data as needed
    }
}
