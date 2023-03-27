package com.apodaca.factorypattern
class DrinkFactory : AbstracFactory() {
    override fun getBread(breadType: String?): Bread? = null
    
    override fun getFilling(fillingType: String?): Filling? = null
    
    override fun getDrink(drinkType: String?): Drink? {
        if (drinkType == null) return null
        
        if (drinkType == "COK"){
            return Coke()
        } else if (drinkType == "BEE"){
            return Beer()
        }
        
        return null
    }
}