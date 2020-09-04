# lista01_progII
Lista 01 - Programação II UFRPE

Lista de Exercícios 01

1. Escreva as seguintes classes em Java:
a. Produto:
- Deverá conter os atributos privados codigo, nome.
- Deverá conter um construtor sem parâmetros e outro contendo os parâmetros
(codigo, nome).
- Deverá conter o método:
o Método que altera o nome do produto
§ mudarNome(nome)

b. Estoque:
- Deverá conter os atributos privados produto, qtdAtual e qtdMinima.
- Deverá conter um construtor sem parâmetros e outro contendo os parâmetros
(produto, qtdAtual e qtdMinima).
- Deverá conter os métodos:
o Método que altera o valor da quantidade mínima
§ mudarQtdMinima(qtdMinima)
o Método soma ao valor atual o valor passado
§ reporEstoque(qtd)
o Método subtrai do valor atual o valor passado
§ darBaixa(qtd)
o Método que escreve os valores atuais dos atributos
§ relatorio()

c. Escreva uma classe TesteEstoqueMain que vai realizar as seguintes operações:
- Instanciar os objetos:
- produto01
o codigo: 1
o nome: Impressora
- produto02
o codigo: 2
o nome: Teclado
- produto03
o codigo: 2
o nome: Monitor
- estoque1
o produto: produto01
o qtdAtual: 10

o qtdMinima: 2
- estoque2
o produto: produto02
o qtdAtual: 20
o qtdMinima: 10
- estoque3
o produto: produto03
o qtdAtual: 5
o qtdMinima: 2
d. Execute as operações na seguinte ordem:
- Dar baixa em 5 unidades de estoque1;
- Fazer a reposição de 7 unidades de estoque2;
- Dar baixa em 6 unidades de estoque3;
- Executar o método relatorio das instâncias estoque1, estoque2 e estoque3;
- Mudar o nome do produto02 para "Teclado virtual";
- Executar o método relatorio da instância de estoque responsável pelo atributo
produto02;

2. Implementar as classes a seguir:
a. Classe: ContaCorrente.
i. Atributos da classe ContaCorrente:
1. numeroConta (inteiro) -> não pode receber um valor menor ou
igual a zero;
2. correntista (String) -> não pode receber um valor nulo ou String
vazia;
3. saldo (ponto-flutuante) -> nao pode manter um valor menor
que zero;

ii. Implementar apenas um construtor recebendo valores para os
atributos numeroConta e correntista da classe ContaCorrente.
iii. Utilizar a técnica de encapsulamento apresentada no curso e
implementar métodos get e set para todos os atributos da classe (ver
observação abaixo).
iv. OBS.: Não implementar o método set para o atributo saldo. O valor do
atributo saldo só poderá ser alterado através dos métodos deposita,
saque e transfere detalhados a seguir.
v. Implementar o método boolean deposita (double valor) que deposita
um valor na conta corrente. O método retorna verdadeiro se o
depósito foi realizado com sucesso ou falso em caso contrário. OBS.:
Verificar se o valor informado é maior que zero.
vi. Implementar o método boolean saque(double valor) que realiza um
saque na conta corrente. O método retorna verdadeiro se o saque foi
realizado com sucesso ou falso e caso contrário. OBS.: Verificar se o
valor informado é maior que zero e se há saldo suficiente para realizar
o saque.


vii. Implementar o método boolean transfere (double valor,
ContaCorrente contaDestino) que realiza uma transferência de um
valor da conta corrente atual para a conta corrente destino. O método
retorna verdadeiro se a transferência foi realizada com sucesso ou falso
em caso contrário. OBS.: Verificar se o valor informado é maior que
zero, se o objeto contaDestino não é nulo e se há saldo suficiente para
realizar a transferência.

b. Implementar uma aplicação chamada AplicacaoContas que apresenta um
método main e instancia dois objetos do tipo ContaCorrente, a partir de dados
informados pelo usuário. Em seguida, o programa deve oferecer um menu
para o usuário com as seguintes opções:
i. Imprimir dados de uma conta: Para esta opção o usuário deverá
informar o número da conta;
ii. Realizar depósito. Para esta opção o usuário deverá informar o número
da conta e o valor para o depósito.
iii. Realizar saque. Para esta opção o usuário deverá informar o número
da conta e o valor para saque;
iv. Realizar transferência. Para esta opção o usuário deverá informar o
número da conta origem, o número da conta destino e o valor para
transferência;
v. OBS.: para as opções de depósito, saque e transferência, o programa
deve imprimir na tela uma mensagem indicando se o depósito, o saque
ou a transferência foi realizado com sucesso ou não.

3. Implementar as classes a seguir:
a. Classe: DVD
i. Atributos da classe DVD:
estado (booleano) -> receberá o valor true quando o DVD estiver
ligado, e false em caso contrário. Defina, na classe DVD, duas
constantes booleanas: LIGADO = true e DESLIGADO = false.

operacaoEmExecucao(String) -> receberá um dos valores pré-
definidos (ver tabela abaixo) de acordo com a operação que estiver

sendo realizada pelo DVD. OBS.: definir constantes para manter os
valores da tabela abaixo:

ii. Implementar apenas o construtor default que atribui o valor
DESLIGADO para o atributo estado e o valor PARADO para o atributo
operacaoEmExecucao.
iii. Utilizar a técnica de encapsulamento apresentada no curso e
implementar apenas métodos get para todos os atributos.


iv. OBS.: Os métodos set dos atributos estado e operacaoEmExecucao não
serão implementados pois seus valores só poderão ser alterados
através dos métodos liga, desliga, play, stop, pause, volta e avança
detalhados a seguir.
v. Implementar o método void ligar() que altera o estado do
equipamento para LIGADO e atribui o valor PARADO para o atributo
operacaoEmExecucao.
vi. Implementar o método void desliga() que altera o estado do
equipamento para DESLIGADO e atribui o valor PARADO para o
atributo operacaoEmExecucao.
vii. Implementar o método void play() que altera o valor do atributo
operacaoEmExecucao para REPRODUZINDO. OBS.: Este método só
pode ser executado se o estado do equipamento for LIGADO.
viii. Implementar o método void stop() que altera o valor do atributo
operacaoEmExecucao para PARADO. OBS.: Este método só pode ser
executado se o estado do equipamento for LIGADO.
ix. Implementar o método void pause() que altera o valor do atributo
operacaoEmExecucao para EM_PAUSA. OBS.: Este método só pode ser
executado se o estado do equipamento for LIGADO.
x. Implementar o método void volta() que altera o valor do atributo
operacaoEmExecucao para VOLTANDO. OBS.: Este método só pode ser
executado se o estado do equipamento for LIGADO.
xi. Implementar o método void avanca() que altera o valor do atributo
operacaoEmExecucao para AVANCADO. OBS.: Este método só pode ser
executado se o estado equipamento for LIGADO.

b. Implementar uma aplicação chamada AplicacaoDVD que instancia um objeto
do tipo DVD e oferece um menu com as opções: liga, desliga, play, stop, pause,
volta, avança e sair, permitindo que o usuário possa manipular seu
equipamento. OBS.: Todas as vezes que o usuário selecionar uma opção do
menu, deve-se imprimir na tela o estado e a operação corrente do
equipamento.
