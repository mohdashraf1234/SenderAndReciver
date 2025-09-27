# SenderAndReciver



This project demonstrates **Apache Kafka messaging** using **Spring Boot Producer & Consumer**. Produces 100,0000 random location updates to Kafka. 
It consists of two microservices:  

- **DeliveryWala (Producer)** → Produces random location updates.  
- **EndUser (Consumer)** → Consumes and prints location updates.  

---

## 📌 Tech Stack
- Java 17+  
- Spring Boot  
- Apache Kafka  
- Zookeeper (for Kafka broker)  
- Maven  

---

## ⚙️ Setup Instructions

### 1️⃣ Start Kafka & Zookeeper
Make sure Kafka and Zookeeper are running locally:  
```sh
# Start Zookeeper
bin/zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka broker
bin/kafka-server-start.sh config/server.properties

#Runs on port 9090


