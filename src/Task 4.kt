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
