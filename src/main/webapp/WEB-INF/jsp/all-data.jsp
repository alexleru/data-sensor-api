<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
 <head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">
 <link rel=\"icon\" href=\"data:,\">

 <style>
 body {font-size: 250%; text-align: center; font-family: \"Trebuchet MS\", Arial;}
 table { border-collapse: collapse; width:35%; margin-left:auto; margin-right:auto; }
 th { padding: 12px; background-color: #0043af; color: white; }
 tr { border: 1px solid #ddd; padding: 12px; }
 tr:hover { background-color: #bcbcbc; }
 td { border: none; padding: 12px; }
 </style>
 <title>
    Данные датчиков
 </title>
 </head>
  <body>
    <h1>ESP32 pin 38</h1>
    <h2>Данные за весь период</h2>
    <div>
      <table border="1">
        <tr>
          <th>Дата и время</th>
          <th>Температура 1-ый этаж</th>
          <th>Температура 2-ой этаж</th>
          <th>Влажность 2-ой этаж</th>
        </tr>
        <c:forEach  items="${dataSensors}" var ="dataSensor">
        <tr>
          <td>${dataSensor.getFormatterDate()}</td>
          <td>${dataSensor.tempDS1820} °C</td>
          <td>${dataSensor.tempDHT11} °C</td>
          <td>${dataSensor.humidityDHT11} %</td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <br/><br/>
     <a href="last_data">Последние данные</a>
  </body>

</html>