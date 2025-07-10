# Microservice Project

![Microservice Architecture](Microservice-Architecture%20.png)

## 📑 Eureka Client Configuration

- `eureka.client.fetch-registry=true` — Enables fetching service registry information from the Eureka server.
- `eureka.client.register-with-eureka=true` — Enables registering this service with the Eureka server.
- `eureka.client.service-url.defaultZone=http://localhost:8761/eureka/` — URL where this service contacts the Eureka server.
- `eureka.instance.hostname=localhost` — Sets the hostname of this service instance to 'localhost'.
- `eureka.client.register-with-eureka=false` — Disables service registration with Eureka (overrides earlier value).
- `eureka.client.fetch-registry=false` — Disables fetching registry from Eureka (overrides earlier value).
