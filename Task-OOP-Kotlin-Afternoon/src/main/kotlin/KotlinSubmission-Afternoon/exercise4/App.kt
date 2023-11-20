package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.NumberFormatException

fun main() {
    val inputString = "raisa28"
    try{
        val integerValue = inputString.toInt()
        println("string berhasil: $integerValue")
    }catch (e:NumberFormatException){
        println("gagal")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


