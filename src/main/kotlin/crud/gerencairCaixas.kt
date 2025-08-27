package crud

import enumeradores.Material

fun cadastrarCaixa(){
    /*    val material: Material,
    val capacidade : Int,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double*/
    println("Escolha o material da caixa")
    println("1 - PLASTICO")
    println("2 - PVC")
    println("3 - METAL")
    println("4 - ARGAMASSA")
    val opcao = readln().toInt()
    var material : Material
    when(opcao){
        1 -> material = Material.PLASTICO
        2 -> material = Material.PVC
        3 -> material = Material.METAL
        4 -> material = Material.ARGAMASSA
        else -> material = Material.PLASTICO
    }
    println("capacidade da caixa em Litros")

}
fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}