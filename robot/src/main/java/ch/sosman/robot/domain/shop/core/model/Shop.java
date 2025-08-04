package ch.sosman.robot.domain.shop.core.model;

import java.util.HashSet;
import java.util.Set;

public class Shop {
    private final Set<RobotItem> items;

    public Shop() {
        items = new HashSet<>();
    }

    public Set<RobotItem> getItems() {
        return items;
    }

    public void addRobotItem(final RobotItem item) {
        items.add(item);
    }
}