package ru.alexleru.datasensorapi.entity.enumeration;

public enum UNIT_MEASUREMENT {
    CELSIUS("C°"), HUMIDITY("%");

    private String unit;
    UNIT_MEASUREMENT(String unit){
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
