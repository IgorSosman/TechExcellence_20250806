package ch.sosman.robot.domain.shop.application.model;

import java.util.HashSet;
import java.util.Set;

public class ShopDto {

  private final Set<RobotItemDto> robotItemDtos;

  public ShopDto() {
    robotItemDtos = new HashSet<>();
  }

  public void addRobotItem(final RobotItemDto robotItemDto) {
    robotItemDtos.add(robotItemDto);
  }

  public Set<RobotItemDto> getRobotItems() {
    return robotItemDtos;
  }
}
