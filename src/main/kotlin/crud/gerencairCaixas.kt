package crud

import entidades.CaixaDAgua
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
    val litros = readln().toDouble()

    println("Cor da caixa")
    val cor = readln().toString()

    println("Peso da caixa")
    val peso = readln().toDouble()

    println("Preco da caixa")
    val preco= readln().toBigDecimal()

    println("Altura da Caixa")
    val altura = readln().toDouble()

    println("Profundidade Caixa")
    val profundidade = readln().toDouble()

    println("Largura da caixa")
    val largura = readln().toDouble()

    CaixaDAgua(
        material = material,
        capacidade = litros,
        cor = cor,
        peso = peso,
        preco = preco,
        altura = altura,
        profundidade = profundidade,
        largura = largura,

    )
}
fun editarCaixa(){

}
fun listarCaixas(){

}
fun excluirCaixa(){

}