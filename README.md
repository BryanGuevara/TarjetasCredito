# Validador de Números

## Descripción

El programa **Validador de Números** es una aplicación de consola en Java que valida un número de acuerdo con el algoritmo de Luhn, que se usa comúnmente para verificar la validez de números de tarjetas de crédito y otros identificadores numéricos. El algoritmo consiste en verificar si el número cumple con una serie de reglas matemáticas específicas.

## Funcionalidades

- Solicita al usuario un número en formato de cadena.
- Verifica que el input sea numérico.
- Aplica el algoritmo de Luhn para validar el número.
- Muestra si el número es válido o no según el algoritmo.

## Uso

1. Al ejecutar el programa, se te pedirá que ingreses un número en formato de cadena.
2. El programa verificará que el input sea numérico y aplicará el algoritmo de Luhn para validar el número.
3. El resultado indicará si el número es válido o no.

## Ejemplo de Ejecución
### Validas

```plaintext
=================================================== <[Entrada]> ==================================================
Intoduzca un numero: 4532015112830366
=================================================== <[Validacion]> ===============================================
El número 4532015112830366 es una tarjeta válida.
==================================================================================================================


### No Validas

```plaintext
=================================================== <[Entrada]> ==================================================
Intoduzca un numero: 9876543210987654 
=================================================== <[Validacion]> ===============================================
El número 9876543210987654 no es una tarjeta válida.
==================================================================================================================