 

  object IfStructure {
    def main(args: Array[String]): Unit = {
        val n = 5
         if (n == 5) {
            print("Sí, n vale 5")
        } else if (n == 6) {
            println("Vale 6")
        } else {
            println("Tiene otro valor")
        }

        println("\n\n")

        val valor = 6
        println(valor match {
            case 1 => "Uno"
            case 2 => "Dos"
            case 3 => "Tres"
            case 4 => "Cuatro"
            case 5 => "Cinco"
            case 6 => "Seis"
            //El case _ funciona como un default
            case _ => "Ninguno"
        })
  }
}