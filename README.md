# github_api_tests

## Zadanie 1
Plik .json z kolekcją gotową do importu do Postmana znajduje się w katalogu _postman_api_test_collection_.

## Zadanie 2
Zadanie 2 zostało wykonane przy użyciu biblioteki restAssured, frameworka testowego JUnit5 oraz Maven Surefire Plugin.
Testy można uruchomić na dwa sposoby:

### Sposób 1
Za pomocą polecenia: 
```
mvn clean test
```

### Sposób 2 (dla użytkowników IntelliJ)
1. Otworzyć panel Edit Configuration
<img src="https://user-images.githubusercontent.com/57013171/203408541-de772c38-8d50-4bf9-8ce1-98c0504e0073.png" width=50% height=50%>

2. Dodać konfigurację JUnit
<img src="https://user-images.githubusercontent.com/57013171/203408648-bcc8fecf-46ff-4132-98de-f844de67a34b.png" width=50% height=50%>

3. Jako typ zasobu, w którym będą wyszukiwane testy wybrać opcję Class, a następnie podać odpowiednią ścieżkę do tej klasy.
<img src="https://user-images.githubusercontent.com/57013171/203408818-29a3e66f-d760-40bc-a41d-343578ca05ca.png" width=50% height=50%>

4. Po zatwierdzeniu zmian i zamknięcia okienka, można uruchamiać testy z poziomu IntellJ za pomocą zielonego przycisku Run.
