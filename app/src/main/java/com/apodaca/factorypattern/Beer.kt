package com.apodaca.factorypattern

class Beer : Drink {
    override fun name(): String = "Cerveza"
    
    override fun calories(): String = " : 155 kcal"
}