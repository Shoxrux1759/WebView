interface ChatMediator {
    fun sendMessage(message: String, user: User)
}

class ChatMediatorImpl : ChatMediator {

    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    override fun sendMessage(message: String, user: User) {
        for (u in users) {
            if (u != user) {
                u.receiveMessage(message)
            }
        }
    }
}


    class User(private val name: String, private val mediator: ChatMediator) {
        fun sendMessage(message: String) {
            println("$name yuboradi: $message")
            mediator.sendMessage(message, this)
        }

        fun receiveMessage(message: String) {
            println("$name ko`rdi: $message")
        }
    }

