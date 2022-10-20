// Nome: Higor Marcelino de Freitas RA: 1905006
// Nome: Thamiris Arce Bezerra da Silva RA: 2102537
// Nome: Octavio Oliveira Ascanio RA: 2102624
// Nome: Murilo Soares Alvarenga RA: 2100801
// Nome: Thiago Mitsuhiro Shimamoto Kuniyoshi RA: 2101966
// Nome: Gabriel Marcatto Monteiro RA: 2101927


//1. Crie uma variável global que indique o percentual de reajuste de um determinado produto, que deve ser calculado a partir do método main definido na função. Calcule o novo salário e exiba-o em console.

var reajuste = 0.2

fun main() {
    val salario = 1000.0
    val novoSalario = salario + (salario * reajuste)
    println("O novo salário é $novoSalario")
}


// 2. A classe Aluno possuí os atributos id, nome e curso. Receba todos os parâmetros no método construtor e exiba-os em console, sem a utilização de métodos estáticos.

class Aluno(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

fun main() {
    val aluno = Aluno(1, "Higor", "SI")
}


// 3. A classe Aluno possuí os atributos id, nome e curso. Receba todos os parâmetros no método construtor e exiba-os em console. Adicione um companion Object com a mensagem chamando método estático, que deve ser acessado sem realizar a instância direta da classe.

class Aluno(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }

    companion object {
        fun mensagem() {
            println("Mensagem")
        }
    }
}

fun main() {
    val aluno = Aluno(1, "Higor", "SI")
    Aluno.mensagem()
}

// 4. Crie três classes chamadas, Aluno, Turma e Professor. Na função main, crie um atributo chamado obj instanciando uma das classes, valide se o atributo é do tipo da Classe Aluno, Turma ou Professor e exiba em console o tipo de dado que ele pertence.

class Aluno(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

class Turma(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

class Professor(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

fun main() {
    val obj = Aluno(1, "Higor", "SI")
    if (obj is Aluno) {
        println("É um aluno")
    }
}



// 5. Com base na resolução do exercício 4, se o atributo informado for do tipo Aluno, instancie o objeto com o tipo da Classe Turma. Ao final, apresente o último tipo do objeto instanciado.

class Aluno(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

class Turma(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

class Professor(val id: Int, val nome: String, val curso: String) {
    init {
        println("Id: $id")
        println("Nome: $nome")
        println("Curso: $curso")
    }
}

fun main() {
    val obj = Aluno(1, "Higor", "SI")
    if (obj is Aluno) {
        println("É um aluno")
    }
    val obj2 = Turma(1, "Turma 1", "SI")
    if (obj2 is Turma) {
        println("É uma turma")
    }
}



// 6. Cria uma classe chamada Aluno com os atributos ID do aluno, nome do Aluno e semestre. Passe 10 notas por meio da utilização de um ArrayList inicializadas no método construtor e imprima cada um dos valores em console a partir de uma nova função.

class Aluno(val id: Int, val nome: String, val semestre: Int) {
    val notas = ArrayList<Double>()

    init {
        notas.add(10.0)
        notas.add(9.0)
        notas.add(8.0)
        notas.add(7.0)
        notas.add(6.0)
        notas.add(5.0)
        notas.add(4.0)
        notas.add(3.0)
        notas.add(2.0)
        notas.add(1.0)
    }

    fun imprimirNotas() {
        notas.forEach {
            println(it)
        }
    }
}

fun main() {
    val aluno = Aluno(1, "Higor", 1)
    aluno.imprimirNotas()
}

// 7. Inicialize a classe Carro modelo do tipo de dado String, ano do tipo de dado inteiro e velocidade do tipo de dado inteiro. Na classe Carro, o atributo ano deve ser iniciado com o valor 1900. Na função main crie 3 instâncias da classe Carro, nomeadas como c0, c1 e c2. Inicialize o atributo ano de c2 com o valor 2020. Em seguida exiba o ano do carro acessado por meio do objeto c1 e o ano do carro acessado por meio do objeto c2.

class Carro(var modelo: String, var ano: Int = 1900, var velocidade: Int) {
    init {
        println("Modelo: $modelo")
        println("Ano: $ano")
        println("Velocidade: $velocidade")
    }
}

fun main() {
    val c0 = Carro("Fusca", 2020, 100)
    val c1 = Carro("Fusca", 2020, 100)
    val c2 = Carro("Fusca", 2020, 100)
    c2.ano = 2020
    println(c1.ano)
    println(c2.ano)
}


// 8. Crie uma expressão lambda que realiza a divisão de 2 valores e exiba os resultados em console.

val divisao = { a: Int, b: Int -> a / b }

fun main() {
    println(divisao(10, 2))
}
