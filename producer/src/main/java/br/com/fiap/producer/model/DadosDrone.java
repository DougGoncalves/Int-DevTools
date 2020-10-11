package br.com.fiap.producer.model;

public class DadosDrone {

  private int idDrone;
  private String latitude;
  private String longitude;
  private int temperatura;
  private int umidade;
  private boolean rastreamento;

  public int getIdDrone() {
    return this.idDrone;
  }

  public void setIdDrone(int idDrone) {
    this.idDrone = idDrone;
  }

  public String getLatitude() {
    return this.latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return this.longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public int getTemperatura() {
    return this.temperatura;
  }

  public void setTemperatura(int temperatura) {
    this.temperatura = temperatura;
  }

  public int getUmidade() {
    return this.umidade;
  }

  public void setUmidade(int umidade) {
    this.umidade = umidade;
  }

  public boolean isRastreamento() {
    return this.rastreamento;
  }

  public boolean getRastreamento() {
    return this.rastreamento;
  }

  public void setRastreamento(boolean rastreamento) {
    this.rastreamento = rastreamento;
  }

  public DadosDrone(int idDrone, String latitude, String longitude, int temperatura, int umidade, boolean rastreamento) {
    this.idDrone = idDrone;
    this.latitude = latitude;
    this.longitude = longitude;
    this.temperatura = temperatura;
    this.umidade = umidade;
    this.rastreamento = rastreamento;
  }

}

  