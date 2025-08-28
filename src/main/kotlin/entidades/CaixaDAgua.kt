package entidades

import enumeradores.Material
import java.math.BigDecimal

class CaixaDAgua(// construtor da classe esses dois parenteses
    val material: Material,
    val capacidade : Double,
    val cor : String,
    val peso : Double,
    val preco : BigDecimal,
    val altura : Double,
    val profundidade : Double,
    val largura : Double
    //val dimenssao : Array<Double>, // altura, largura e profundidade

) //aqui vai todos os atributos da classe
{

}