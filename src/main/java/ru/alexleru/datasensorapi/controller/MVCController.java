package ru.alexleru.datasensorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alexleru.datasensorapi.entity.DataSensor;
import ru.alexleru.datasensorapi.service.DataSensorService;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/web")
public class MVCController {

    @Autowired
    DataSensorService dataSensorService;

    @GetMapping("/last_data")
    public String showLastData(Model model) {
        List<DataSensor> dataSensors = dataSensorService.getAllDataSensor();
        Optional<DataSensor> dataSensor = dataSensors.stream().max(Comparator.comparing(DataSensor::getDateTime));
        if(dataSensor.isPresent()) {
            model.addAttribute("dataSensor", dataSensor.get());
            return "last-data";
        } else {
            return "error";
        }
    }

    @GetMapping("/all_data")
    public String showAllData(Model model) {
        List<DataSensor> dataSensors = dataSensorService.getAllDataSensor();
        dataSensors.sort(Comparator.comparing(DataSensor::getDateTime).reversed());
        model.addAttribute("dataSensors", dataSensors);
        return "all-data";
    }

    @GetMapping("/all_data_page")
    public String showAllDataByPage(Model model) {
        List<DataSensor> dataSensors = dataSensorService.getAllDataSensorByPage();
        model.addAttribute("dataSensors", dataSensors);
        return "all-data";
    }

}
