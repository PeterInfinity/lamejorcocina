# lamejorcocina
proyecto java en J2EE, primefaces 5, wildfly 14x y postgres 9x

REQUISITOS:

1. saber clonar un proyecto con versionamiento GIT
2. conocimientos en Eclipse, J2EE
3. conocer el servidor Wildfly y la base de datos Postgres

DESPLIEGUE:

1. descargar wildfly 14 y configurarlo como target-runtime en eclipse, usar el standalone.xml
2. colocar el DS en el standalone.xml del wildfly:

                <datasource jndi-name="java:jboss/datasources/lacocinaDS" pool-name="lacocinaDS">
                    <connection-url>jdbc:postgresql://localhost:5432/lamejorcocina</connection-url>
                    <driver-class>org.postgresql.Driver</driver-class>
                    <driver>postgresql-42.2.5.jar</driver>
                    <security>
                        <user-name>postgres</user-name>
                        <password>postgres</password>
                    </security>
                    <validation>
                        <valid-connection-checker class-name="org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLValidConnectionChecker"/>
                        <background-validation>true</background-validation>
                        <exception-sorter class-name="org.jboss.jca.adapters.jdbc.extensions.postgres.PostgreSQLExceptionSorter"/>
                    </validation>
                </datasource>
              
3. crear una base de datos postgres con el nombre 'lamejorcocina'
4. clonar el proyecto localmente en la ubicacion de su preferencia
5. ejecutar el comando 'mvn clean install' en la ruta parent del proyecto: /lamejorcocina
6. como la libreria JPA se le va a delegar al servidor; en el proyecto EJB-JPA /lamejorcocinamodel click derecho 
  y establecer el 'target-runtime' del proyecto, para este caso seleccionar el wildfly 14 
7. realizar el mismo paso anterior para el proyecto /lamejorcocinaweb
8. click derecho en el proyecto /lamejorcocinaear y 'Run as -> Run on Server' o bien desplegando el servidor y en deployments
  agregar el ear generado en /lamejorcocinaear/target/lamejorcocina.ear
