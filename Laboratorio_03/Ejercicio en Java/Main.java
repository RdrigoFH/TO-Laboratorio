public class Main {
   public static void main(String[] args) {
      System.out.println("=== SISTEMA UNIVERSITARIO ===\n");

      // 1. Crear 2 profesores
      Profesor prof1 = new Profesor("Dr. Juan García", 45, "Matemáticas");
      Profesor prof2 = new Profesor("Dra. Ana López", 38, "Programación");

      System.out.println("PROFESORES CREADOS:");
      System.out.println(prof1);
      System.out.println(prof2);
      System.out.println();

      // 2. Crear 3 estudiantes
      Estudiante est1 = new Estudiante("María Rodríguez", 20, "Ingeniería de Sistemas", 17.5);
      Estudiante est2 = new Estudiante("Carlos Mendoza", 19, "Ingeniería Industrial", 15.8);
      Estudiante est3 = new Estudiante("Lucía Vargas", 21, "Ingeniería Civil", 12.3);

      System.out.println("ESTUDIANTES CREADOS:");
      System.out.println(est1);
      System.out.println(est2);
      System.out.println(est3);
      System.out.println();

      // 3. Crear 2 cursos (cada uno con su horario - COMPOSICIÓN)
      Curso curso1 = new Curso("Cálculo I", "MAT101", "Lunes", "08:00", "10:00");
      Curso curso2 = new Curso("Programación Java", "PRG201", "Miércoles", "14:00", "16:00");

      System.out.println("CURSOS CREADOS:");
      System.out.println(curso1);
      System.out.println(curso2);
      System.out.println();

      // 4. Crear universidad y agregar cursos (AGREGACIÓN)
      Universidad universidad = new Universidad("Universidad Nacional de Ingeniería");
      universidad.agregarCurso(curso1);
      universidad.agregarCurso(curso2);

      System.out.println("UNIVERSIDAD CON CURSOS:");
      System.out.println(universidad);

      // 5. Generar reporte de un estudiante (DEPENDENCIA)
      System.out.println("REPORTE GENERADO:");
      String reporte = Reporte.generarReporte(est1);
      System.out.println(reporte);
   }
}