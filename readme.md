# Big Data - Hadoop - TP1

## Output des premières activités

![mapreduce1_0](https://cloud.githubusercontent.com/assets/23452983/24412472/d7e0022a-13d8-11e7-90ad-1ac8f63fcfa1.png)

![mapreduce1_2](https://cloud.githubusercontent.com/assets/23452983/24412569/1aa33e2e-13d9-11e7-952d-180166b4cee6.png)

![mapreduce1](https://cloud.githubusercontent.com/assets/23452983/24412630/4301be18-13d9-11e7-98fa-64a890845460.png)

![buffalo](https://cloud.githubusercontent.com/assets/23452983/24412864/f05379d0-13d9-11e7-89ff-7f49c6d84b79.png)

## Activité 5

![5](https://cloud.githubusercontent.com/assets/23452983/24412652/55468e5a-13d9-11e7-9556-45b6f99df5d1.png)

## Activité 6
![6](https://cloud.githubusercontent.com/assets/23452983/24412773/aac7986a-13d9-11e7-86df-f2b846d9cedf.png)

## Activité 7
![7](https://cloud.githubusercontent.com/assets/23452983/24412789/b5ab933a-13d9-11e7-9151-53164fe6083e.png)

## Homework

On passe ensuite au code Java lié à ces activités qu’on teste avec Junit comme montré ci-dessous.

![test](https://cloud.githubusercontent.com/assets/23452983/24412802/bfa7e83e-13d9-11e7-9eb2-fe8aa924c0d2.png)

Une fois validé, on constitue notre fichier jar que l’on communique au HDFS de Hadoop afin
d’effectuer le mappage et la reduction.

![jar](https://cloud.githubusercontent.com/assets/23452983/24412813/c8a0593a-13d9-11e7-9069-26060355351d.png)

![screenshot from 2017-03-07 05-50-59](https://cloud.githubusercontent.com/assets/23452983/24412889/015d265e-13da-11e7-8788-bc98bc15bc56.png)

Idem pour les autres activités, on n’a plus qu’à adapter le code aux exigences demandées comme
spécifié sur le dépot.


## Conclusion

On a pu identifier grâce à ce TP les intervenants du paradigme MapReduce et comment ils fonctionnent
en collaboration avec les fonctions de sort et de shuffle. En effet, on a pu implémenter différents
mappers et reducers selon la demande afin de générer de la “connaissance” et de l’aide à la décision à
partir de ces grands volumes de données. Bien que cette génération s’effectue de manière relativement
lente à cause de la manipulation d’une seule machine au lieu d’un système distribué, le recours à
Hadoop permet d’offrir cette information en un clin d’oeil.
