Messaging or Calling other service in microservices and enterprise applications. 

JMS is commonly used with message brokers like ActiveMQ or RabbitMQ.

docker run -d --name activemq -p 61616:61616 -p 8161:8161 rmohr/activemq
Admin Web Console: http://localhost:8161/
Broker JMS URL: tcp://localhost:61616

