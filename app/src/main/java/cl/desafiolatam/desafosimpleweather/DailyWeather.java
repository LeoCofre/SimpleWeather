package cl.desafiolatam.desafosimpleweather;

import android.content.Intent;

public class DailyWeather {

    private String ciudad;
    private String fecha;
    private String url;
    private Integer temperatura;
    private String unidad;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public DailyWeather(String ciudad, String fecha, String url, Integer temperatura, String unidad) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.url = url;
        this.temperatura = temperatura;
        this.unidad = unidad;

    }
}
