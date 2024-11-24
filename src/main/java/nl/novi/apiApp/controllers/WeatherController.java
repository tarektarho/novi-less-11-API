package nl.novi.apiApp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @GetMapping("/api/weather/current")
    public String getCurrentWeather() {
        return "Sunny in Amsterdam";
    }

    private String normalizeCity(String city) {
        return city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();
    }

    private String getWeatherWithNormalizedCityName(String city) {
        city = normalizeCity(city);
        return switch (city) {
            case "Amsterdam" -> "Sunny in " + city;
            case "Rotterdam" -> "Rainy in " + city;
            case "Utrecht" -> "Cloudy in " + city;
            case "Eindhoven" -> "Snowy in " + city;
            case "Groningen" -> "Windy in " + city;
            case "Tilburg" -> "Foggy in " + city;
            case "Almere" -> "Hail in " + city;
            case "Breda" -> "Thunderstorm in " + city;
            case "Nijmegen" -> "Tornado in " +city;
            case "The hauge" -> "Hurricane in " + city;
            default -> "City provided is not Dutch city";
        };
    }

    @GetMapping("/api/weather/current/{city}")
    public String getCurrentWeatherByCity(@PathVariable String city) {
        return getWeatherWithNormalizedCityName(city);
    }

    @RequestMapping(value = "/api/weather/current", params = {"lat", "lon"})
    public String getCurrentWeatherByCoordinates(@RequestParam double lat, @RequestParam double lon) {
        if (lat < -90 || lat > 90) {
            return "Latitude must be between -90 and 90";
        }

        return "Sunny at " + lat + " latitude and " + lon + " longitude";
    }
}
