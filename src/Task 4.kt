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
