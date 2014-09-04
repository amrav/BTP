// Agent scheduler in project greeting

/* Initial beliefs and rules */

/* Initial goals */

/* Plans */

+!printed(A)[source(Src)] : true
	<- 	.wait(5000); 
		.send(output, achieve, printed(A)).
