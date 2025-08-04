package ch.sosman.robot.domain.shop.application;

import ch.sosman.robot.domain.shop.application.model.ShopDto;
import ch.sosman.robot.domain.shop.core.ports.incoming.ShopFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shopitems")
public class ShopController {

  private final ShopPresenter shopPresenter;
  private final ShopFacade shopFacade;

  public ShopController(final ShopPresenter shopPresenter, final ShopFacade shopFacade) {
    this.shopPresenter = shopPresenter;
      this.shopFacade = shopFacade;
  }

  @GetMapping("/")
  public ResponseEntity<ShopDto> retrieveShop() {
    return shopPresenter.presentShop(shopFacade.fetch());
  }

}
