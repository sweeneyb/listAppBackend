## working with data ##
```
curl -X POST http://localhost:8080/listItems -d @exampleTask.json -H "Content-Type: application/json"
curl http://localhost:8080/listItems
curl http://localhost:8080/listItems/618d95f4-992c-4683-ae3e-22db6977b6fa|jq ._links.self.href
```