package com.cb

object DetectCapitalScala extends App {
  def detectCapitalUse(word: String): Boolean = {
    val count = word.foldLeft(0){
      case (acc, c) if Character.isUpperCase(c) =>  acc + 1
      case (acc, _) => acc
    }
    count == 0 || count == word.length() || (count == 1 && Character.isUpperCase(word.charAt(0)))
  }

  assert(true == detectCapitalUse("USA"))
  assert(false == detectCapitalUse("FlaG"))
  assert(true == detectCapitalUse("Google"))
  assert(true ==detectCapitalUse("leetcode"))
  assert(false == detectCapitalUse("ffffffffffffffffffffF"))
}
