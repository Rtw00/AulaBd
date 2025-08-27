package entidades

import enumeradores.Sexo
import java.math.BigDecimal

class Cliente(
    nome: String,
    val sobrenome: String,
    idade: Int,
    cpf: Long,
    sexo: Sexo,
    val endereco: String,
    val telefone: String,
    val matricula: Int,

    ) : Pessoa(
    nome = nome,
    idade = idade,
    cpf = cpf,
    sexo = sexo
)
