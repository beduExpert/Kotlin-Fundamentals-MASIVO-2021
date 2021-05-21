class User(var name: String, val lastName: String, var userAge: Int, private var status: String, var isMale: Boolean) {

    fun setStatus(status: String) {
        this.status = status
    }

    fun setAge(age: Int) {
        userAge = age
    }

}