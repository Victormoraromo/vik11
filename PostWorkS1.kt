package s1

fun main ()



{
 val ProductPrice = 200F
 println(ProductPrice)
 val ProductPrice2 = 150F
 println(ProductPrice2)

 println("El precio del artículo1 es de ${ProductPrice} ")
 println("El precio del artículo2 es de ${ProductPrice2} ")

 val Name ="Victor"
 val Enterprise = "Bedu"
 val uid = "3624-2332-5480"
 val credit = 828.33
 val gender = false
 val age = 38

 val amount = ProductPrice + ProductPrice2 // la suma del precio de unos productos
 val tax = 1.16f //el porcentaje con impuestos
 val total = amount*tax; //valor total con impuestos sumados
 println("El total a pagar con impuesto es de $total pesos")

 val isLegal = age>=18
 println("El usuario es mayor de edad? $isLegal")


}