# Calculador JUnit Test
Actividad 5 sobre testing en JUnit sobre clase Calculador.

# Grupo
* Albornoz Franco Ezequiel
* Cabrera Paulo Nicolás
* Cubillos Pablo Matías

# Detalles
1. Realizar la clase java calculador que permite por el momento, realizar las cuatro operaciones matemáticas básicas. Use solo para Suma y Resta de números con coma.
2. Crear la clase Junit desde NetBeans caluladorTest, que pone a prueba la clase anterior usando las anotaciones correspondientes
3. Use la anotación @Test y assertEquals para testear la resta y la suma use un delta de 0.001
4. Use las anotación @BeforeClass para inicializar (new) el calculador y mostrar mensaje de bienvenida. Utilice la anotaciones:
5. @Before antes de cada método, que muestre un mensaje de la operación que se testea. Use System.out.println(Thread.currentThread().getStackTrace([1].getMethodName());
6. @After para que luego de cada método testeado que diga "Prueba finalizada, campos en 0”.
7. Coloque un @AfterClass luego, que nos indique que “la operación ha finalizado”.
8. En otro archivo divisionTest, cree el método testDivisionCero use @Test (expected) que lance una AritmethicException.
9. En un tercer archivo parameterTest, cree una prueba parametrizada con el método testDivCero. Use @RunWith(value=Parameterized.class) e Iterable<Object[]> tomarDatos previo @Parameters para la suma usando conjuntos de valores como: 8, 7, 15, 2, 0, 20, y 10, -1, -9. Devuelva Arrays.asList(new Object[][] {{ x,x,x}{x,x,x}}).
10. Cree un Test Suite ‘miSweetSuite’, que ejecute en orden los 3 árboles de pruebas, tendrá un @RunWith(Suite.class) @Suite.SuiteClasses({paquete.ejemploTest.class, paquete.ejemploTest.class})
