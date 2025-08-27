package ui

fun menu(){
    do {
    println("1 - cadastrar caida de agua")
    println("2 - editar caixa de agual")
    println("3 - Listar caixas de agua")
    println("4 - Excluir caixa de agua")
    println("0 - Sair")
    var opcao = readln().toInt()
    when(opcao){
        1 -> println("cadastrando caixa...")
        2 -> println("Editando caixa...")
        3 -> println("Listando caixa...")
        4 -> println("Excluindo caixa...")
        else -> println("opção invalida!")
    }

    } while (opcao != 0)
}