package br.com.fiap.consumer.mail;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

import br.com.fiap.consumer.config.Config;

public class ConsumerMail {

  public List<String> getMessages() {

    RabbitTemplate rabbitTemplate = new RabbitTemplate(Config.getConnection());
    List <String> messages = new ArrayList<>();

    while(true) {
      try{
        byte[] body = rabbitTemplate.receive("info.drone").getBody();
        messages.add(new String(body));
      } catch (NullPointerException e) {
        System.out.println("Não há items na fila!");
        return messages;
      }
    }
  }
}
