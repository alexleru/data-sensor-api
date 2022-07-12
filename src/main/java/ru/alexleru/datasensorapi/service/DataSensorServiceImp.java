package ru.alexleru.datasensorapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.alexleru.datasensorapi.entity.DataSensor;
import ru.alexleru.datasensorapi.entity.data.Data;
import ru.alexleru.datasensorapi.entity.data.Value;
import ru.alexleru.datasensorapi.entity.dictionary.Device;
import ru.alexleru.datasensorapi.repository.DataRepository;
import ru.alexleru.datasensorapi.repository.DataSensorRepository;
import ru.alexleru.datasensorapi.repository.DeviceRepository;
import ru.alexleru.datasensorapi.repository.MeasurementRepository;

import java.util.List;

@Service
public class DataSensorServiceImp implements DataSensorService {
    @Autowired
    private DataSensorRepository dataSensorRepository;
    @Autowired
    private DataRepository dataRepository;
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private MeasurementRepository measurementRepository;


    @Override
    public List<DataSensor> getAllDataSensor() {
        return dataSensorRepository.findAll(Sort.by("dateTime").descending());
    }

    @Override
    public List<DataSensor> getAllDataSensorByPage() {
        Pageable page = PageRequest.of(0, 2, Sort.Direction.DESC, "dateTime");
        return dataSensorRepository.findAll(page).getContent();
    }

    @Override
    public void saveDataSensor(DataSensor dataSensor) {
        dataSensorRepository.save(dataSensor);
    }

    @Override
    public void saveData(Data data) {
        for (Value value : data.getValues()) {
            var measurement = measurementRepository.findById(value.getMeasurementUuid2());
            value.setMeasurement(measurement.get());
            value.setData(data);
        }

        data.setValues(data.getValues());
        dataRepository.save(data);
    }

    @Override
    public void saveAllData(List<Data> dataList) {
        for (Data data : dataList) {
            for (Value value : data.getValues()) {
                var measurement = measurementRepository.findById(value.getMeasurementUuid2());
                value.setMeasurement(measurement.get());
                value.setData(data);
            }
            data.setValues(data.getValues());
        }
        dataRepository.saveAll(dataList);
    }

    @Override
    public List<Data> getAllData() {
        return dataRepository.findAll();
    }

    @Override
    public List<Device> getAllDevice() {
        return deviceRepository.findAll();
    }

    @Override
    public List<Data> getLastData() {
        return dataRepository.findAll();
    }


}
