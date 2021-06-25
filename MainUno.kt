///hola mundo
//victor manuel mora romo
//hola mundo

const val PI =3.1416
const val PI2 =3.1416
//Primer programa para conquista del mundo
fun  main()
{

 var direccion : String
 direccion = "Direccion"
 println(direccion)
 println("--------")
 //--Reto 1
   println("Hola Mundo")
   println("--------------------")
    //---Reto 2
   val decimal1 = 1.3421                                    //Decimal Long
   println(decimal1.javaClass.kotlin)                       //la clase de la variable
   val decimal2 = 1.93287F                                  //Decimal punto flotante
   println(decimal2.javaClass.kotlin)                       //la clase de la variable
   val result =PI * 2* decimal2                             //Resultado
   println("el perimetro del circulo es : $result")          //Impresion resultado
   println("--------------------")
//--------Tipos de Datos

    val implicitVal = "Esta es una string implícita" //debe ser String
    println(implicitVal.javaClass.kotlin)
    println(implicitVal)

    val implicitNumber = 13 //debe ser Int
    println(implicitNumber.javaClass.kotlin)
    println(implicitNumber)
    println("--------------------")
    val c="a"
    println(c.javaClass.kotlin)
    println(c)
    val cc='a'
    println(c.javaClass.kotlin)
    println(cc)
    val trueval = true
    println(trueval.javaClass.kotlin)
    println(trueval)
    println("--------------------")
//----- Variables Explicitas

    val explicitVal: String = "Aprende Kotlin con Bedu"
    println(explicitVal.javaClass.kotlin)
    println(explicitVal)

//----- Booleanos

    val trueVal = true
    val falseVal = false
    println(trueVal.javaClass.kotlin)
    println(trueVal)
    println(falseVal.javaClass.kotlin)
    println(falseVal)
    println("------------------")

    val logoZelda = """
                                       /@
                       __        __   /\/
                      /==\      /  \_/\/   
                    /======\    \/\__ \__
                  /==/\  /\==\    /\_|__ \
               /==/    ||    \=\ / / / /_/
             /=/    /\ || /\   \=\/ /     
          /===/   /   \||/   \   \===\
        /===/   /_________________ \===\
     /====/   / |                /  \====\
   /====/   /   |  _________    /  \   \===\    THE LEGEND OF 
   /==/   /     | /   /  \ / / /  __________\_____      ______       ___
  |===| /       |/   /____/ / /   \   _____ |\   /      \   _ \      \  \
   \==\             /\   / / /     | |  /= \| | |        | | \ \     / _ \
   \===\__    \    /  \ / / /   /  | | /===/  | |        | |  \ \   / / \ \
     \==\ \    \\ /____/   /_\ //  | |_____/| | |        | |   | | / /___\ \
     \===\ \   \\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |
       \==\/     \\\\/ / //////   \| |/==/ \| | |        | |   | | | /   \ |
       \==\     _ \\/ / /////    _ | |==/     | |        | |  / /  | |   | |
         \==\  / \ / / ///      /|\| |_____/| | |_____/| | |_/ /   | |   | |
         \==\ /   / / /________/ |/_________|/_________|/_____/   /___\ /___\
           \==\  /               | /==/
           \=\  /________________|/=/    
             \==\     _____     /==/ 
            / \===\   \   /   /===/
           / / /\===\  \_/  /===/
          / / /   \====\ /====/
         / / /      \===|===/
         |/_/         \===/
                        =  
"""
    println(logoZelda)
    println("-----------------")

    val edad: Int = 27
    println("Mi edad es ${edad+2} años")
    println("-------------")

 //--------------Reto 3--------------------
    val y2 =-2f
    val y1 =3
    val x2 =-3
    val x1 =4

    val m=(y2-y1)/(x2-x1)
    println("La pendiente es: ${m}")
    println ("-------")
    println("Enter the text")
    val stringInput = readLine()!!
    println(stringInput)
    println("----------")

}