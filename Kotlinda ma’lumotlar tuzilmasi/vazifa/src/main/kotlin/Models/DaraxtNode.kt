package Models

class DaraxtNode(val talaba: Talaba, var left: DaraxtNode? = null, var right: DaraxtNode? = null)

class Daraxt {
    var root: DaraxtNode? = null

    fun qosh(talaba: Talaba) {
        root = qosh(root, talaba)
    }

    private fun qosh(current: DaraxtNode?, talaba: Talaba): DaraxtNode {
        if (current == null) {
            return DaraxtNode(talaba)
        }

        if (talaba.ism < current.talaba.ism) {
            current.left = qosh(current.left, talaba)
        } else if (talaba.ism > current.talaba.ism) {
            current.right = qosh(current.right, talaba)
        }

        return current
    }

    fun nazoratQil() {
        nazoratQil(root)
    }

    private fun nazoratQil(current: DaraxtNode?) {
        if (current != null) {
            nazoratQil(current.left)
            println("Ism: ${current.talaba.ism}, Yosh: ${current.talaba.yosh}")
            nazoratQil(current.right)
        }
    }
}
