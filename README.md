# Final Exercise DevOps Nackademin

## All dependencies (check build.gradle)
- Rest Assured

## How to run the tests with gradle wrapper
- ```./gradlew clean test```


## Files in this project

### Docker files (found in root)
- **Dockerfile** == Jag använder en Dockerfile för att bygga img
- **.dockerignore** == filer eller directory som undviks att läggas in i docker img vid byggning

### Github Actions
- **.github/workflows** == Här ligger yml filer med GitHub Actions konfigurering
-  **Tester (Unit / IT)** körs automatiskt i alla branches på github vid push. ***(run-all-tests.yml)***
- **Feature till PR:** Kör ***build-deploy-app.yml*** workflow samt återanvänder ***run-all-tests.yml*** workflow mha ***workflow_call***

