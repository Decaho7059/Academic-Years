% Étape 1: Lire le fichier de données
% Remplacer 'votre_fichier.kcsp' par le chemin réel de votre fichier KCSP
donnees = readtable('file2_kp_0_5.kcsp');

% Étape 2: Extraire les données à tracer
% Supposons que votre fichier a deux colonnes d'intérêt pour le tracé: X et Y
X = donnees.X; % Remplacez 'X' par le nom réel de votre colonne
Y = donnees.Y; % Remplacez 'Y' par le nom réel de votre colonne

% Étape 3: Tracer le graphique
figure; % Crée une nouvelle figure
plot(X, Y); % Tracer Y en fonction de X

% Personnalisation optionnelle
title('Titre du Graphique'); % Ajouter un titre
xlabel('Axe X'); % Étiquette pour l'axe X
ylabel('Axe Y'); % Étiquette pour l'axe Y
grid on; % Afficher la grille
