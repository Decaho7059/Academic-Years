Scenario: Supprimer avec succès un utilisateur d'un groupe
Given l'utilisateur "Jack sparrow" est déjà dans le groupe "Developers"
When je supprime l'utilisateur "Jack sparrow" du groupe "Developers"
Then l'utilisateur "Jack sparrow" ne doit alors pas être dans le groupe "Developers"

Scenario: Essayer de supprimer un utilisateur qui ne fait pas partie du groupe
Given l'utilisateur "Jack sparrow" existe
When je supprime l'utilisateur "Jack sparrow" du groupe "Developers"
Then Je devrais alors voir un message d'erreur "L'utilisateur n'est pas membre du groupe"

Scenario: Essayer de supprimer un utilisateur inexistant d'un groupe
When je supprime l'utilisateur "Jack sparrow" du groupe "Developers"
Then Je devrais alors voir un message d'erreur "L'utilisateur n'existe pas"
