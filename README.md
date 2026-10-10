# TallerUnidad1_2 - Operadores y Estructuras de Decisión en Java

Taller práctico sobre operadores, estructuras de decisión (`if-else`, operador ternario, `switch`) y depuración de código en Java.

## Requisitos

| Herramienta | Versión |
|---|---|
| **JDK** | **17 o superior** (LTS recomendado: 17 o 21) |
| Maven | 3.6+ (opcional, solo si compilas desde terminal) |
| IDE | IntelliJ IDEA o NetBeans |

### ¿Por qué JDK 17 o superior?

El código usa características que no existen en versiones antiguas de Java:

- `switch` moderno con notación de flecha (`->`) y como expresión (Java 14+).
- Múltiples etiquetas por caso, como `case 1, 2, 3 ->` (Java 14+).

El mínimo técnico es **JDK 14**, pero se recomienda **JDK 17** porque es una versión LTS (soporte a largo plazo) y es la que pide el enunciado del taller.

### Atención: versión configurada en el `pom.xml`

El `pom.xml` actual tiene configurado Java 23:

```xml
<maven.compiler.source>23</maven.compiler.source>
<maven.compiler.target>23</maven.compiler.target>
```

Esto significa que, **tal como está**, el proyecto solo compila con **JDK 23 o superior**. Si tienes JDK 17 o 21 instalado, tienes dos opciones:

1. **Instalar JDK 23** y dejar el `pom.xml` sin cambios.
2. **Bajar la versión en el `pom.xml`** (recomendado). Cambia los valores por la versión de tu JDK, por ejemplo 17:

```xml
<maven.compiler.source>17</maven.compiler.source>
<maven.compiler.target>17</maven.compiler.target>
```

Si ves el error `invalid target release: 23` o `release version 23 not supported`, es esto: tu JDK es más antiguo que el configurado en el `pom.xml`.

## Cómo verificar tu versión de Java

```bash
java -version
javac -version
```

Ambos deben mostrar la misma versión mayor (17 o superior). Si `javac` no se reconoce, tienes instalado solo el JRE; instala el **JDK** completo.

## Estructura del proyecto

```
src/main/java/
├── Main.java                  # Reto 1: clasificación de edades
├── Reto2.java                 # Reto 2: aprobación de notas y asistencia
├── Reto3.java                 # Reto 3: tarifas de entrada
├── Seccion1Operadores.java    # Sección 1: calentamiento de operadores
├── Ternario.java              # Refactorización a operador ternario
├── SwitchTradicional.java     # Sección 3: switch clásico con break
├── SwitchModerno.java         # Sección 3: switch con flecha (->)
├── RetoIntegrador.java        # Sección 4: facturación con descuentos e IVA
├── ErrorAsignacion.java       # Sección 5: fragmento 1 (= vs ==)
├── ErrorComparacionString.java# Sección 5: fragmento 2 (== vs equals)
├── ErrorFallThrough.java      # Sección 5: fragmento 3 (switch sin break)
└── ErrorPrecision.java        # Sección 5: fragmento 4 (división entera)
```

## Cómo ejecutar

### Desde el IDE

Abre el proyecto, haz clic derecho sobre la clase que quieras y selecciona **Run** (en IntelliJ: `Shift + F10`).

### Desde la terminal

```bash
mvn compile
java -cp target/classes RetoIntegrador
```

Cambia `RetoIntegrador` por el nombre de cualquier otra clase. Las clases que usan `Scanner` (`Main`, `Reto2`, `Reto3`, `SwitchTradicional`, `SwitchModerno`) esperan datos por consola.

## Resultados esperados del Reto Integrador

| Caso | Entrada | Total a pagar |
|---|---|---|
| A | `cantidad = 3`, `VIP`, `PROMO1 año` | **$638.00** |
| B | `cantidad = 1`, `NUEVO`, `PROMO1 año` | **$275.50** |

## Nota sobre codificación

El proyecto usa UTF-8 (cupón `PROMO1 año`, tildes en mensajes). Si ves caracteres extraños en la consola de Windows, ejecuta antes:

```powershell
chcp 65001
```
