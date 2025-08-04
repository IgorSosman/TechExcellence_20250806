package ch.sosman.robot.domain.shop.core.ports.incoming;

import ch.sosman.robot.domain.shop.core.model.Shop;

public interface ShopFacade {
  Shop fetch();
}
