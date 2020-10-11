package br.com.fiap.consumer.main;

import java.util.List;

import br.com.fiap.consumer.mail.ConsumerMail;
import br.com.fiap.consumer.mail.Mail;
import br.com.fiap.consumer.dto.DroneDTO;

public class Consumer {
  
  public static void main(String[] args) throws InterruptedException{

    while(true) {
      List<String> messages = new ConsumerMail().getMessages();

      if (messages.size() > 0) {
        for (String message : messages) {
          if (message.contains(";")) {
            DroneDTO droneDTO = new DroneDTO(message);

            if (droneDTO.EnviaMail()) {
              new Mail().EnviarMail(droneDTO);
              break;
            }
          }
          continue;
        }
      }
      Thread.sleep(60 * 1000);
    }
  }
}
