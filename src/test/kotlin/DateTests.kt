import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue
class DateTests {

    private val funcionesFechas = DateUtils()

    @Test
    fun intAMesEneroTest() {
        assertEquals("Enero", funcionesFechas.intAMes(1))
    }
    @Test
    fun intAMesFebreroTest() {
        assertEquals("Febrero", funcionesFechas.intAMes(2))
    }
    @Test
    fun intAMesMarzoTest() {
        assertEquals("Marzo", funcionesFechas.intAMes(3))
    }
    @Test
    fun intAMesAbrilTest() {
        assertEquals("Abril", funcionesFechas.intAMes(4))
    }
    @Test
    fun intAMesMayoTest() {
        assertEquals("Mayo", funcionesFechas.intAMes(5))
    }
    @Test
    fun intAMesJunioTest() {
        assertEquals("Junio", funcionesFechas.intAMes(6))
    }
    @Test
    fun intAMesJulioTest() {
        assertEquals("Julio", funcionesFechas.intAMes(7))
    }
    @Test
    fun intAMesAgostoTest() {
        assertEquals("Agosto", funcionesFechas.intAMes(8))
    }
    @Test
    fun intAMesSeptiembreTest() {
        assertEquals("Septiembre", funcionesFechas.intAMes(9))
    }
    @Test
    fun intAMesOctubreTest() {
        assertEquals("Octubre", funcionesFechas.intAMes(10))
    }
    @Test
    fun intAMesNoviembreTest() {
        assertEquals("Noviembre", funcionesFechas.intAMes(11))
    }
    @Test
    fun intAMesDiciembreTest() {
        assertEquals("Diciembre", funcionesFechas.intAMes(12))
    }
    @Test
    fun intAMesCeroInvalidoTest() {
        assertEquals("Invalido", funcionesFechas.intAMes(0))
    }
    @Test
    fun intAMesTreceInvalidoTest() {
        assertEquals("Invalido", funcionesFechas.intAMes(13))
    }


    @Test
    fun esBisiesto2000Test(){
        assertTrue(funcionesFechas.esBisiesto(2000))
    }
    @Test
    fun esBisiesto1996Test(){
        assertTrue(funcionesFechas.esBisiesto(1996))
    }
    @Test
    fun noEsBisiesto2023Test(){
        assertFalse(funcionesFechas.esBisiesto(2023))
    }
    @Test
    fun noEsBisiesto1900Test(){
        assertFalse(funcionesFechas.esBisiesto(1900))
    }

    @Test
    fun horasASegundosTest() {
        for(i in 0..100) {
            val j = Random(i).nextInt()
            assertEquals(j * 3600, funcionesFechas.horasASegundos(j))
        }
    }

}