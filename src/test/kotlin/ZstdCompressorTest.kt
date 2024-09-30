package learn.toni

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.comparables.shouldBeLessThan
import io.kotest.matchers.shouldBe
import learn.toni.compressor.StringGenerator
import learn.toni.compressor.ZstdCompressor

class ZstdCompressorTest: StringSpec({
    val compressor = ZstdCompressor()
    val generator = StringGenerator()

    "compress should reduce data size" {
        val original = generator.generateString(12000).toByteArray()
        val compressed = compressor.compress(original)
        compressed.size shouldBeLessThan original.size
    }

    "decompress should restore original data" {
        val original = generator.generateString(12000).toByteArray()
        val compressed = compressor.compress(original)
        val decompressed = compressor.decompress(compressed, original.size)
        decompressed shouldBe original
    }
}) {
}
