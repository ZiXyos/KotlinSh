 /*
 ** Just Killians who try Kotlin
 ** And He Want To do A Shell
 ** XAXAXAXA
 ** He IS To bad at code
 */

import com.LexerParser.Tokenisation as tokener
import kotlin.system.exitProcess

 private fun readln() = readLine()!!;
 val envrmnt: MutableMap<String, String> = System.getenv();

 val tok = tokener
private fun printPrompt(): String{

    var envVar: String = System.getenv("USER") ?: "default_value";
    var prompt: String = "HEY " + envVar + ": "
    return (prompt);
}

fun main(args: Array<String>) {

    var x: Int = 1;

    while (x == 1) {
        print(printPrompt());
        val input = readln() ?: exitProcess(84);
        var str = tokener.seperate_word(input);
        var cmd = tokener.check_key(tokener.key_cmd() ,str);
        closer(cmd);
    }
}

 fun closer(str: String) {

     if(str == "exit") {

         exitProcess(0)
     }
 }