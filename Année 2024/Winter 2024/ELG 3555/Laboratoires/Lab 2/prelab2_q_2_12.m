% Define the system parameters
K = 0.582;       % DC gain
tau = 0.07;      % Time constant

% Create a transfer function model
Gp = tf(K, [tau, 1]);

% Simulate the step response
figure;
step(Gp);
title('Step Response of the Motor in Open Loop');
xlabel('Time (s)');
ylabel('Motor Speed (rad/s)');
grid on;

%-----------------------------------------------------------

% Define the state-space matrices
A = [-0.8315789474, 1379423.59799655;
     -385.4271817932, -2117.6470588235];

B = [0;
     1052631.57894737];
C = eye(size(A));
D = zeros(size(B));

% Create a state-space model
sys = ss(A, B, C, D);

% Define a range of Kp values for simulation
Kp_values = [2*pi, 1/2, 0.1, 3]; % Replace with actual values

% Simulate the step response for each Kp value
for i = 1:length(Kp_values)
    % Adjust the system based on the Kp value
    sys_adjusted = sys; % Clone the original system
    % Modify the B matrix or feedback path as needed
    % ...

    % Simulate the step response
    figure;
    step(sys_adjusted);
    title(['Step Response with Kp = ', num2str(Kp_values(i))]);
    xlabel('Time (s)');
    ylabel('Output');
    grid on;
end
