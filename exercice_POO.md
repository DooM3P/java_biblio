# Gestion de bibliothèques

## Enoncé:
La région a décidé de centraliser la gestion des bibliothèques municipales par le biais d'un logiciel. Le cahier des charges n'est pas finalisé mais c'est à vous que sera confié ce developpement.
Dans l'attente des documents qui vous permettront de demarrer le projet, vous pouvez déjà y réfléchir.
L'objectif est d'implémenter les classes qui seront utilisées dans l'application.
En voici une liste non-exhaustive:

### Classes (et leur attributs):


- Bibliothèque:
    - Ville
    - capacité visiteurs
    - capacité items
- Personne:
    - nom
    - prénom
    - adresse
- Membre:
    - date d'inscription
- Employe
    - date d'embauche
    - salaire
    - service
- Poste:
    - intitulé
- Item:
    - titre
    - référence
- Livre:
    - auteur
    - date de parution
    - editeur
- Disque
    - interprète
    - date de sortie
- Emprunt:
    - date d'emprunt
    - date de retour
    ----

### Règles de gestions:

- Il n'y a qu'une seule bibliothèque par ville.
- La capacité visiteurs varient de 30 à 250 visiteurs/jours.
- La capacité items varie de 1000 à 150 000 items par bibliothèque.
- Le nombre d'employé varie de 10 à 100 par bibliothèque.
- Le nombre de membre pour une bibliothèque est illimité.
- Une bibliothèque stocke des items.
- Les items peuvent être de différents types: Disque, Livre, etc.
- Les fiches d'emprunt indiquent les dates de début et de fin d'emprunt, l'item emprunté, le membre et la bibliothèque concernés.






