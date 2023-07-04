import scala.io.StdIn.readFloat

object Q1 extends App{

  def interest(y: Double): Double = y match{
    case y if(y <= 20000) => y * 2 / 100;
    case y if(y <= 200000) => y * 4 / 100;
    case y if(y <= 2000000) => y * 3.5 / 100;
    case y if(y >= 2000000) => y * 6.5 / 100;
  }

    printf("Enter the deposit amount : ")
    val num = readFloat();
    var i: Double = interest(num);
    printf("Interest is Rs. %.2f", i);
}
