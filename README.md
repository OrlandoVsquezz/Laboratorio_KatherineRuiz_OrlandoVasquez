Katherine Andrea Ruiz Bonilla
Daniel Orlando Pérez Vásquez

Katherine: Main, Método de registrar usuario, Método de validar disponibilidad de username
Daniel: Clase usuarios, Método de inicio de sesión, Método de eliminar

(Las preguntas estan en el archivo ANALISIS.md pero por si acaso, también estan aquí)

1. ¿Por qué ArrayList o LinkedList NO son aceptables?
ArrayList y LinkedList no son la mejor opción para resolver el problema porque al tener una complejidad de O(n) lineal, se deben recorrer todos los elementos de las listas de inicio a fin para los procesos de búsqueda y validación de username, mientras mas crezcan las listas, mayor será el tiempo de respuesta, lo que incumple el requisito de velocidad y la eficiencia del sistema. Además, es necesario que el Username sea único para cada usuario, no son adecuadas porque ambas estructuras permiten datos duplicados.

2. ¿Por qué HashSet NO resuelve el problema por si solo?
Porque aunque tiene funcionalidades similares a HashMap no permite asociar los datos adicionales como el nombre completo y la contraseña con una clave (key-value), sino que, solo guarda un dato o un conjunto individual.

3. ¿Por qué TreeMap NO es la opción ideal?
Porque la complejidad temporal O(log n) hace comparaciones innecesarias en los procesos de búsqueda y ordenamiento, a pesar de que es más eficiente que O(n) al reducirlo a la mitad, sigue incumpliendo el requerimiento de velocidad que HashMap si cumple.

4. ¿Cuál es la ÚNICA estructura basada en hashing que resuelve todas las operaciones en tiempo promedio constante O(1)?
HashMap es la estructura de datos más adecuada para resolver el problema, el tiempo promedio constante O(1) permite que la busqueda de elementos sea más rapida, porque no necesita comparar todos los elementos (evita procesos innecesarios), sino que solo busca por medio de la clave única. 
