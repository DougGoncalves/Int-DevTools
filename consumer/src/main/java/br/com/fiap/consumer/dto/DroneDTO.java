package br.com.fiap.consumer.dto;

public class DroneDTO {

  private Long id;
  private String latitude;
  private String longitude;
  private int temperatura;
  private int umidade;


  public DroneDTO(String message){
    String[] fields = message.split(";");

    this.id = Long.parseLong(fields[0]);
    this.latitude = fields[1];
    this.longitude = fields[2];
    this.temperatura = Integer.parseInt(fields[3]);
    this.umidade = Integer.parseInt(fields[4]);
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public boolean EnviaMail() {
		if ((this.temperatura >= 35 || this.getTemperatura() <= 0) || (this.getUmidade() <= 15)) {
			return true;
		}
		return false;
	}
  
}
