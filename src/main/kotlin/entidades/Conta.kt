package entidades

import enumeradores.Sexo
import java.math.BigDecimal

class Conta(
    cpf : Long,
    nome: String,
    idade: Int,
    sexo: Sexo,
    val id: String,
    var saldo: BigDecimal,
    val agencia: String,
    val banco: String,
    val tipoConta: String,
    val limiteChequeEspecial: Double

): Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
) {
}