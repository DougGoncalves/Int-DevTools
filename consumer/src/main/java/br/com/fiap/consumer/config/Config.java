package br.com.fiap.consumer.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;

public class Config {

  private static CachingConnectionFactory cachingConnectionFactory;

  public static CachingConnectionFactory getConnection() {
      
    if (cachingConnectionFactory == null) {
      cachingConnectionFactory = new CachingConnectionFactory("jackal.rmq.cloudamqp.com"); //URL do CloudAMQP
      cachingConnectionFactory.setUsername("qjelxysi");
      cachingConnectionFactory .setPassword("I8ieQM29VZHbv6ZB8kYjUWc0vW9CKVWb");
      cachingConnectionFactory .setVirtualHost("qjelxysi");

      //configurações
      cachingConnectionFactory .setRequestedHeartBeat(30);
      cachingConnectionFactory .setConnectionTimeout(30000);

    }
    return cachingConnectionFactory;
  }
}
