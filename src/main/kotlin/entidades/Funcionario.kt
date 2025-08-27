package entidades

import enumeradores.Habilidades
import enumeradores.Setor
import enumeradores.Sexo
import java.math.BigDecimal

class Funcionario(

    cpf : Long,
    nome: String,
    idade: Int,
    sexo: Sexo,
    val funcao: String,
    val salario: BigDecimal,
    val experiencia: Int,
    val habilidade: Habilidades,
    val setor : Setor

) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
)
{
    fun intalarCaixaDaAgua(clt: Funcionario){
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("profissional qualificado")
        }else{
            println("profissional desqualificado")
        }
    }
    override fun receberConta(conta: Conta, aPagar: BigDecimal){
        conta.saldo = conta.saldo.subtract(aPagar)
    }
}