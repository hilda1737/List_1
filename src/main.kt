      fun main() {
            name(listOf("Hilda","Moraa","Sakina","Marion","Asha","Catherine","Jane","Mary","Ann"))
            val x =heightOfPeople(listOf(5,4,9, 7, 5, 10))
            println(x)
            var q = Person("Sharon", 64,3.5,65.0)
            var h = Person("Fiona",25,5.5,70.0)
            var y = Person("Becky",55,7.0,45.5)
            var list = listOf(q,h,y)
            var listorder = list.sortedBy { person->person.age }
            println(listorder)

            var t = Person("Jacob",75,5.9,70.9)
            var b= Person("Mufasa",35,7.9,66.0)
            var list1= listOf(t,b)
            println(list1.plus (list))

            var wargon = Cars("Kbc123",90)
            var Jeep = Cars("KDB234", 150)
            var Cars = listOf(wargon,Jeep)
            println(listofobjects(Cars))


        }


        fun name(names:List<String>):List<String>{
            names.forEachIndexed { name, k ->
                if(name%2==0){
                    println(k)
                }
            }
            return names

        }
        fun heightOfPeople(numbers: List<Int>):String{
            val j = numbers.sum()
            var average = numbers.average()
            var totalheight= "$j, $average"

            return totalheight
        }


                data class Person(var name:String,var age:Int,var height:Double, var weight:Double)

        fun add(name:List<Any>):List<Any>{
            return listOf()
        }

     data class Cars(var registration: String, var mileage:Int)
        fun listofobjects(vehicles: List<Cars>):Int{
            var M = 0
            vehicles.forEach{ cars -> cars.mileage
                M+=cars.mileage

            }
            var average = M/vehicles.count()
            return average
        }