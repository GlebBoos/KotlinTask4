fun main(args: Array<String>) {
    var K1:Boeing747=Boeing747(1000)
    var K2:Airbus=Airbus(2000)
    var K3:SpaceX=SpaceX(3000)
    var K4:FIGTHER3000 = FIGTHER3000(100.0, 11,"Пустой")

    do {
        println()
        println()
        println()
        println("Введите число, соответствующее соответственному полю ввода")
        println("1. Вывод данных на дисплей по Boeing747")
        println("2. Вывод данных на дисплей по AirBus")
        println("3  Вывод данных на дисплей по SpaceX")
        println("4  Вывод данных на дисплей по ИСТРЕБИТЕЛЮ 3000 ТРА-ТА-ТА")
        println("0  Нажмите 0 для выхода из программы")
        println()
        println()
        println()
        val userText1: String? = readLine()
        var a: String = userText1.toString()
        when(a.toInt()){
            1 ->
            {
                println("Ниже отображены данные по Boeing747")
                K1.display()
                println();
            }

            2 -> {
                println("Ниже отображены данные по AirBus")
                K2.display()
                println();
            }
            3 -> {
                println("Ниже отображены данные по SpaceX")
                K3.display()
                println();
            }
            4 -> {
                println("Ниже отображены данные по ИСТРЕБИТЕЛЮ 3000")
                println(K4.toString())
                println();
            }
            0 -> {
                print("Работа с данной задачей завершена ")
            }

            else -> println("Ошибка! Некорректное значение!")
        }
    }while (a.toInt()>0)
}

interface Passenger{
    val _vmest_pass:Int
}

interface Gruz{
    val _gruz:Int
}

interface machinegun{
    val _dal:Double
    val _kal:Byte
    val _boekomplekt:String
}

data class FIGTHER3000(var dal:Double,var kal:Byte, var boekomplekt:String):machinegun
{
    override val _dal:Double
    init
    {
        _dal=dal
    }

    override val _kal:Byte
    init
    {
        _kal=kal
    }

    override val _boekomplekt:String
    init
    {
        _boekomplekt=boekomplekt
    }
}

abstract class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _nom_sud:Int
    init{
        _nom_sud=nom_sud
    }

    val _max_dal: Double
    init{
        _max_dal=max_dal
    }

    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }

    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км

    open internal fun display(){   // функция видна в текущем модуле

        println("Номер судна: $_nom_sud  Максимальная дальность: $_max_dal Вместимость бака: $_vm_bal Расход литров на км: $ras_top")

    }
}

class Boeing747(vmest_pass:Int):Aircraft(nom_sud=415,max_dal = 100000.0,vm_bal = 500.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
    override fun display() {
        println("Номер судна: $_nom_sud  Максимальная дальность: $_max_dal Вместимость бака: $_vm_bal Расход литров на км: $ras_top Вместимость пассажиров: ${_vmest_pass}m")
    }
}

class Airbus(vmest_pass:Int):Aircraft(nom_sud=744,max_dal = 100000.0,vm_bal = 800.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
}

class SpaceX(gruz:Int):Aircraft(nom_sud=666,max_dal = 200000.0,vm_bal = 600.0),Gruz{
    override val _gruz:Int
    init
    {
        _gruz=gruz
    }
    override fun display() {
        println("Номер судна: $_nom_sud  Максимальная дальность: $_max_dal Вместимость бака: $_vm_bal Расход литров на км: $ras_top Грузоподъемность: $_gruz")
    }


}


//Задача 23
/*
fun main(args: Array<String>) {
    val auto: Auto = Auto("Audi", "Black",666)
    println(auto.toString())
}

data class Auto(var marka: String, var color: String, var nubmer: Int)
 */


//Задача 22

/*
fun main(args: Array<String>) {
    var K1:Boeing747=Boeing747(1000)
    var K2:Airbus=Airbus(2000)
    K1.display()
    K2.display()
}

interface Passenger{
    val _vmest_pass:Int
}

abstract class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _nom_sud:Int
    init{
        _nom_sud=nom_sud
    }

    val _max_dal: Double
    init{
        _max_dal=max_dal
    }

    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }

    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км

    open internal fun display(){   // функция видна в текущем модуле

        println("Номер судна: $_nom_sud  Максимальная дальность: $_max_dal Вместимость бака: $_vm_bal Расход литров на км: $ras_top")

    }
}

class Boeing747(vmest_pass:Int):Aircraft(nom_sud=415,max_dal = 100000.0,vm_bal = 500.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
    override fun display() {
        println("Номер судна: $_nom_sud  Максимальная дальность: $_max_dal Вместимость бака: $_vm_bal Расход литров на км: $ras_top")
    }
}

class Airbus(vmest_pass:Int):Aircraft(nom_sud=744,max_dal = 100000.0,vm_bal = 800.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
}


 */

//Задача 21

/*
fun main(args: Array<String>) {
    var K1:Boeing747=Boeing747(1000)
    var K2:Airbus=Airbus(2000)
    println(K1.ras_top)
    println(K2.ras_top)
}

interface Passenger{
    val _vmest_pass:Int
}

abstract class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _nom_sud:Int
    init{
        _nom_sud=nom_sud
    }

    val _max_dal: Double
    init{
        _max_dal=max_dal
    }

    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }

    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км
}

class Boeing747(vmest_pass:Int):Aircraft(nom_sud=415,max_dal = 100000.0,vm_bal = 500.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
}

class Airbus(vmest_pass:Int):Aircraft(nom_sud=744,max_dal = 100000.0,vm_bal = 800.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
}
 */


//Задача 20
/*
fun main(args: Array<String>) {
    var K1:Aircraft=Aircraft(815,10000.0,50000.0)
    var K2:Boeing747=Boeing747(1000)
    println(K1.ras_top)
    println(K2.ras_top)
}

interface Passenger{
    val _vmest_pass:Int
}

open class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _max_dal: Double
    init{
        _max_dal=max_dal
    }
    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }
    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км
}

class Boeing747(vmest_pass:Int):Aircraft(nom_sud=415,max_dal = 100000.0,vm_bal = 500.0),Passenger{
    override val _vmest_pass:Int
    init
    {
        _vmest_pass=vmest_pass
    }
}
*/

//Задача 19
/*
fun main(args: Array<String>) {
    var K1:Aircraft=Aircraft(815,10000.0,50000.0)
    var K2:Boeing747=Boeing747(1000)
    //var K3:Aircraft=Boeing747(1000)
    println(K1.ras_top)
    println(K2.ras_top)
}

open class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _max_dal: Double
    init{
        _max_dal=max_dal
    }
    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }
    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км
}


class Boeing747(vmest_pass:Int):Aircraft(nom_sud=415,max_dal = 100000.0,vm_bal = 500.0){
    var _vmest_pass: Int=0
    init
    {
        _vmest_pass=vmest_pass
    }
}
*/




//Задача 18
/*
fun main(args: Array<String>) {
    var K:Aircraft=Aircraft(815,10000.0,50000.0)
    println(K.ras_top)
}

class Aircraft constructor(nom_sud:Int, max_dal:Double,vm_bal:Double){
    val _max_dal: Double
    init{
        _max_dal=max_dal
        }
    val _vm_bal: Double
    init{
        _vm_bal=vm_bal
    }
    val ras_top: Double
        get()=_vm_bal/_max_dal //расход литров на км
}
*/


//Задача 17
/*
fun main(args: Array<String>) {
    var K:Aircraft=Aircraft()
    println(K.ras_top)
}
class Aircraft{
    var nom_sud: Int=815 //номер
    var max_dal: Double=10000.0 //км
    var vm_bal: Double=50000.0 //литры
    val ras_top: Double
        get()=vm_bal/max_dal //расход литров на км
}
*/
