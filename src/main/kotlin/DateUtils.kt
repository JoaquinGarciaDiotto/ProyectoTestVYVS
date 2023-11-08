class DateUtils {
    fun intAMes(month: Int) =
        when (month) {
            1 -> "Enero"
            2 -> "Febrero"
            3 -> "Marzo"
            4 -> "Abril"
            5 -> "Mayo"
            6 -> "Junio"
            7 -> "Julio"
            8 -> "Agosto"
            9 -> "Septiembre"
            10 -> "Octubre"
            11 -> "Noviembre"
            12 -> "Diciembre"
            else -> "Invalido"
        }

    fun esBisiesto(year: Int) =
        (year % 4 == 0) &&
                (year % 100 != 0 ||
                        year % 400 == 0)

    fun horasASegundos(horas: Int) = horas * 3600

}