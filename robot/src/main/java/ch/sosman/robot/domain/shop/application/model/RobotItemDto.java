package ch.sosman.robot.domain.shop.application.model;

public record RobotItemDto(
    String name,
    String description,
    String category,
    String imageName,
    double price,
    double discount) {}
