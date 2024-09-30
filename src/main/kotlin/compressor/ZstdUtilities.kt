package learn.toni.compressor

import com.github.luben.zstd.Zstd

class ZstdCompressor {
    fun compress(data: ByteArray, compressionLevel : Int = 3): ByteArray = Zstd.compress(data, compressionLevel)

    fun decompress(data: ByteArray, originalSize: Int): ByteArray = Zstd.decompress(data, originalSize)

    fun getCompressionRatio(originalSize: Int, compressedSize: Int): Double = compressedSize.toDouble() / originalSize
}

class StringGenerator {
    fun generateString(length: Int): String = (1..length).map { ('a'..'z').random() }.joinToString("")
}
