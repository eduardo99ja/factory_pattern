package com.apodaca.factorypattern

abstract class AbstracFactory {
 abstract fun getBread(breadType: String?): Bread?
 abstract fun getFilling(fillingType: String?): Filling?
 abstract fun getDrink(drinkType: String?): Drink?
}