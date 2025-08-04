package ch.sosman.robot.domain.shop.core;
import ch.sosman.robot.domain.shop.application.ShopPresenter;
import ch.sosman.robot.domain.shop.core.model.Shop;
import ch.sosman.robot.domain.shop.core.ports.outgoing.ShopRepository;
import org.springframework.stereotype.Service;
import ch.sosman.robot.domain.shop.core.ports.incoming.ShopFacade;

import java.util.Optional;

@Service
public class ShopProvider implements ShopFacade{

  private final ShopRepository shopRepository;

     public ShopProvider(final ShopRepository shopRepository) {
         this.shopRepository = shopRepository;
     }


 @Override
 public Shop fetch() {
  return shopRepository.retrieveShop();
 }
}