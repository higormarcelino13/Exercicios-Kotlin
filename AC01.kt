
// Nome: Higor Marcelino de Freitas RA: 1905006
// Nome: Thamiris Arce Bezerra da Silva RA: 2102537
// Nome: Octavio Oliveira Ascanio RA: 2102624
// Nome: Murilo Soares Alvarenga RA: 2100801
// Nome: Thiago Mitsuhiro Shimamoto Kuniyoshi RA: 2101966
// Nome: Gabriel Marcatto Monteiro RA: 2101927


// 1.Inicialize o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 25 anos.
 
fun main() {
    var anoNascimento = 1990
    var anoAtual = 2015
    var idade = anoAtual - anoNascimento
    var idadeFutura = idade + 25
    println("Idade atual: $idade")
    println("Idade futura: $idadeFutura")
}

// 2.Inicialize o dia, mês e ano de nascimento e apresente cada uma das variáveis
em console. Apresente também os valores concatenados no formato
DD/MM/YYYY.

fun main() {
    var dia = 10
    var mes = 10
    var ano = 1990
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
    println("Data de nascimento: $dia/$mes/$ano")
}

// 3.Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.

fun main() {
    var x = 10
    var y = 20
    var aux = x
    x = y
    y = aux
    println("x: $x")
    println("y: $y")
}

// 4.Receba o valor de um depósito em poupança. Calcule e mostre o valor após
1 mês de aplicação sabendo que rende 1,3% a. m.

fun main() {
    var deposito = 1000.0
    var rendimento = deposito * 0.013
    var valorFinal = deposito + rendimento
    println("Valor final: $valorFinal")
}

// 5.Inicialize o salário atual, calcule o novo salário acrescido de 20%.

fun main() {
    var salario = 1000.0
    var novoSalario = salario * 1.2
    println("Novo salário: $novoSalario")
}