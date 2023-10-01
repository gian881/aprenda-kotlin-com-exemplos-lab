// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    AVANCADO
}

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracaoEmHoras: Int)

data class Formacao(val nome: String, nivel: Nivel, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
        for (usuario in usuarios) {
            println("Usuário ${usuario.nome} cadastrado com sucesso!")
        }

    }   
}

fun main() {
    val gian = Usuario("Gian Santos")
    val aecio = Usuario("Aécio José")
    val guilherme = Usuario("Guilherme Lucena")
    val joao = Usuario("João Silva")
    

    val introWeb = ConteudoEducacional("Introdução à web", 20)
    val logicaDeProgramacao = ConteudoEducacional("Lógica de programação", 60)
    val htmlECss = ConteudoEducacional("HTML e CSS", 60)
    val javascript = ConteudoEducacional("Javascript", 80)
    val desenvolvimentoDeInterfaces = ConteudoEducacional("Desenvolvimento de interfaces", 60)
    val linguagensBackend = ConteudoEducacional("Linguagens back-end", 60)
    val bancoDeDados = ConteudoEducacional("Bancos de dados", 60)
    val desenvolvimentoDeAPIs = ConteudoEducacional("Desenvolvimento de APIs", 60)
    val projeto1 = ConteudoEducacional("Desenvolvimento de um website simples", 40)
    val projeto2 = ConteudoEducacional("Desenvolvimento de um aplicativo web", 80)
    val mercadoDeTrabalho = ConteudoEducacional("Mercado de trabalho", 20)

    val conteudos = listOf(
        introWeb,
        logicaDeProgramacao,
        htmlECss,
        javascript,
        desenvolvimentoDeInterfaces,
        linguagensBackend,
        bancoDeDados,
        desenvolvimentoDeAPIs,
        projeto1,
        projeto2,
        mercadoDeTrabalho
    )

    val formacao = Formacao("Desenvolvimento Web", Nivel.INTERMEDIARIO, conteudos)
    formacao.matricular(gian, aecio, guilherme, joao)
}
