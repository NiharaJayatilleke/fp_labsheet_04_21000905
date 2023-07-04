import scala.io.StdIn.readInt

object Q2 extends App{

  def patternMatching(x: Int):String = x match{
    case x if(x <= 0) => "Negative/Zero";
    case x if(x % 2 == 0)  => "Even Number";
    case _ => "Odd Number";
  }

    printf("Enter an integer: ")
    val input = readInt();
    print(patternMatching(input));
}
