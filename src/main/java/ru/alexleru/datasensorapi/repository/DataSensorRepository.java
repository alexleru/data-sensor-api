package ru.alexleru.datasensorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexleru.datasensorapi.entity.DataSensor;


public interface DataSensorRepository extends JpaRepository<DataSensor, Integer> {


}
