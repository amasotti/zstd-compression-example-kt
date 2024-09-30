package learn.toni.compressor

import com.github.luben.zstd.Zstd

class ZstdCompressor {
    fun compress(data: ByteArray): ByteArray = Zstd.compress(data)

    fun decompress(data: ByteArray, originalSize: Int): ByteArray = Zstd.decompress(data, originalSize)
}

class StringGenerator {
    fun generateString(length: Int): String = (1..length).map { ('a'..'z').random() }.joinToString("")
}
