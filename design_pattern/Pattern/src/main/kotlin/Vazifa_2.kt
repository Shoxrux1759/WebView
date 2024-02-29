fun main() {
    val mediator = ChatMediatorImpl()

    val user1 = User("Ali", mediator)
    val user2 = User("Bobur", mediator)
    val user3 = User("Charos", mediator)

    mediator.addUser(user1)
    mediator.addUser(user2)
    mediator.addUser(user3)

    user1.sendMessage("Salom, hammaga!")
    user2.sendMessage("Salom, Ali!")
    user3.sendMessage("Barchangiz bilan tanishganimdan xursandman!")
}
