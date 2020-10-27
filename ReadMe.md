# whereIsTheHandle
Mi solución al problema 1025 "¿Dónde está la canica?" de URI Online Judge.

Link del problema: <https://www.urionlinejudge.com.br/judge/es/problems/view/1025> <br />
Problema por: Monirul Hasan Tomal. <br />
Timelimit: 2 

## Descripción del problema:
Raju y Meena aman jugar con canicas. Ellos tienen un montón de canicas con números escritos en ellas. En el comienzo, Raju colocaría las canicas, una tras otra en orden ascendente según los números escritos en ellas. Entonces, Meena preguntaría a Raju para encontrar la primera canica con un determinado número. Ella contaría 1...2...3. Raju obtiene un punto si la respuesta es correcta, y Meena obtiene un punto si Raju falla. Después de un número fijo de intentos, el juego termina y el jugador con más puntos gana. Hoy tú tienes la posibilidad de jugar como Raju. Siendo un chico inteligente, tu tienes la ventaja de tener la computadora. Pero no puedes subestimar a Meena, ella escribió un programa para realizar un seguimiento de cuanto tiempo te toma dar todas las respuestas. Entonces ahora tienes que escribir un programa, el cual te ayudará en tu rol como Raju.
<br />
### Entrada
Puede haber múltiples casos de prueba. El número total de casos de prueba es menor que 65. Cada caso de prueba comienza con 2 enteros: N el número de las canicas y Q los números de preguntas que haría Meena. Las siguientes N líneas contiene los números escritos en N canicas. Esos números de canicas no entrarán en ningún orden en particular. Las siguientes Q líneas tendrán Q consultas. Puedes estar seguro, ninguna de los números de entrada es mas grande que 10000 y ninguno de ellos es negativo.
<br /> 
La entrada termina cuando el caso de prueba es N = 0 y Q = 0.

### Salida
Para cada caso de prueba, debe mostrarse el número de serie del caso de prueba. Por cada consulta, escribe una línea de salida. El formato de esta línea dependerá de si el número consultado está o no escrito en una de las canicas.
<br />
Los dos formatos diferentes son descriptos debajo:<br />
'x found at y', si la primera canica con número x se encontró en la posición de y. Las posiciones son enumeradas 1, 2,..., N.<br />
'x not found', si la canica con el número x no está presente.

