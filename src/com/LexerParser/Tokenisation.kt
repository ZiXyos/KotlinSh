package com.LexerParser

import kotlin.system.exitProcess

public class Tokenisation() {

    companion object cmdCheck {

        public fun seperate_word(str: String): List<String> {

            var strList = str.split(" ", ",", "\n");
            return strList;
        }

        public fun key_cmd(): List<String> {

            var cmdList: List<String> = mutableListOf("cd", "ls", "echo", "exit");
            return cmdList;
        }

        public fun check_key(list_cmd: List<String>, strList: List<String>): String {

            var i: Int = 0;
            var j: Int = 0;
            var str: String = "";

            for (i in strList.indices) {

                if (list_cmd.contains(strList[i])) {

                    return (strList[i])
                }
            }
            return ("command Not Found");
        }
    }
}