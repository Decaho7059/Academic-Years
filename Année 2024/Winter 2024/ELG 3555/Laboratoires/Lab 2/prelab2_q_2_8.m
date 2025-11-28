% Definir la matrice d'etat (A) et la matrice d'entree (B)
A = [-0.8315789474, 1379423.59799655;
     -385.4271817932, -2117.6470588235];

B = [0;
     1052631.57894737];

% Definir la matrice de sortie (C) et la matrice de transmission directe (D)
% Ces matrices ne sont pas fournies dans l'enonce, donc je vais les supposer
% comme l'identite et zero respectivement pour une simulation standard.
C = eye(size(A));
D = zeros(size(B));

% Creer un systeme d'etat lineaire
sys = ss(A, B, C, D);

% Definir un vecteur de temps (t) pour la simulation
t = 0:0.0000001:0.1; % De 0 a 10 secondes avec un pas de 0.01 secondes

% Definir une entree de marche (step input)
u = ones(size(t));

% Simuler la reponse du systeme a l'entree u
[y, t, x] = lsim(sys, u, t);

% Tracer les courbes des etats
figure;
plot(t, y+x);
xlabel('Time (seconds)');
ylabel('States');
title('State Response of the System');
legend('State 1: Speed', 'State 2: Current'); % Modifier les legendes selon le contexte des etats
