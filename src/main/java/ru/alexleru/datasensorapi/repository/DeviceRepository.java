package ru.alexleru.datasensorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexleru.datasensorapi.entity.dictionary.Device;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
