package com.apodaca.factorypattern

class FillingFactory : AbstracFactory() {
    override fun getBread(breadType: String?): Bread? = null
    
    override fun getFilling(fillingType: String?): Filling? {
        if (fillingType == null) return null
        
        if (fillingType == "CHE"){
            return Chesse()
        } else if (fillingType == "TOM"){
            return Tomato()
        } else if (fillingType == "HAM"){
            return Ham()
        }
        
        return null
    }
    
    override fun getDrink(drinkType: String?): Drink? = null
}