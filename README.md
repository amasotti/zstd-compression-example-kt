# Test zstd compression library with Kotlin

This is a simple example of how to use the zstd compression library with Kotlin.
The zsdt library is a high performance compression library that can be used to compress and decompress data; it's 
lossless and supports multithreading. It was developed by Facebook as modern alternative to the zlib library.

**Zstd** is used by a large number of projects, including the Linux kernel, AWS (e.g. one of the main compression algorithms
used by [AWS Athena](https://docs.aws.amazon.com/athena/latest/ug/compression-support-zstd-levels.html#:~:text=The%20ZSTD%20library%20supports%20compression,speed%20but%20larger%20file%20sizes.))

## JNI Bindings

- [zstd-jni](https://github.com/luben/zstd-jni) - JNI bindings for the zstd library.


## Resources

- [zstd](https://facebook.github.io/zstd/#other-languages)
- [Main Implementation in C](https://github.com/facebook/zstd)
- [RFC 8878](https://datatracker.ietf.org/doc/html/rfc8878)
