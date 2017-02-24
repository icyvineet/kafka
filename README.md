# kafka
Producer and Consumer for Kafka
Terminal 1 >> bin/zkServer.sh start

Terminal 1 >> bin/kafka-server-start.sh config/server.properties
Terminal 2 >> bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Hello-Kafka

Terminal 3 >> bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Hello-Kafka


Terminal 4 >> spark-submit --class com.vineet.JavaDirectKafkaWordCount --master local[2] /home/vineet/workspace/spark-kafka/target/spark-kafka-0.0.1-SNAPSHOT.jar localhost:9092 Hello-Kafka


Terminal 3 and Terminal 4 >>
Terminal 3 >> Type Message
Terminal 4 >> Observe the response

