
##Teoria:
Il multithreading è la capacità di mandare in esecuzione più thread allo stesso momento. Un thread è, in informatica, la suddivisione di un processo in più istanze.
Il multithreading migliora le prestazioni dei programmi solamente quando questi sono stati sviluppati suddividendo il carico di lavoro su più thread che possono essere eseguiti insieme.


## Esercizio 1
Un thread 
Abbiamo realizzato il programma utilizzando il multi-threading, abbiamo creato un programma che stampa 10 volte la parola Hi e 10 volte la parola Hello in modo randomico. Il sistema operativo decide quale tra hi ed hello viene eseguito per primo.
Abbiamo creato due classi: una Hi, e l'altra Hello, abbiamo esteso il Thread e usato il comando run per mandare in esecuzione entrambi i processi.

prima esecuzione del programma:
run:
Hi
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
BUILD SUCCESSFUL (total time: 0 seconds)


seconda esecuzione:
run:
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
BUILD SUCCESSFUL (total time: 0 seconds)

terza esecuzione:
run:
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
BUILD SUCCESSFUL (total time: 0 seconds)



##Esercizio 2
Abbiamo creato 2 oggetti say uno passandogli come frase "Hi" e l'altro "Hello".
Esegue come l'esercizio 1 


esecuzione:
Hi
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
Hi
BUILD SUCCESSFUL (total time: 0 seconds)
