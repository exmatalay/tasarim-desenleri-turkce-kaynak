package ChainOfResponsibility


// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
public class JPGHandler : BaseHandler() {

    override fun handleRequest(image: Image) {
        if (image.extension === "JPG") {
            println("JPG to PNG")
            // JPG işlemine ait dönüştürme kodları işlemleri.
        } else {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            getNextHandler()?.handleRequest(image)
        }
    }
}