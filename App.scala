import scala.io.StdIn.readDouble
import scala.collection.mutable.ListBuffer



object App {

  def main(args: Array[String]): Unit = {
    val s = "Hello, Scala!"
    println(s)
    println(s + " and goodbye python!")
    println(s.reverse.toString)
    println(s.toLowerCase)
    println(s.replace("!", ""))


    // Месячный оклад

    println ("Введи годовой доход трудяги>")
    val YearSalary = readDouble()
    println ("Введи размер премии (в % от годового дохода)>")
    val Bonus = readDouble()
    println ("Сколько обжорка получает деняк на пирожки?>")
    val EatBonus = readDouble()
    val MonthSalary = ((YearSalary + (YearSalary * Bonus / 100) + EatBonus) * 0.87) / 12
    println(String.format("%(.2f", MonthSalary))

    //Отклонение от среднего оклада

    val ListSalary = ListBuffer[Double](100, 150, 200, 80, 120, 75)
    val MeanSalary = ListSalary.sum / ListSalary.size // средний оклад по отделу
    val Deviation =  (( MonthSalary - MeanSalary) / MeanSalary) * 100
    println(String.format("Отклонение оклада нашего героя от среднего значения по отделу: %(.2f", Deviation) + " %")

    // Добавляем в список новую зарплату

    val NewSalary = MeanSalary + Deviation
    ListSalary += NewSalary
    val MaxSalary = ListSalary.max
    val MinSalary = ListSalary.min
    println(String.format("Самая высокая зарплата: %(.2f", MaxSalary ))
    println(String.format("Самая низкая зарплата: %(.2f", MinSalary))

    //Добавляем два значения и сортируем список

    ListSalary += (350, 90)
    val newListSalary = ListSalary.sorted
    println(newListSalary)

    //Новое значение под индексом 6
    newListSalary.insert(6, 130)
    println(newListSalary)

    // Задаем вилку зарплат для уровня middle

    println("Введите минимальную зарплату для уровня middle>")
    val x = readDouble()
    println("Введите максимальную зарплату для уровня middle>")
    val y = readDouble()

    // Номер сотрудника в списке зарплат

    for (n <- newListSalary)
    {
      if ( (n >= x) && (n <= y) )
        println (newListSalary indexOf n)

    }
    // Индексируем зарплаты на 7 процентов
    for ((i, index )  <- newListSalary.zipWithIndex)
    {
      val wageIndex = i +(i * 0.07)
      println (String.format("%(.2f", wageIndex))
    }


  }
}