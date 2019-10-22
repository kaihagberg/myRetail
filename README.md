# myRetail - Product API

## Setup

###Dependencies

#### *Java*
Requires Java 8 or later
##### MacOS:
 using Homebrew run:
    `brew cask install java`
##### Windows or other OS:
https://www.oracle.com/technetwork/java/javase/downloads/index.html

#### *MongoDB*
Install latest MongoDB (currently 4.2.0)
##### MacOS:
 using Homebrew you can run the following:
    `brew cask install mongodb`
    
Run MongoDB after installation completes by launching mongo.app found in applications folder
    
##### Windows or other OS:
Follow installation tutorial on MongoDB website found here: 
https://docs.mongodb.com/manual/installation/
 
## Run myRetail app

Ensure mongo is running on default port 27017

Using terminal run the start script `sh start.sh`

In a browser or API client such as Postman, send a GET to localhost:8080/products/ 
appending one of the following TCIN/IDs to the end of the url:
`13860428, 13918060, 12945940, 76695868, 13959206`

## Tests

To run tests `sh gradlew test`  
Although this does not provide much output it should show 'BUILD SUCCESSFUL' if tests are
passing and requires at least one run of the application beforehand in order to populate the 
database.
