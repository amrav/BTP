// Agent output in project greeting

/* Initial beliefs and rules */

trust(scheduler).

/* Initial goals */

/* Plans */

+!printed(A)[source(Src)] : trust(Src)
	<- 	.print(A);
		+printed(A);
		.send(scheduler, tell, printed(A)).