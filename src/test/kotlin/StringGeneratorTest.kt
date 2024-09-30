package learn.toni

import io.kotest.core.spec.style.StringSpec
import io.kotest.core.spec.style.Test
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldHaveLength
import learn.toni.compressor.StringGenerator

class StringGeneratorTest : StringSpec( {
    val generator = StringGenerator()

    "generateRandomString should create string of correct length" {
        val length = 1000
        val result = generator.generateString(length)
        result shouldHaveLength length
    }
}
)
