package com.apodaca.factorypattern

object FactoryGenerator {
    fun getFactory(factoryType: String?): AbstracFactory?{
        if (factoryType == null) return null
        
        if (factoryType == "BRE"){
            return BreadFactory()
        } else if (factoryType == "FIL"){
            return FillingFactory()
        } else if (factoryType == "DRI"){
            return DrinkFactory()
        }
        
        return null
    }
}