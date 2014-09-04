// Agent input in project greeting

/* Initial beliefs and rules */

/* Initial goals */

!start.

/* Plans */

+!start : true <- .send(scheduler, achieve, printed("Hello World")).
