# Ejercicio 28: Chat en Tiempo Real con LocalStorage

## Descripción

Este proyecto consiste en un chat en tiempo real donde los mensajes enviados por el usuario se almacenan en el `localStorage`. Cuando un mensaje es enviado, se guarda en el almacenamiento local y aparece en la lista de mensajes del chat. Al recargar la página, los mensajes previamente enviados siguen siendo visibles, ya que permanecen almacenados en el `localStorage` del navegador.

## Entrada

- El usuario ingresa un mensaje en el campo de texto.
- Al hacer clic en el botón "Enviar", el mensaje se guarda en el `localStorage` y se muestra en la lista del chat.

## Salida

- Los mensajes enviados por el usuario se agregan a una lista en la interfaz.
- Los mensajes se mantienen en el chat incluso después de recargar la página, ya que están almacenados en `localStorage`.

## Ejemplo

### Entrada

- Usuario escribe en el campo de texto: `¡Hola! ¿Cómo estás?`
- Usuario hace clic en el botón "Enviar".

### Salida

- El mensaje `¡Hola! ¿Cómo estás?` se agrega al chat y aparece en la lista de mensajes.
- Si el usuario recarga la página, el mensaje sigue apareciendo en el chat.
