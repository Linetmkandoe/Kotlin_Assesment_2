//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
isPalindrome("Linet")
calculations(23,10,2)

}



fun isPalindrome(word: String): Boolean {
   var forward = 0
   var backward = word.length - 1
   while (forward < backward) {
      if (word[forward] != word[backward]) {
         println(false)
         return false
      }
      forward++
      backward--
   }
   println(true)
   return true
}

//fun arrays(num1:Int,num2:Int,num3:Int) :Int{





//fun sentence() :String{
//  var str = "Barnie bakes brown bagels and buns"
//   str = str.trim()
//
//
//   return str}

fun calculations(num1:Int,num2:Int,num3:Int):Int{
        val sum = num1+num2+num3
        return sum


var modulus = sum%3
    return modulus
    }