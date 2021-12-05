import scala.math._

def funcion(x:Double, n:Int): Double = Math.pow(x,2) - n

// Derivada de la función cuadrática, 2x
def derivada(x: Double): Double = 2 * x

def metodo(n: Int): Double = {
  if(n < 0) {
    println("EL numero negativo será positivo")
    // Lo hago positivo multiplicando por -1
    var positivo = n * -1
    var x = 1.0
    (1 to 5).foreach(i => x = x - funcion(x, positivo.round) / derivada(x))
    x
  }
  else {
    var positivo = n
    var x = 1.0
    (1 to 5).foreach(i => x = x - funcion(x, positivo.round) / derivada(x))
    x
  }
}
metodo(-10)
metodo(10)
