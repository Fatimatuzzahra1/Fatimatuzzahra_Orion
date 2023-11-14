package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val hari = listOf<String>("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    try{
        println("Hari ke-8 dalam satu minggu yaitu ${hari[8]}")
    }catch (error: ArrayIndexOutOfBoundsException){
        println("Terjadi kesalahan / Error ${error.message}")
    }
}

