import entidades.Funcionario
import entidades.Servico
import enumeradores.Habilidades
import enumeradores.Setor
import enumeradores.Sexo

import java.math.BigDecimal

fun main() {
    val instalacao : Servico = Servico(
        preco = "800,50".toBigDecimal(),
        Funcionario(
            1234567895,
            "João",
            20,
            Sexo.MASCULINO,
            "Instalador",
            BigDecimal("200"),
            2,
            Habilidades.ESPERTO,//isso são classes aninhadas
            Setor.MONTAGEM

        )
    )
}
