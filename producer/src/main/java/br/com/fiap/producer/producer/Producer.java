package br.com.fiap.producer.producer;

import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.producer.config.Config;
import br.com.fiap.producer.model.DadosDrone;

@RestController
@RequestMapping (value = "/drones")
@Component
public class Producer {

  @CrossOrigin(origins = "http://localhost:3000")//URL onde o frontend está rodando
  @PostMapping(consumes = "application/json", produces = "application/json")
  public void AdicionarDados(@RequestBody DadosDrone dadosDrone) throws InterruptedException{

    RabbitAdmin admin = new RabbitAdmin(Config.getConnection());
    Queue queueDrone = new Queue("info.drone");

    final String exchange = "exchange.drone";

    admin.declareQueue(queueDrone);

    DirectExchange exchangeDrone = new DirectExchange(exchange);
    admin.declareExchange(exchangeDrone);

    admin.declareBinding(BindingBuilder.bind(queueDrone).to(exchangeDrone).with("drone"));

    RabbitTemplate rabbitTemplate = new RabbitTemplate(Config.getConnection());

    System.out.println(dadosDrone.getIdDrone() + ";" + dadosDrone.getLatitude() + ";" + dadosDrone.getLongitude() + ";" + dadosDrone.getTemperaturaAr() + ";" + dadosDrone.getUmidadeAr());

    rabbitTemplate.convertAndSend(exchange, "drone", dadosDrone.getIdDrone() + ";" + dadosDrone.getLatitude() + ";" + dadosDrone.getLongitude() + ";" + dadosDrone.getTemperaturaAr() + ";" + dadosDrone.getUmidadeAr());
    
  }
  
}
