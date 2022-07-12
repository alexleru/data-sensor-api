package ru.alexleru.datasensorapi.service;

import ru.alexleru.datasensorapi.entity.DataSensor;
import ru.alexleru.datasensorapi.entity.data.Data;
import ru.alexleru.datasensorapi.entity.dictionary.Device;

import java.util.List;

public interface DataSensorService {
    List<DataSensor> getAllDataSensor();
    List<DataSensor> getAllDataSensorByPage();
    void saveDataSensor(DataSensor dataSensor);

    void saveData(Data data);
    void saveAllData(List<Data> dataList);
    List<Data> getAllData();
    List<Data> getLastData();

    List<Device> getAllDevice();
}
