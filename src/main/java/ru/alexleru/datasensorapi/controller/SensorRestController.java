package ru.alexleru.datasensorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.alexleru.datasensorapi.entity.DataSensor;
import ru.alexleru.datasensorapi.entity.data.Data;
import ru.alexleru.datasensorapi.entity.dictionary.Device;
import ru.alexleru.datasensorapi.service.DataSensorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SensorRestController {

    @Autowired
    DataSensorService dataSensorService;


    @GetMapping("/data")
    public List<DataSensor> getAllDataSensor() {
        List<DataSensor> dataSensors = dataSensorService.getAllDataSensor();
        return dataSensors;
    }

    @PostMapping("/data")
    public void saveDataSensor(@RequestBody DataSensor dataSensor) {
        dataSensorService.saveDataSensor(dataSensor);
        System.out.println(dataSensor);
    }

    @GetMapping("/data2")
    public List<Data> getAllData() {
        return  dataSensorService.getAllData();
    }

    @PostMapping("/data2")
    public void saveData(@RequestBody Data data){
        dataSensorService.saveData(data);
        System.out.println(data);
    }

    @PostMapping("/dataList")
    public void saveAllData(@RequestBody List<Data> dataList){
        dataSensorService.saveAllData(dataList);
    }

    @GetMapping("/device")
    public List<Device> getAllDevice() {
        return dataSensorService.getAllDevice();
    }

}
