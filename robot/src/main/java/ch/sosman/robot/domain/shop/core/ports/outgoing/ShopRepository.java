package ch.sosman.robot.domain.shop.core.ports.outgoing;

import ch.sosman.robot.domain.shop.core.model.Shop;

import java.util.Optional;

public interface ShopRepository {
   Shop retrieveShop();
}