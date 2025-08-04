package ch.sosman.robot.domain.shop.infrastructure;

import ch.sosman.robot.domain.shop.core.model.Shop;
import ch.sosman.robot.domain.shop.core.ports.outgoing.ShopRepository;
import ch.sosman.robot.domain.shop.infrastructure.model.RobotItemMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ShopDbAdapter implements ShopRepository {

  private final RobotItemDb db;

  public ShopDbAdapter(final RobotItemDb db) {
    this.db = db;
  }

  @Override
  public Shop retrieveShop() {
    final Shop shop = new Shop();
    db.findAll().forEach(item -> shop.addRobotItem(RobotItemMapper.to(item)));
    return shop;
  }
}
