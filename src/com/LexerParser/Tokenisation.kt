package com.LexerParser

public class Tokenisation() {
    companion object cmdCheck {

        public fun seperate_word(str: String): List<String> {

            var strList = str.split(" ", ",", "\n");
            return strList;
        }

        public fun key_cmd(): List<String> {

            var cmdList: List<String> = mutableListOf("ls", "cd", "echo");
            return cmdList;
        }

        public fun check_key(list_cmd: List<String>, strList: List<String>): String {

            var i: Int = 0;
            var str: String = "";

            for (str in strList) {

                if (str == list_cmd.elementAt(i)) return  (str);
            }
            return (str);
        }
    }
}