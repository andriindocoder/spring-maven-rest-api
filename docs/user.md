## Register User

Endpoint : POST /api/users

Request Body :

```json
{
  "username": "wicaksono",
  "password": "rahasia",
  "name": "Andri Wicaksono"
}
```

Response Body (SUCCESS) : 
```json
{
  "data": "OK"
}
```

Response Body (FAILED) :
```json
{
  "username": "Username must not be blank, ???"
}
```