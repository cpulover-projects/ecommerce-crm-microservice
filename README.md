# E-commerce CRM Microservices


- [Feign] To map/retrieve the returned JSON response when invoking API from other Microservices:
  - Add desired fields mapping to JSON properties in the main entity of the Microservice
  - Add entity with attributes mapping to desired JSON properties
  - Use Object type for generic mapping (get all the attributes)
- Create ResponseWrapper to wrap other properties in the API response 
[[ResponseWrapper]()]
