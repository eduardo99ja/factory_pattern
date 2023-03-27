package com.apodaca.factorypattern

class BreadFactory : AbstracFactory() {
    override fun getBread(breadType: String?): Bread? {
        if (breadType == null) return null
    
        if (breadType == "BAG"){
            return Baguette()
        } else if (breadType == "ROL"){
            return Roll()
        } else if (breadType == "SLI"){
            return Sliced()
        }
    
        return null
    }
    
    override fun getFilling(fillingType: String?): Filling? = null
    
    override fun getDrink(drinkType: String?): Drink? = null
}