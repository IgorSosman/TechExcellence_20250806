package ch.sosman.robot.domain.shop.application;

import static org.junit.jupiter.api.Assertions.*;

import ch.sosman.robot.domain.shop.core.ShopProvider;
import ch.sosman.robot.domain.shop.core.model.Shop;
import ch.sosman.robot.domain.shop.core.ports.incoming.ShopFacade;
import ch.sosman.robot.domain.shop.core.ports.outgoing.ShopRepository;
import ch.sosman.robot.domain.shop.infrastructure.RobotItemDb;
import ch.sosman.robot.domain.shop.infrastructure.ShopDbAdapter;
import ch.sosman.robot.domain.shop.infrastructure.model.RobotItemDbEntity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.mockito.Mockito;

public class ShopTest {

  private ShopFacade shopService;
  private Shop shop = null;

  @Given("the robot shop is available")
  public void createShop() {

    final var robotItem = new RobotItemDbEntity();
    robotItem.setCategory("Test");
    robotItem.setDescription("This is a test item");
    robotItem.setName("Test item");
    robotItem.setImageName("TestImageName");
    robotItem.setId(1L);
    robotItem.setPrice(20.02);
    robotItem.setPrice(0.02);

    final RobotItemDb db = Mockito.mock(RobotItemDb.class);
    Mockito.when(db.findAll()).thenReturn(List.of(robotItem));

    final ShopRepository shopRepository = new ShopDbAdapter(db);
    shopService = new ShopProvider(shopRepository);
  }

  @When("I request the list of robot parts")
  public void requestRobotParts() {
    shop = shopService.fetch();
    assertNotNull(shop);
  }

  @Then("I receive a list of robot parts")
  public void verifyListOfRobotPartsReceived() {
    assertNotNull(shop.getItems());
    assertFalse(
        shop.getItems().isEmpty(),
        "The list of parts is empty! It should contain at least one robot part");
  }

  @Then("each part has a name")
  public void eachPartHasAName() {
    shop.getItems()
        .forEach(
            item -> {
              assertNotNull(item);
              assertNotNull(item.name());
            });
  }
}
