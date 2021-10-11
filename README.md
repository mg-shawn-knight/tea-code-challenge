### Coding Assignment

### Project Technology Requirements
* Upon completion, check-in the code into a public git repo and provide the link.
* Java 15+
* Gradle 7+
* TestNG or JUnit 5
* Unirest
* Any libraries or frameworks you consider necessary

### Limitations



### Expectations
* We are interested in the naming conventions, readability, structure and modularity of your implementation. 
* Variety and quality of the test cases.
* Imagine that this small example is going to turn into a larger framework.

### Assumptions

* A backend database handling all transactions, however, in this exercise direct access to the database is not an option; in addition it also assumed the database is functioning correctly<br>


* API Server: `https://0f5900a2-f989-449d-94e8-9c63893d0c86.mock.pstmn.io`

### End Points


* GET - User<br>
`{url}/api/user/`<br>
Example: `{url}/api/user/1` <br>
Headers: `Content-Type -> application/json` <br>
Request Body: none <br>
Response: Status: <b>200 OK</b> <br>
Body:
`{
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
"name": STRING
"link": STRING
}]}`
---
* GET - Get Users<br>
`{url}/api/users`<br>
Headers: `Content-Type -> application/json` <br>
Request Body: none <br>
Response: Status: <b>200 OK</b><br>
Body: Array of Users <br>
Example: `{
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
"name": STRING
"link": STRING
}]},{
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
"name": STRING
"link": STRING
}]}`

---

* POST - Add User <br>
`{url}/api/user/add` <br>
Headers: `Accept-Encoding -> application/json | Content-Type -> application/json` <br>
Request Body: <br>
`{
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
"name": STRING
"link": STRING
}]}`
<br>Response: Status: <b>201 Created</b> <br>
Body: `{
"id": NUMBER
}`

---

* DELETE - Delete User <br>
`{url}/api/user/delete` <br>
Example: `{url}/api/user/delete/1` <br>
Request Body: none <br>
Response: Status: <b>202 Accepted</b> (empty body)
<br><br>
### Exercises


##### Part 1: 

`At the end of the README file, document the test cases you think are necessary to validate the given end points.`<br>
`In addition, don't hesitate to add any notes, observations, concerns or suggestions`

##### Part 2: 

`Code the majority of the documented test cases` 

<hr>

#### Test Cases:

1. 


