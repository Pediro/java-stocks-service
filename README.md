# Java Stock Service
A java service for managing the getting of products from a dynamodb database.

The Service will consist of two getter endpoints, one for getting a list of all the products and one for getting the details of a single product.
These endpoints are to be used in the Store Web App project.

# Setting up local DynamoDB for testing

## Prerequisite

- Install Docker Desktop
- Install AWS CLI

AWS CLI needs configuring with the command:

    aws configure

From there set an access key, secret access key, region and output format. For our purposes those values were set to key, secret, eu-west-1 and json.

With the docker-compose file - run the command

    docker compose up

^ This will start up a local version of the DynamoDB

The following comes from https://stackoverflow.com/a/42435748/7726618

Create table

    aws dynamodb create-table --cli-input-json file://./data/dynamodb-schema.json --endpoint-url http://localhost:8000

Insert data

    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-1.json --endpoint-url http://localhost:8000
    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-2.json --endpoint-url http://localhost:8000
    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-3.json --endpoint-url http://localhost:8000
    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-4.json --endpoint-url http://localhost:8000
    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-5.json --endpoint-url http://localhost:8000
    aws dynamodb batch-write-item --request-items file://./data/champion-data-batch-6.json --endpoint-url http://localhost:8000

Query data
    aws dynamodb get-item --consistent-read --table-name products --key "{\"name\": {\"S\": \"aatrox\"}}" --endpoint http://localhost:8000  