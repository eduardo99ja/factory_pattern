package com.apodaca.factorypattern

class BreadFactory {

    fun getBread(breadType: String?): Bread? {
        return when (breadType) {
            "BAG" -> Baguette()
            "SLI" -> Sliced()
            "Rol" -> Roll()
            else -> null
        }
    }

}