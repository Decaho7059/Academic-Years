% Parametres du systeme
K = 0.582; % Gain DC
tau = 0.07; % Constante de temps

% Creer la fonction de transfert du moteur en boucle ouverte Gp(s)
s = tf('s'); % Creer une variable de transfert s
Gp = K / (tau*s + 1); % Fonction de transfert Gp(s)

% Simuler la reponse echelon
figure; % Creer une nouvelle figure
step(Gp); % Tracer la reponse echelon de Gp(s)

% Ajouter des details au graphique
title('Step Response of the Motor System');
ylabel('Motor Speed (rad/s)');
xlabel('Time (seconds)');
grid on; % Ajouter une grille pour une meilleure lisibilite

% Afficher les caracteristiques de la reponse transitoire
% comme la valeur finale, le temps de montee, etc.
stepinfo(Gp)
