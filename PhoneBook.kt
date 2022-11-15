import java.io.BufferedReader
import java.io.FileReader

/*
 * These projects were created for my training.
 * Please do not use it as reliable information.
 * Sincerely, M.Zazulin.
 */

class PhoneBook {
    private val phoneBook = mutableMapOf<String, String>() // Для хранения адрессов

    fun fillingOutThePhoneBookAndPrint(inputFile: String) { // в случае точного ключа, лучше использовать это
        BufferedReader(FileReader(inputFile)).use { br ->
            var line: String?
            while (br.readLine().also { line = it } != null) {
                val bufferedData = line!!.split("  ")
                phoneBook[bufferedData[0]] = bufferedData[1]
            }
        }
        println(phoneBook[readln()])
    }
}

fun main() {
    val binSer = PhoneBook()
    binSer.fillingOutThePhoneBookAndPrint("./src/main/txt_materials/Phone_book.txt")
}
