# E-commerce CRM Microservices

### Ports - URLs
- Customer service: ```http://localhost:8000```
- Address service: ```http://localhost:8100```
- Order service: ```http://localhost:8200```
- Discovery service: ```http://localhost:8761```
- Zipkin UI server: ```http://localhost:9411/zipkin```

### Notes
- [Feign] To map/retrieve the returned JSON response when invoking API from other Microservices:
  - Add desired fields mapping to JSON properties in the main entity of the Microservice
  - Add entity with attributes mapping to desired JSON properties
  - Use Object type for generic mapping (get all the attributes)
- Create wrapper class to wrap other properties in the API response 
[[ResponseWrapper]()]

### Sleuth
- Use SLF4J or Logback to log requests with unique request id and span id 
[[CustomerService]()]
- Log more detail of the invoked requests by configure ```logging.level.org.springframework.web.servlet.DispatcherServlet=DEBUG```
