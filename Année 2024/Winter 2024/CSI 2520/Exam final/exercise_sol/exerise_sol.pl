% Question 1a
%%%%%%%%%%%%%%%%%%%%%%%%%
% Base case empty list occurence is 0
numOccur(_,[],0) :- !.

% Recursion with element found
numOccur(E,[H|T],R) :- H = E, !, numOccur(E,T,R1), R is 1 + R1.

% Recursion with different element
numOccur(E,[_|T],R) :- numOccur(E,T,R).


% numOccur(4, [1, 7, 5, 0, 4, 1, 4, 6], R).
% numOccur(4, [1, 7, 5, 0, 8, 1, 8, 6], R).
% numOccur(4, [ ], R).


% Question 1b
%%%%%%%%%%%%%%%%%%%%%%%%%
% Base case - end of list copy accumulator to result
flip( [], RL, RL ).

% Recursive case flipping the list of two
flip( [(A,B)|TI], ACC, LO ) :- 
  flip( TI, [(B,A)|ACC], LO ).

% LI is input list, LO is result, accumulator is initialized to []
flip( LI, LO ) :- flip( LI, [], LO ).

