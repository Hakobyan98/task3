infix fun IntArray.add(elem:Int) : IntArray{
    val array = IntArray(this.size + 1)
    if(this.size != 0) {
        for (i in 0..this.size - 1) {
            array[i] = this[i]
        }
    }
    array[this.size] = elem
    return array
}


infix fun IntArray.insert(elem:Int) : IntArray{
    val array = IntArray(this.size + 1)
    if(this.size != 0) {
        for (i in 0..this.size - 1) {
            array[i] = this[i]
        }
    }
    array[this.size] = elem
    return array
}

infix fun IntArray.at(index:Int):IntArray {
    val array = IntArray(this.size - 1)
    for(i in 0..this.size - 2){
        if(i == index){
            array[i] = this[this.size - 1]
        }else array[i] = this[i]
    }
    return array
}



infix fun IntArray.`remove at`(index : Int):IntArray{
    if(this.size == 0){
        println("empty array")
    } else this.set(index,0)
    return this
}

infix fun IntArray.print(range: IntRange){
    for(i in range)
        println(this[i])
}


infix fun IntArray.get(str : String):Int{
    if(str == "size")
        return this.size
    else return 0
}

infix fun IntArray.print(str:String){
    if(str == "all"){
        for(i in this)
            println(i)
    }
}

fun main(args: Array<String>) {

    var arr = IntArray(0)
    arr = arr add 3 // create new array and add element at the end
    arr = arr add 7 add 1
    arr = arr add 9 add 6 add 8
    arr = arr insert 5 at 2 // insert 5 into position 2
    arr = arr `remove at` 3 // set to 0 at position 3
    arr = arr `remove at` 1
    arr print 2..5 // 5 0 6 8


    // optional
    /*
    println()
    println(arr get size) // 6
    arr print all // 3 0 5 0 6 8

     */

}


