package ch.sosman.robot.domain.shop.infrastructure.model;

import ch.sosman.robot.domain.shop.core.model.RobotItem;

public class RobotItemMapper {
  public static RobotItem to(final RobotItemDbEntity itemDb) {
    return new RobotItem(
        itemDb.getName(),
        itemDb.getDescription(),
        itemDb.getCategory(),
        itemDb.getImageName(),
        itemDb.getPrice(),
        itemDb.getDiscount());
  }
}
