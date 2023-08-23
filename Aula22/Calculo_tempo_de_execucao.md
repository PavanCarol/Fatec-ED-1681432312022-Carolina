# Algoritmo 1

```http

Considerar que x esta em A[1..n]

Function BuscaLinerar(A,n,x){

1.i = 1

2.Enquanto   i <= n       faça

3.Se A[i]==  x     então

4.Devolva i

5.i= i = 1

6.Devolva-1

```

## Consideração (Algoritmo 1)

```http

1.Executar 1 vez

2.executar Px vezes

3. Executar Px vezes

4.Executar 1 vez

5.Executar Px-1

Tx(n)=T + Tpx +2Tpx+2(px-1) =5Tpx
Tpx+2Tpx= 5Tpx
Tble(n)=5T

```
#Algoritmo 2
```http
Considerar que x esta em A[1..n]
Function BuscaLinerarEmOrdem(A,n,x)
i=1
enquanto   i <=   e x  >=  A[i]      faça
SeA[i]== x       então
Devolva i
I=   i  =  1
Devolva -1
```
## Consideração (Algoritmo 2)

```http

1.Executar 1 vez

2.executar Px vezes

3. Executar Px vezes

4.

5.Executar -1 vezes

Tx(n) = T+ 4Tpx+2Tpx+ 2T(px-1)+T = 8Tpx
Tx(n)=T+4T(ax+1)+2Tax+2Ta+T=8Ta+6T

```
#Algoritmo 3
```http
Assumir que x está em A[1..n] 
1.Esq = 1
2.Dir =  1
3.Enquanto Esq  <= Dirfaça
4.Meio = (Esq + Dir) / 2
5.Se  A[Meio] == x      então
6.Devolve Meio
7.Senao se x>  A[meio]       então
8.Esq = meio + 1
9.Senao
10.Dir = meio + 1
11.Devolva -1
```
## Consideração (Algoritmo 3)
```http
1.Executa 1 vez
2.Executa 1 vez
3.Executa RX
4.Executa RX vezes
5.Executa RX vezes
6.Executa 1 vez
7.Executa RX-1
8.Executa RX -1
9.Executa RX-1
10.Executa RX-1

T(N)=2t+tRX+4tRX+2tRX+2t(RX-1)+2T(RX-1)+T
11Trx-1
```
