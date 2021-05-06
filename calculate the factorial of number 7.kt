//Create a program in Kotlin to calculate the factorial of number 7.
fun main() {
    var factorial = 1
    for (i in 7 downTo 1){
        factorial *= i
    }

    println("factorial of number 7 using for-loop=$factorial")



    var x=7
    var g=1
    while(x >=1){
        g*=x
        x--
    }
    println("factorial of number 7 using while loop=$g")

    var a=7
    var b=1
    do{
        b*=a
        a--
    }while(a >=1)
    println("factorial of number 7 using do-while loop=$b")
}
