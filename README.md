# repo-one

1. Ejercicio FizzBuzz
El programa recorre los números del 1 al 100 con un ciclo for.
Se utiliza el operador módulo (%) para comprobar si un número es múltiplo de 3, 5 o ambos:
Si es múltiplo de 3 y de 5, imprime "fizzbuzz".
Si solo es múltiplo de 3, imprime "fizz".
Si solo es múltiplo de 5, imprime "buzz".
Si no es múltiplo de ninguno, imprime el número.
Este programa muestra los números con un salto de línea entre cada uno.

2. Ejercicio sucesión Fibonacci
- Variables num1 y num2: 
Estas almacenan los dos últimos números de la sucesión. Inicialmente, num1 es 0 y num2 es 1.
- Primer número impreso: 
Directamente imprimimos num1, que es 0, fuera del ciclo.
- Ciclo for: 
El ciclo itera 49 veces (para completar los 50 números). En cada iteración:
 _ Se imprime num2.
 _ Se calcula el siguiente número de la sucesión sumando num1 y num2.
 _ Se actualizan num1 y num2 para preparar el siguiente paso de la sucesión.
- Formato: 
Para mantener la separación con comas, imprimimos la coma excepto después del último número.
- Uso de long: 
Se utiliza long en lugar de int ya que los números de Fibonacci crecen rápidamente y pueden exceder el límite de un int.

3. Ejercicio numeros primos
- Método verificarPrimos():
1- Entrada del usuario: Se solicita un número al usuario para verificar si es primo.
2- Verificación del número primo: Se comprueba si el número es primo. Si es menor que 2, no es primo. Para números mayores, se utiliza un ciclo for para verificar divisores entre 2 y la raíz cuadrada del número.
3- Impresión de los primos entre 1 y 100: Dentro del mismo método, se utiliza otro ciclo for para recorrer los números del 2 al 100 y verificar cuáles son primos.
- Uso de solo static void:
1- Todo el código está dentro de un método static void que no devuelve valores y hace todo dentro de un solo bloque de código.
2- El método verificarPrimos() se encarga tanto de verificar el número ingresado por el usuario como de imprimir los primos entre 1 y 100.
