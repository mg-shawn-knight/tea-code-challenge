## API Documentation


---
#### GET - User </br>
Path: {url}/api/user/ </br>
Example: {url}/api/user/1 </br>
Headers: Content-Type -> application/json </br>
Request Body: none </br>
Response: Status: 200 OK </br>
Response Body:

```json 
{
    "id": NUMBER, 
    "name": STRING,
    "profession": STRING,
    "age": NUMBER,
    "phone": STRING,
    "address": {
        "city": STRING,
        "postalCode": NUMBER,
        "Country": STRING 
    },
    "languages": [STRING],
    "socialProfiles": [{ 
      "name": STRING, 
      "link": STRING 
    }]
}
```

---
#### GET - Get Users
Path: {url}/api/users </br>
Headers: Content-Type -> application/json </br>
Request Body: none </br>
Response: Status: 200 OK </br>
Response Body: Array of Users

```json
[
  {
      "id": NUMBER,
      "name": STRING,
      "profession": STRING,
      "age": NUMBER,
      "phone": STRING,
      "address": { 
        "city": STRING, 
        "postalCode": NUMBER, 
        "Country": STRING
      },
      "languages": [STRING],
      "socialProfiles": [{ 
        "name": STRING,
        "link": STRING
      }]
  }
]
```

___
#### POST - Add User
Path: {url}/api/user/add </br>
Headers: Accept-Encoding -> application/json | Content-Type -> application/json </br>
Request Body:

```json
{
    "name": STRING,
    "profession": STRING,
    "age": NUMBER,
    "phone": STRING,
    "address": {
        "city": STRING,
        "postalCode": NUMBER,
        "Country": STRING
    },
    "languages": [STRING],
    "socialProfiles": [{ 
      "name": STRING,
      "link": STRING
    }]
}
```

Response: Status: 201 Created </br>
Response Body:

```json
{
  "id": NUMBER
}
```

___
#### DELETE - Delete User
Path: {url}/api/user/delete </br>
Example: {url}/api/user/delete/1 </br>
Request Body: none </br>
Response: Status: 202 Accepted </br>
Response Body: (empty body)