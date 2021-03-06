import Model.Cereal
import Model.Meat
import Model.Milk
import Model.Water
import kotlin.system.exitProcess

val noValue = {println("Chose a valid option")}

fun main(args: Array<String>) {

  menu@do{
     println("""
         
         ::Welcome to Recipe Maker::

         Select the option desired
         1. Make a Recipe
         2. See my Recipes
         3. Exit
     """.trimIndent())
        val resp:String? = readLine()
        val respF:Int = resp?.toIntOrNull() ?:0

        when (respF){
           1 -> makeRecipe()
           2 -> println("First Make a Recipe")
           3 -> println("Good Bye")
           0 -> noValue()
        }

    }while (respF != 3)
   exitProcess(0)
}
fun makeRecipe(){
    println("""
    __________________________________________________________   
    |Make a recipe                                           |
    |Selected by category, the ingredient you´re looking for |
    ----------------------------------------------------------
    """.trimIndent())
   // Feature Version width data persistence -> println("First make your categories")
   val categories =
   arrayOf<String>("1. Agua",
                   "2. Leche",
                   "3. Carne",
                   "4. Verduras",
                   "5. Frutas",
                   "6. Cereal",
                   "7. Huevos",
                   "8. Aceites")
    for (c in categories){
        println(c)
    }
    val catSelect:Int = {readLine()?.toIntOrNull()?:-1} ()
    viewRecipe(catSelect,categories)
}

fun viewRecipe(catSelect: Int ,categories: Array <String>){
   if(catSelect <= -1){
       noValue()
       makeRecipe()
   }else if(catSelect <= categories.size){

       when(catSelect){
            1 -> agua()
            2 -> leche()
            3 -> carne()
            4 -> verduras()
            5 -> frutas()
            6 -> cereal()
            7 -> huevos()
            8 -> aceites()
       }

   }
   else{
       noValue()
       makeRecipe()
   }

}
fun agua()
{
   val water:Water = Water()
   water.view(water.typo,water.quantity,water.listOfOptions)
}
fun leche()
{
  val milk:Milk = Milk()
  milk.view(milk.typo,milk.quantity,milk.listOfOptions)
}
fun carne()
{
 val meat:Meat = Meat()
 meat.view(meat.typo,meat.quantity,meat.listOfOptions)
}
fun cereal()
{
    val cereal:Cereal = Cereal()
    cereal.view(cereal.typo,cereal.quantity,cereal.listOfOptions)
}
fun verduras()
{

}
fun frutas()
{

}
fun huevos()
{

}
fun aceites()
{

}