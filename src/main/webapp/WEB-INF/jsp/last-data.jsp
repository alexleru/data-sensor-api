<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
 <head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
 <link rel=\"icon\" href=\"data:,\">

 <style>

 body {font-size: 250%; text-align: center; font-family: \"Trebuchet MS\", Arial; }
 table { border-collapse: collapse; width:35%; margin-left:auto; margin-right:auto; }
 th { padding: 12px; background-color: #0043af; color: white; }
 tr { border: 1px solid #ddd; padding: 12px; }
 tr:hover { background-color: #bcbcbc; }
 td { border: none; padding: 12px; }
 .sensor {font-weight: bold; padding: 1px; }

  <title>
     Данные датчиков
  </title>
 </style>
 </head>
 <body>
    <h1>ESP32 pin 38 </h1>
    <h2>Последние данные<h2>
 <div>
 <table>
    <tr>
        <th>Показатель</th>
        <th>Значение</th>
    </tr>
    <tr>
        <td>Температура 1-ый этаж</td>
        <td>
           <span class=\"sensor\">
              ${dataSensor.tempDS1820} °C
           </span>
        </td>
    </tr>
    <tr>
        <td>Температура 2-ой этаж</td>
        <td><span class=\"sensor\">
               ${dataSensor.tempDHT11} °C
           </span>
        </td>
    </tr>
        <tr>
           <td>Влажность 2-ой этаж</td>
           <td><span class=\"sensor\">
                 ${dataSensor.humidityDHT11} %
              </span>
           </td>
        </tr>
    </table>
    </div>
    <br/><br/>
 <a href="all_data">Данные за весь период</a>
 </body>
</html>