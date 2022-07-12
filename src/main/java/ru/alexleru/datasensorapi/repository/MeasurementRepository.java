package ru.alexleru.datasensorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexleru.datasensorapi.entity.dictionary.Measurement;

import java.util.UUID;

public interface MeasurementRepository extends JpaRepository<Measurement, UUID> {
}
