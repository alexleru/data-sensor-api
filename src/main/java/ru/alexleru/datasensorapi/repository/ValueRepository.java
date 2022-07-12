package ru.alexleru.datasensorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexleru.datasensorapi.entity.data.Value;

import java.util.UUID;

public interface ValueRepository extends JpaRepository<Value, UUID> {
}
