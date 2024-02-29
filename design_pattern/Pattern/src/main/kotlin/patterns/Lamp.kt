class Lamp {
    var currentState: LampState = OffState(this)

    fun turnOn() {
        currentState.turnOn()
    }

    fun turnOff() {
        currentState.turnOff()
    }

    fun breakLamp() {
        currentState.breakLamp()
    }
}

    interface LampState {
        fun turnOn()
        fun turnOff()
        fun breakLamp()
    }

    class OnState(private val lamp: Lamp) : LampState {
        override fun turnOn() {
            println("Chiroq allaqachon yoqilgan.")
        }

        override fun turnOff() {
            println("Chiroqni o'chirish.")
            lamp.currentState = OffState(lamp)
        }

        override fun breakLamp() {
            println("Chiroqni sindirish.")
            lamp.currentState = BrokenState(lamp)
        }
    }

    class OffState(private val lamp: Lamp) : LampState {
        override fun turnOn() {
            println("Chiroqni yoqish.")
            lamp.currentState = OnState(lamp)
        }

        override fun turnOff() {
            println("Chiroq allaqachon o'chirilgan.")
        }

        override fun breakLamp() {
            println("Chiroqni sindirish.")
            lamp.currentState = BrokenState(lamp)
        }
    }

    class BrokenState(private val lamp: Lamp) : LampState {
        override fun turnOn() {
            println("Chiroq buzilgan va uni yoqish mumkin emas.")
        }

        override fun turnOff() {
            println("Chiroq buzilgan va uni o'chirib bo'lmaydi.")
        }

        override fun breakLamp() {
            println("Chiroq allaqachon buzilgan.")
        }
    }

