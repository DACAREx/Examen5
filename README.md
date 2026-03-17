1. Responde brevemente a las siguientes cuestiones: 
2. ¿Por qué ItemBiblioteca se ha definido como clase abstracta?

Se ha definido asi ya que gracias a esto todas las clases que hereden de esta 
pueden y tienen que usar sus metodos y asi poder usarlo en cada una de sus hijas.

3. Explica por qué la relación entre Libro y Autor es composición y no herencia.
 
No es herencia porque como se puede observar no autor no tiene los atributos de
libro ni libro los de autor.

4. Indica dos ventajas de usar encapsulación en las clases del ejercicio. 

Es util la encapsulacion para ser mas preciso ya que si dejamos privados los atributos
de los objetos mientras que estos son publicos podemos usarlos más facilmente desde
otras clases sin poder acceder a los atributos y asi siendo más consistente.

5. ¿Por qué ConfiguracionSistema podría declararse como final? 

Esto es debido a que al declarar algo como final, lo declaramos como una constante, 
lo que hace que no se pueda modificar de ninguna manera y asi no poder cambiarlo por
error ya que aqui se configuran cosas como el numero maximo de objetos(Items) que
puede tener el sistema.

6. ¿Qué ocurriría si el atributo contador de ContadorItems no fuera estático? 

lo que ocurriria es que no cambiaria el contador y se mantendria en el dato dado al
principio.

7. En qué situaciones es más adecuado utilizar herencia en lugar de composición. 

En caso de que no queramos compartir los atributos de un objeto a otro como en el 
caso de autor y libro es mejor la composicion mientras que si si queremos que los
compartan o mas bien los "hereden" de ahi el nombre será mejor la herencia.

8. ¿Qué métodos importantes heredan todas las clases de Object? Menciona al menos 
tres. 

ToString(), GetClass(), Equal().

9. Explica brevemente el polimorfismo y cómo aparece en este ejercicio. 

El polimorfismo es la capacidad de un objeto de actuar como otro por asi decirlo.

10. Observa el siguiente método: 

public static void modificarTitulo(String titulo) { 
titulo = "Nuevo título"; 
} 
y la llamada: 
String t = "Java"; 
modificarTitulo(t); 
System.out.println(t); 

1. ¿Qué se imprimirá? 
2. Explica por qué ocurre esto en Java. 

Se imprimira Java ya que en java funciona de manera que al entrar en un metodo
se hace una copia de la variable en este caso t (habiendo en este caso 2) la que
esta en memoria y la que se queda por asi decirlo en la parte del codigo entonces
al pasar por el metodo se cambia el titulo a la variable t que esta en memoria y no 
a la "actual" y entonces al imprimirla se imprimira la "actual".
