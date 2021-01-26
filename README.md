# kafkaTest
在服务器上重要的配置项

###server.properties:
broker.id=0
zookeeper.connect=localhost:2181
advertised.listeners=PLAINTEXT://101.200.124.173:9092
zookeeper.connection.timeout.ms=6000


###consumer.properties :
bootstrap.servers=101.200.124.173:9092\
group.id=test-consumer-grouop