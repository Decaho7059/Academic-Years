Feature: Ajouter un utilisateur à un groupe
  En tant qu'administrateur
  Je souhaite ajouter un utilisateur à un groupe
  Pour que l'utilisateur puisse avoir accès aux ressources du groupe

  Background:
    Given je suis connecté en tant qu'administrateur
    And un groupe "Developers" existe
    And un utilisateur "Jack sparrow" existe

  Scenario: Ajouter avec succès un utilisateur à un group
    When j'ajoute l'utilisateur "Jack sparrow" au groupe "Developers"
    Then l'utilisateur "Jack sparrow" doit alors être dans le groupe "Developers"

  Scenario: Essayer d'ajouter un utilisateur à un groupe inexistant
    When j'ajoute l'utilisateur "Jack sparrow" au groupe "Admins"
    Then Je devrais alors voir un message d'erreur "Le groupe n'existe pas"

  Scenario: Essayer d'ajouter un utilisateur déjà présent dans le groupe
    Given l'utilisateur "Jack sparrow" est déjà dans le groupe "Developers"
    When j'ajoute l'utilisateur "Jack sparrow" au groupe "Developers"
    Then Je devrais alors voir un message d'erreur "L'utilisateur est déjà membre du groupe"
