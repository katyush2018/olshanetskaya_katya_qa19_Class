import org.testng.annotations.Test;

public class BoardCreationTest extends  TestBase{

  @Test
  public void createBoardTest() throws InterruptedException {
    initBoardCreationFromHeader();
    typeBoardName();
    submitBoardCreation();
  }

}
