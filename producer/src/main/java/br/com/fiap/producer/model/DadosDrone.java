package br.com.fiap.producer.model;

public class DadosDrone {

  private int idDrone;
  private String latitude;
  private String longitude;
  private int temperaturaAr;
  private int umidadeAr;
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

  public int getTemperaturaAr() {
    return this.temperaturaAr;
  }

  public void setTemperaturaAr(int temperaturaAr) {
    this.temperaturaAr = temperaturaAr;
  }

  public int getUmidadeAr() {
    return this.umidadeAr;
  }

  public void setUmidadeAr(int umidadeAr) {
    this.umidadeAr= umidadeAr;
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

  public DadosDrone(int idDrone, String latitude, String longitude, int temperaturaAr, int umidadeAr, boolean rastreamento) {
    this.idDrone = idDrone;
    this.latitude = latitude;
    this.longitude = longitude;
    this.temperaturaAr = temperaturaAr;
    this.umidadeAr = umidadeAr;
    this.rastreamento = rastreamento;
  }

}

  