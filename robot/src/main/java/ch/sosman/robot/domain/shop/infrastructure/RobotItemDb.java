package ch.sosman.robot.domain.shop.infrastructure;

import ch.sosman.robot.domain.shop.infrastructure.model.RobotItemDbEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RobotItemDb extends JpaRepository<RobotItemDbEntity, Long> {}
