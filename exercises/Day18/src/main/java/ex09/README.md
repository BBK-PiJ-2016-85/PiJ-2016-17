// Based upon a Rosetta Code solution

/*
 * This Java implementation uses a token system. If a philosopher's number is on the token, they pick up their left and right forks. 
 * Passing the token to their immediate neighbour would be pointless, so they increment the token by 2, passing it to the philosopher 
 * after their neighbour. The +2 works well for odd numbers of philosophers. With wait down at 1 millisecond this algorithm has about 1.5M eats/sec 
 * running 5 philosophers, down to about 0.5M eats/sec running 25. The single token generates good availability for 80% of 5 forks, 
 * but a much lower availability % of 25 forks.
 */
