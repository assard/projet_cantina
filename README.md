# projet_cantina
Project of Ci/Cd's course

## Application

Cette application est le site pour gérer les menus de la Cantina.

Les tests, le fichier pom.xml et l'intégration continue ont fait l'objet d'une évaluation d'un cours sur le sujet que nous avons suivis lors de notre 3ème année d'étudiant en cycle ingénieur à l'ENSG-Géomatique.

## Dépendances

Ce projet a été réalisé avec les versions suivantes : 

- Java 11
- Maven 3
- Curl 7

## Compilation et exécution

Pour compiler le projet, lancer les tests unitaires et les tests d'intégrations : 

```
mvn verify
```

L'application est disponible sur le port 8080 d'un serveur, vérifier que ce port est disponible avant de l'exécuter. 

Pour exécuter le projet : 

```
java -jar target/cantina.menu-1.0-SNAPSHOT.jar 
```
## Utilisation

Cette application est une API REST pour gérer les menus de la Cantina.

L'application peut être tester manuellement avec ces requêtes HTTP :

```shell
# Afficher tous les menus
$ curl -XGET localhost:8080/menus

# Créer un nouveau menu "Menu de Noel" avec un plat "Céréales sur lait"
$ curl -H "Content-Type: application/json"  -d '{"name": "Menu de Noel", "dishes": [{"name": "Céréales sur lait"}]}' http://localhost:8080/menus
```

## Auteurs

- Axel CHASSARD - étudiant en 3ème année de cycle ingénieur à l'ENSG-Géomatique.
- Laura WENCLIK - étudiante en 3ème année de cycle ingénieur à l'ENSG-Géomatique. 