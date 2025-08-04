package ch.sosman.robot.domain.shop.application.model;

import ch.sosman.robot.domain.shop.core.model.RobotItem;

public class RobotItemDtoMapper {

  private RobotItemDtoMapper() {}

  public static RobotItemDto from(final RobotItem robotItem) {
    return new RobotItemDto(
        robotItem.name(),
        robotItem.description(),
        robotItem.category(),
        robotItem.imageName(),
        robotItem.price(),
        robotItem.discount());
  }
}
