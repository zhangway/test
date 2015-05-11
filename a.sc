case class Contact(name: String, age: Int)

case class Address(addr1: String, code: String)

case class Info(contact: Option[Contact], address: Option[Address])


object a {

  val info:Option[Info] = None                    //> info  : Option[Info] = None
  
  println(info.get.contact.get.name)              //> java.util.NoSuchElementException: None.get
                                                  //| 	at scala.None$.get(Option.scala:347)
                                                  //| 	at scala.None$.get(Option.scala:345)
                                                  //| 	at a$$anonfun$main$1.apply$mcV$sp(a.scala:12)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at a$.main(a.scala:8)
                                                  //| 	at a.main(a.scala)
}