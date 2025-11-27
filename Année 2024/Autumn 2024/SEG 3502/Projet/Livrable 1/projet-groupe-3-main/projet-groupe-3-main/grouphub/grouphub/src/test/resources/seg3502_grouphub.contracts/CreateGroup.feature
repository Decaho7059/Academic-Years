Feature: Créer un groupe
  Scenario: Création réussie d'un nouveau groupe
    Given l'utilisateur est connecté
    And l'utilisateur fournit un nom de groupe "Equipe Alpha"
    When l'utilisateur soumet la commande de création de groupe
    Then un nouveau groupe "Equipe Alpha" doit être créé
    And l'utilisateur doit être ajouté en tant que membre du groupe
