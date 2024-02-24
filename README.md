# Laboratorio 5 - MVC
En este laboratorio, se explorará la creación de aplicaciones web utilizando el framework Spring MVC. Las aplicaciones web son sistemas de software diseñados para ser utilizados a través de un navegador web. Estos sistemas son necesarios para una variedad de propósitos, incluyendo la presentación de información, la interacción con bases de datos, y la realización de operaciones comerciales.

## Primera parte. Jugando a ser un cliente HTTP
1.	Abra una terminal Linux o consola de comandos Windows.
   Para ello se uso una máquina de Linux que se encuentra disponible en https://bellard.org/jslinux/vm.html?url=alpine-x86.cfg&mem=192
  	![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/477eb5b8-8faa-4014-8003-360707654cd8)

2.	Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
    * Host: www.escuelaing.edu.co
    * Puerto: 80 Teniendo en cuenta los parámetros del comando telnet.
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/ef978f01-9466-4b9d-8ec8-f1637ee7dc2d)

3.	Antes de que el servidor cierre la conexión por falta de comunicación
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/d36fc971-302b-40d5-aba2-cf259bd04f6a)
### Tipos de errores - Preguntas
* ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.

  El código de error que sale es 301, que representa un error de direccionamiento e indica que el recurso al que se quería llegar ha sido asignado a una nueva URI y cualquier referencia futura a este recurso deberán usar un URI válido.

* ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?
  Existen los siguientes códigos de error:
  * __10x:__ La solicitud fue recibida, se continua con el proceso.
  * __20x:__ La solicitud fue recibida exitosamente, entendida y aceptada.
  * __30x:__ Se necesitan tomar acciones para completar la solicitud.
  * __40x:__ La solicitud contiene una sintaxis inválida o no puede ser resuelta.
  * __50x:__ El servidor falló en resolver una solicitud aparentemente válida.

4.	Realice una nueva conexión con telnet, esta vez a:
    * Host: www.httpbin.org
    * Puerto: 80
    * Versión HTTP: 1.1
    Ahora, solicite (GET) el recurso /html
    Se obtiene como resultado la siguiente página wew, la cual contiene un fragmento del texto de Moby Dick

    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/ca46b368-c0c2-47b6-8386-0a1593b171d9)
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/aaa6d242-98ac-46c0-835b-6bb50b39f274)

5. Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres
    Para ello lo que se hizo fue copiar el archivo a un txt en el directorio local de Windows.
   ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/50d01e41-93a9-487d-8cc6-609fe5d6c2db)
    Luego se usó la consola de Git Bash para contar las palabras que se encuentran en este.
   ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/6a47abc8-9bf0-4709-93e4-f544fa81a063)

### Tipos de peticiones - Preguntas
* ¿Cuál es la diferencia entre los verbos GET y POST?
  
  El método __GET__ solicita la transferencia de una representación seleccionada actual para el recurso objetivo. Es el mecanismo principal para obtener información.
  El método __POST__ solicita que el recurso de destino procese la representación adjunta a la solicitud de acuerdo con su semántica específica. Se usa para enviar bloques de datos, colocar un mensaje, crear un nuevo recurso, agregar datos, entre otras funciones.

* ¿Qué otros tipos de peticiones existen?
  Los otros tipos de peticiones que existen son:
  * HEAD 
  * PUT
  * DELETE
  * CONNECT
  * OPTIONS
  * TRACE

6. En la práctica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la línea de comandos
   * __curl www.httpbin.org__
     
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/35f9097a-22dd-4a3a-bf40-dbde0e37cdd0)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/ba055132-6c21-4f8c-8304-21b0cd66eb9d)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/b6e760b9-6870-4edd-9208-1f7f789ca7c5)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/5044f552-3e24-468c-ad02-19ade3832f8e)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/c661eb83-5bb4-40ac-9638-789b3caf1ffb)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/f43c465f-0547-4546-b0fc-340d3aeb4995)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/1493c4f4-dc86-4dc8-9a16-ebc7f5f26241)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/9c737057-86c9-4636-9fc1-8cafdd37d054)
     ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/2b6c609f-2025-4517-85b4-a809a8cc29ef)
  
  * __curl -v www.httpbin.org__
    
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/5b3fc07c-a738-4c85-95a8-82c0e5caa888)
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/bb652827-5635-4753-8b8f-163c7816be77)

  * __curl -i www.httpbin.org__
    
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/88e0de06-fd52-4e90-a057-d270c36d2766)
    ![image](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/c6f21e56-de58-4c3e-87a5-25fec9c4faca)

### Parametros de curl - Preguntas
* ¿Cuáles son las diferencias con los diferentes parámetros?
  
  El parámetro -i incluye los encabezados de respuesta HTTP en la salida.
  El parámetro -v brinda una salida con más detalle para realizar un debug.

    
## Segunda parte. Haciendo una aplicación web dinámica usando el patrón MVC
1. Creación de la página web
   
   ![Imagen de WhatsApp 2024-02-22 a las 18 37 43_75dd4f2f](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/669430e7-d205-4419-842f-30827d4074ff)

2. Cambiar el parámetro del path de la página web para un saludo personalizado

   ![Imagen de WhatsApp 2024-02-22 a las 18 37 52_e857c7a3](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/4067e022-70c3-4a14-a7fc-6400cb85424f)

3. Creación del home

    ![Imagen de WhatsApp 2024-02-22 a las 18 42 38_fea198f0](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/4cbaf4db-9442-4227-8e6a-e414d7058285)


### Preguntas
* ¿Por qué MVC obtiene ese nombre?
  
  Lo obtiene debido a las siglas de Modelo, Vista y Controlador. 
  __Modelo:__ un modelo contiene los datos de la aplicación. Un dato puede ser un solo objeto o una colección de objetos.
  __Controlador:__ un controlador contiene la lógica empresarial de una aplicación. Aquí, la anotación @Controller se utiliza para marcar la clase como controlador.
  __Vista:__ una vista representa la información proporcionada en un formato particular. Generalmente, se utiliza JSP+JSTL para crear una página de visualización. Aunque Spring también admite otras tecnologías de visualización como Apache Velocity, Thymeleaf y FreeMarker.

* ¿Cuáles son las ventajas de usar MVC?
  
  * __Roles separados:__ Spring MVC separa cada rol, donde el objeto modelo, controlador, objeto de comando, resolución de vista, DispatcherServlet, validador, etc. pueden ser cumplidos por un objeto especializado.
  * __Ligero:__ utiliza un contenedor de servlets liviano para desarrollar e implementar su aplicación.
  * __Configuración potente:__ proporciona una configuración sólida tanto para el marco como para las clases de aplicaciones que incluye referencias sencillas entre contextos, como desde controladores web hasta objetos comerciales y validadores.
  * __Desarrollo rápido:__ Spring MVC facilita un desarrollo rápido y paralelo.
  * __Código comercial reutilizable:__ en lugar de crear nuevos objetos, nos permite utilizar los objetos comerciales existentes.
  * __Fácil de probar:__ en Spring, generalmente creamos clases JavaBeans que le permiten inyectar datos de prueba utilizando los métodos de establecimiento.
  * __Mapeo flexible:__ proporciona anotaciones específicas que redirigen fácilmente la página.

* ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
  
  Los directorios se distribuyen en la lógica de la aplicación y los archivos donde se especifica como luce (HTML).

* ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
  * __@Controller:__ Se usa para identificar la clase que va a ser el controlador.
  * __@GetMapping:__ Se usa para que las solicitudes HTTP GET/greeting se asignen al método greeting().
  * __@RequestParam:__ Se usa para asignar el valor del parámetro ingresado al parámetro del método greeting().
  * __@ResponseBody:__ Anota un método para devolver el resultado directamente al cuerpo de la respuesta HTTP.

## Tercera Parte. Aplicación MVC para consumo de servicio restful
1. Paso uno

  ![Imagen de WhatsApp 2024-02-23 a las 19 30 37_8cf801b3](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/bda7b40b-9a88-426b-8825-c50dd7663e7f)

2. Paso 2

   ![Imagen de WhatsApp 2024-02-23 a las 19 31 19_d64bcc0d](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/62e77934-6fef-484a-89af-b9aa3cb6e894)

3. Paso 3

   ![Imagen de WhatsApp 2024-02-23 a las 19 31 47_68c2f1e4](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/4916e447-34e8-47a8-9e1e-fa99d146bfe7)

4. Paso 4

   ![Imagen de WhatsApp 2024-02-23 a las 19 32 05_bc6c839e](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/4ebd1e6b-4ec2-42f7-87bc-6f2a1c57a136)

5. Paso 5

   ![Imagen de WhatsApp 2024-02-23 a las 19 32 33_be767331](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/12c5fa5b-06bc-475d-9d71-6e4ee24da6e9)

6. Paso 6

   ![Imagen de WhatsApp 2024-02-23 a las 19 32 50_3a558a7b](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/27e9aad2-e925-4d50-97fd-96b793a94b4f)
 
7. Paso 7

   ![Imagen de WhatsApp 2024-02-23 a las 19 33 10_28030fe7](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/149fd351-396f-4ae7-9166-bef36ac36ca5)

8. Paso 8

   ![Imagen de WhatsApp 2024-02-23 a las 19 33 20_ab86273c](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/74c9e22f-d497-4b78-9cc0-6c7ec7bf48ad)

9. Ejecutar el comando mvnw spring-boot:run

   ![Imagen de WhatsApp 2024-02-23 a las 19 34 15_4c1b7c47](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/522e9bf8-18fc-4d73-b5ac-1e76affcedce)

10. Paso 10

    ![Imagen de WhatsApp 2024-02-23 a las 19 34 27_97e82e9c](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/1c5d8c9c-0508-4373-b0e4-85e5bd61c496)

11. Paso 11

    ![Imagen de WhatsApp 2024-02-23 a las 19 34 37_d31176da](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/3ae6fc60-5105-4aff-8a66-16c939cf8b6d)

12. Paso 12

    ![Imagen de WhatsApp 2024-02-23 a las 19 34 47_a735c25b](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/29baadf3-9046-49aa-969a-567ba8ea6026)

13. Paso 13

    ![Imagen de WhatsApp 2024-02-23 a las 19 34 57_dd7ecd5d](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/1c91e31d-6970-4af1-b381-8d47d27baf15)

14. Paso 14

    ![Imagen de WhatsApp 2024-02-23 a las 19 35 09_d7cc4dc0](https://github.com/alexandrac1420/CVDS_Lab-5_Cortes_Rojas_Vasquez/assets/138069735/95db42c7-49c0-49d5-aa3d-56487b685b40)


### Preguntas
* ¿Qué es RESTful?
  
  RESTful es un estilo arquitectónico de diseño de sistemas distribuidos basado en el protocolo HTTP. Se basa en principios como la interoperabilidad, la escalabilidad, la simplicidad y la independencia de la implementación.
  
* Si utilizo un framework como Boostrap CSS para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?
  
  Bootstrap CSS es un framework de diseño web que proporciona componentes y estilos predefinidos para crear interfaces de usuario atractivas y responsivas. Su uso sería principalmente en la capa de Vista, ya que se encarga de la presentación y la interfaz de usuario.

## Cuarta Parte. Aplicación MVC Juego




## Bibliografia
* ¿Qué es una API de RESTful? - Explicación de API de RESTful - AWS. (s. f.). Amazon Web Services, Inc. https://aws.amazon.com/es/what-is/restful-api/
* RFC 7231: Hypertext Transfer Protocol (HTTP/1.1): Semantics and Content. (s. f.). IETF Datatracker. https://datatracker.ietf.org/doc/html/rfc7231#autoid-72
* S, E. (2023, 1 diciembre). What Is a cURL Command and How to Use It. Hostinger Tutorials. https://www.hostinger.com/tutorials/curl-command-with-examples-linux/
* What is a REST API? (s. f.). https://www.redhat.com/en/topics/api/what-is-a-rest-api
* What is a REST API? | IBM. (s. f.). https://www.ibm.com/topics/rest-apis
## Construido con
* Java 17.0.1
* Maven 3.9.6
  
## Autores
* __Alexandra Cortes Tovar__
* __Samuel Rojas Yopasa__
* __Juan Sebastián Vásquez Vega__ 
