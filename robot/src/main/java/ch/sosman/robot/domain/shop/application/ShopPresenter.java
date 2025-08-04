package ch.sosman.robot.domain.shop.application;

import ch.sosman.robot.domain.shop.application.model.RobotItemDtoMapper;
import ch.sosman.robot.domain.shop.application.model.ShopDto;
import ch.sosman.robot.domain.shop.core.model.RobotItem;
import ch.sosman.robot.domain.shop.core.model.Shop;
import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ShopPresenter {
  public ResponseEntity<ShopDto> presentShop(final Shop shop) {

    final Set<RobotItem> robotItems = shop.getItems();

    if (robotItems.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    final ShopDto shopDto = new ShopDto();

    robotItems.forEach(
        robotItem -> shopDto.addRobotItem(RobotItemDtoMapper.from(robotItem)));

    return ResponseEntity.ok(shopDto);
  }
}
