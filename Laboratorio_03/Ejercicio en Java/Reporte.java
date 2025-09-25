class Reporte {
   public static String generarReporte(Estudiante estudiante) {
      StringBuilder reporte = new StringBuilder();
      reporte.append("=== REPORTE ACADÉMICO ===\n");
      reporte.append("Estudiante: ").append(estudiante.getNombre()).append("\n");
      reporte.append("Edad: ").append(estudiante.getEdad()).append(" años\n");
      reporte.append("Carrera: ").append(estudiante.getCarrera()).append("\n");
      reporte.append("Promedio: ").append(estudiante.getPromedio()).append("\n");

      if (estudiante.getPromedio() >= 18.0) {
         reporte.append("Estado: EXCELENTE\n");
      } else if (estudiante.getPromedio() >= 15.0) {
         reporte.append("Estado: BUENO\n");
      } else if (estudiante.getPromedio() >= 11.0) {
         reporte.append("Estado: REGULAR\n");
      } else {
         reporte.append("Estado: NECESITA MEJORAR\n");
      }

      reporte.append("========================");
      return reporte.toString();
   }
}