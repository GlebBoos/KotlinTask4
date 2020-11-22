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

