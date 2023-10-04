# Final Exercise DevOps Nackademin

## All dependencies (check build.gradle)
- Rest Assured

## How to run the tests with gradle wrapper
- ```./gradlew test``` - Kör Unit Tests bara
- ```./gradlew systemTest``` Kör SystemTest med RestAssured
- ```./gradlew integrationTest``` Kör SystemTest + Integration Test


## Files in this project

### Docker files (found in root)
- **Dockerfile** == I am using a Dockerfile to build my images
- **.dockerignore** == list of files or directories that Docker is to ignore during the build process

### Github Actions
- **.github/workflows** == Here is my yml files containing Github Actions config
-  **Tester (Unit / IT)** körs automatiskt i alla branches på github vid push. ***(run-all-tests.yml)***
- **Feature till PR:** Kör ***build-deploy-app.yml*** workflow samt återanvänder ***run-all-tests.yml*** workflow mha ***workflow_call***

