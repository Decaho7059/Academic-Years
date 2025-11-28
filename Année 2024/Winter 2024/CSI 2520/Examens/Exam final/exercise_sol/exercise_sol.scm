#lang racket

;; Question 2a
;; Input elem is the element to count in the List List
;; 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define (numOccur elem L) 
  (cond
    ((null? L) 0)
    ((= elem (car L)) (+ 1 (numOccur elem (cdr L))))
    (else (numOccur elem (cdr L))))
)


(numOccur 4 '(1 7 5 0 4 1 4 6))

(numOccur 4 '(1 7 5 0 8 1 8 6))

(numOccur 4 '())

         


;; Question 2b
;; Input is a List
;; 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define (frequency L)
  (if (null? L)
      '()
      (let ((LS (sort L <)))
	(let f ((RL (cdr LS))
		(E (car LS))
		(C 1))
	  (cond
	   ((null? RL) (list (list E C)))
	   ((eq? E (car RL)) (f (cdr RL) E (+ C 1)))
	   (else
            (cons (list E C) (f (cdr RL) (car RL) 1)))
	  ))))
)


(frequency  '())

(frequency '( 1 5 2 7 1 6 1 6 4))

(frequency  `(1 5 9 7 -1))
