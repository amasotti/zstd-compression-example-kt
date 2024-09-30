package learn.toni


import learn.toni.compressor.StringGenerator
import learn.toni.compressor.ZstdCompressor

fun main() {
    val randomStringGenerator = StringGenerator()
    val compressor = ZstdCompressor()

    val randomString = randomStringGenerator.generateString(12_000)
    println("Original string length: ${randomString.length}")

    val stringAsByteArray = randomString.toByteArray()
    val compressedString = compressor.compress(stringAsByteArray)
    println("Compressed string length: ${compressedString.size}")

    val decompressedByteArray = compressor.decompress(compressedString, stringAsByteArray.size)
    val decompressedString = decompressedByteArray.decodeToString()
    println("Decompressed string length: ${decompressedString.length}")

    check(randomString == decompressedString) { "Decompressed string is not equal to original string" }

    val compressionRatio = compressor.getCompressionRatio(stringAsByteArray.size, compressedString.size)
    println("Compression ratio: %.2f".format(compressionRatio))
}
