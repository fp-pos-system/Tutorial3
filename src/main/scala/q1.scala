object q1 {
  def main(args: Array[String]): Unit ={
    var vowels = Map('a' -> 0, 'e' -> 0, 'i' -> 0, 'o' -> 0, 'u' -> 0);
    print("Enter the word :");
    val inputstring = scala.io.StdIn.readLine();
    var letters = inputstring.toList;

    for(c <- letters){
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        var temp = vowels(c);
        temp+=1;
        vowels+=(c->temp);
      }
    }

    println("No of a's - " + vowels('a'));
    println("No of e's - " + vowels('e'));
    println("No of i's - " + vowels('i'));
    println("No of o's - " + vowels('o'));
    println("No of u's - " + vowels('u'));

    println("No of letters : " + letters.length);

  }
}
