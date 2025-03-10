# o-enigma-do-homem-vitruviano-2

M04: A Avaliação de Anala
Diante de um cenário investigativo, Anala quer saber se os códigos criados são
eficientes para o caso. Nesse sentido, só temos dois caminhos a percorrer: aprimorar
nossas habilidades de contagem de operações e depois aplicá-las em nossos códigos
para mostrar graficamente para Anala.
Para aprimorar nossos conhecimentos em contagem de operações, vamos usar os
pseudocódigos abaixo. A proposta é implementar eles e contar o número de operações.

int treino1(n)
r=0
for (i=1; i<n; i++)
r = r + 1
return r

int treino2(n)
r=0
for (i=1; i<n; i++)
for (j=i+1; j<n; j++)
r = r + 2
return r

int treino3(n)
cont=0
for (i=1; i<n; i++)
for (j=1; j<n; j++)
print i*j
cont++
return cont

int treino4(n)
r=0
for (i=1; i<n; i++)
for (j=i; j<2*i; j++)
for (k=i; k<j; k++)
r = r + 1
return r

Uma vez que tenhamos feito o nosso treino, agora é hora de escolher ao menos um
código de cada uma das missões para fazer esta avaliação e criar um gráfico que
represente o mesmo com diferentes tamanhos de entradas.
