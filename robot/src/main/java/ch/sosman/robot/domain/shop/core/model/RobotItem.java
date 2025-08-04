package ch.sosman.robot.domain.shop.core.model;

public record RobotItem(
    String name,
    String description,
    String category,
    String imageName,
    double price,
    double discount) {}
