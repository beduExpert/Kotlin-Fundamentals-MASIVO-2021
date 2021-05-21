fun main() {
    val implicitVal = "Esta es una string implícita" //debe ser string
    println(implicitVal.javaClass.kotlin)

    val implicitNumber = 13.5 //debe ser Int
    println(implicitNumber.javaClass.kotlin)

    val explicitVal: String = "Aprende Kotlin con Bedu"
    println(explicitVal.javaClass.kotlin)

    var long = 27L //Long
    println(long.javaClass.kotlin)

    //literales
    val hexadecimal = 0x0F
    println(hexadecimal.javaClass.kotlin)
    val binary = 0b00001011
    println(binary.javaClass.kotlin)

    //underscore
    val oneMillion = 1_000_000
    println(oneMillion)

    //caracter
    val c = 'A'
    println(c.javaClass.kotlin)
    println(c)

    //booleanos
    val trueVal = true
    val falseVal = false
    println(trueVal.javaClass.kotlin)
    println(trueVal)
    println(falseVal.javaClass.kotlin)
    println(falseVal)

    //Strings
    val dialogue: String = "It's a secret to everybody"
    println(dialogue)
    val logoZelda = """
                                       /@
                       __        __   /\/
                      /==\      /  \_/\/   
                    /======\    \/\__ \__
                  /==/\  /\==\    /\_|__ \
               /==/    ||    \=\ / / / /_/
             /=/    /\ || /\   \=\/ /     
          /===/   /   \||/   \   \===\
        /===/   /_________________ \===\
     /====/   / |                /  \====\
   /====/   /   |  _________    /  \   \===\    THE LEGEND OF 
   /==/   /     | /   /  \ / / /  __________\_____      ______       ___
  |===| /       |/   /____/ / /   \   _____ |\   /      \   _ \      \  \
   \==\             /\   / / /     | |  /= \| | |        | | \ \     / _ \
   \===\__    \    /  \ / / /   /  | | /===/  | |        | |  \ \   / / \ \
     \==\ \    \\ /____/   /_\ //  | |_____/| | |        | |   | | / /___\ \
     \===\ \   \\\\\\\/   /////// /|  _____ | | |        | |   | | |  ___  |
       \==\/     \\\\/ / //////   \| |/==/ \| | |        | |   | | | /   \ |
       \==\     _ \\/ / /////    _ | |==/     | |        | |  / /  | |   | |
         \==\  / \ / / ///      /|\| |_____/| | |_____/| | |_/ /   | |   | |
         \==\ /   / / /________/ |/_________|/_________|/_____/   /___\ /___\
           \==\  /               | /==/
           \=\  /________________|/=/    
             \==\     _____     /==/ 
            / \===\   \   /   /===/
           / / /\===\  \_/  /===/
          / / /   \====\ /====/
         / / /      \===|===/
         |/_/         \===/
                        =  
"""
    println(logoZelda)

    val edad: Int = 27
    println("Mi edad es $edad")

    println("En dos años tendré ${edad+2} años")

}
