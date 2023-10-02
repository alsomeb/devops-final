# Final Exercise DevOps Nackademin

## All dependencies (check build.gradle)
- Rest Assured

## How to run the tests with gradle wrapper
- ```./gradlew clean test```


## Files in this project

### Docker files (found in root)
- **Dockerfile** == I am using a Dockerfile to build my images
- **.dockerignore** == list of files or directories that Docker is to ignore during the build process

### Github Actions
- **.github/workflows** == Here is my yml files containing Github Actions config
-  **Enhetstester** körs automatiskt i alla branches på github.
- **Feature till PR:** En actions process där en feature kan skapas i en branch och läggas till som
  PR, varpå tester körs och koden kan senare mergas till main.

