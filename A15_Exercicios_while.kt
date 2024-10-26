    // Chamadas das funções
    // Parte A: Inverter o texto
    val texto = "Meu nome é Asdrúbal"
    val textoInvertido = inverterTexto(texto)
    println("Texto invertido: $textoInvertido")
    
    // Parte B: Verificar se a quantidade de 'x' e 'o' é igual
    val textoVerificar = "xoxoXXoo"
    val resultado = verificarXEO(textoVerificar)
    println("A quantidade de 'x' e 'o' é igual? $resultado")
    
    // Exercício de balões
    exercicioUmBaloes()
    litrosUsandoDO()
    
    // FizzBuzz
    fizzBuzz()
}

// Função para calcular quantos balões de 7 litros cabem em uma caixa de 2000 litros
// Função para inverter um texto
fun inverterTexto(texto: String): String {
    var resultado = ""
    var i = texto.length - 1
    while (i >= 0) {
        resultado += texto[i]
        i--
    }
    return resultado
}
// Função para verificar se a quantidade de 'x' e 'o' é igual
fun verificarXEO(texto: String): Boolean {
    var countX = 0
    var countO = 0
    var i = 0
    while (i < texto.length) {
        when (texto[i].lowercaseChar()) {
            'x' -> countX++
            'o' -> countO++
        }
        i++
    }
    return if (countX == 0 && countO == 0) {
        false
    } else {
        countX == countO
    }
}
// Função para calcular quantos balões cabem na caixa d'água
fun exercicioUmBaloes() {
    var caixaDagua: Int = 2000
    var contadorBaloes: Int = 0
@@ -17,19 +62,6 @@ fun exercicioUmBaloes() {
    println("A quantidade de balões necessários é: $contadorBaloes")
}

// Versão usando "do while"
fun litrosUsandoDO() {
    var caixa = 2000
    var numBaloes = 0
    do {
        caixa -= 7
        numBaloes++
    } while (caixa >= 7)
    println("Cabem $numBaloes balões na caixa d'água.")
}
// Função FizzBuzz para imprimir números de 1 a 50, com as regras fornecidas
fun fizzBuzz() {
    var y = 1
