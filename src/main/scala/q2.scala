import scala.io.Source

object q2 {
  def main(args: Array[String]): Unit ={
    var a:Map[Char,Int] = Map()
    val inputstring = "I love ucsc";
    var splitted = inputstring.split("[\\s+.]");

    for(c <- splitted){
      var letters = c.toList;
      for(l <- letters){
        if(a.contains(l)){
          var temp = a(l);
          temp+=1;
          a+=(l->temp);
        }else{
          a+=(l->1);
        }
      }
    }
    println(a);


  }

}
