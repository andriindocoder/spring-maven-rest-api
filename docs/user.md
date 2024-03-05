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

## Get User

Endpoint : GET /api/users/current

Request Header : 

- X-API-TOKEN : Token (Mandatory)

Response Body (SUCCESS) :
```json
{
  "data": {
    "username": "wicaksono",
    "name": "Andri Wicaksono"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "error": "Unauthorized"
}
```

## Update User

Endpoint : PATCH /api/users/current

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :
```json
{
  "data": {
    "name": "Andri Wicaksono",
    "password": "new_password"
  }
}
```

Response Body (SUCCESS) :
```json
{
  "data": {
    "username": "wicaksono",
    "name": "Andri Wicaksono"
  }
}
```

Response Body (Failed, 401) :
```json
{
  "error": "Unauthorized"
}
```