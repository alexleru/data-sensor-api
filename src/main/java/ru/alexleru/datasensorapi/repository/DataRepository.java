package ru.alexleru.datasensorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexleru.datasensorapi.entity.data.Data;

import java.util.UUID;

public interface DataRepository extends JpaRepository<Data, UUID> {


}
