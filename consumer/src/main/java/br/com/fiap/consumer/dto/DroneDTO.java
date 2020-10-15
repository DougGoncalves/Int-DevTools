package br.com.fiap.consumer.dto;

public class DroneDTO {

  private Long id;
  private String latitude;
  private String longitude;
  private int temperaturaAr;
  private int umidadeAr;


  public DroneDTO(String message){
    String[] fields = message.split(";");

    this.id = Long.parseLong(fields[0]);
    this.latitude = fields[1];
    this.longitude = fields[2];
    this.temperaturaAr = Integer.parseInt(fields[3]);
    this.umidadeAr = Integer.parseInt(fields[4]);
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
    this.umidadeAr = umidadeAr;
  }

  public boolean EnviaMail() {
		if ((this.temperaturaAr >= 35 || this.getTemperaturaAr() <= 0) || (this.getUmidadeAr() <= 15)) {
			return true;
		}
		return false;
	}
  
}
