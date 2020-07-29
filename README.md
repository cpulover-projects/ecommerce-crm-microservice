# E-commerce CRM Microservices

### Port
- Customer service: 8000
- Address service: 8100
- Order service: 8200
- Discovery service: 8761

### Notes
- [Feign] To map/retrieve the returned JSON response when invoking API from other Microservices:
  - Add desired fields mapping to JSON properties in the main entity of the Microservice
  - Add entity with attributes mapping to desired JSON properties
  - Use Object type for generic mapping (get all the attributes)
- Create ResponseWrapper to wrap other properties in the API response 
[[ResponseWrapper]()]

### Sleuth
- Use SLF4J log to log requests with unique request and span id 
[[CustomerService]()]
- Log more detail of the invoked requests by configure ```logging.level.org.springframework.web.servlet.DispatcherServlet=DEBUG
```
