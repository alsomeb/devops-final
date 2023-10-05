# Final Exercise DevOps Nackademin

## All dependencies (check build.gradle)
- Rest Assured

## How to run the tests & other commands in this Project with gradle wrapper
- ```./gradlew test``` - Kör Unit Tests bara
- ```./gradlew systemTest``` Kör SystemTest med RestAssured (Riktig Nätverk Traffik)
- ```./gradlew integrationTest``` Kör SystemTest + Integration Test (MockMvc IT + Rest Assured SystemTest)
- ```./gradlew clean test jacocoTestReport``` Kör Unit test + Coverage
- Rapporten genereras och finns tillgänglig på ```build/reports/jacoco/test/html/index.html```
- ```./gradlew checkstyleMain checkstyleTest``` Google Checkstyle, säkerställer kod-standard
- Checkstyle rapport tillgänglig: ```build/checkstyle/main.html```


## Files in this project

### Docker files (found in root)
- **Dockerfile** == Jag använder en Dockerfile för att bygga img
- **.dockerignore** == filer eller directory som undviks att läggas in i docker img vid byggning

### Github Actions
- **.github/workflows** == Här ligger yml filer med GitHub Actions konfigurering
-  **Tester (Unit)** körs automatiskt i alla branches förutom ***main*** vid push. ***(run-all-unit.yml)***
- **Feature till PR:** Kör ALLA tester (unit, IT, system) ***build-deploy-testing-env.yml*** samt deploy till testing env
- ***Merge PR*** triggar deploy till production workflow ***deploy-production.yml***

