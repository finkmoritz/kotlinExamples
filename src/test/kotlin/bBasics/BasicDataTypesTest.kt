package bBasics

import org.junit.Test
import kotlin.test.assertEquals

class BasicDataTypesTest {

    @Test
    fun `Test basic data types`() {
        val x = 5;
        //TODO Reassign x to the value 42
        assertEquals(42, x, "x should be equal to 42")
    }
}