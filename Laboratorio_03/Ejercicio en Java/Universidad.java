import java.util.ArrayList;
import java.util.List;

class Universidad {
   private String nombre;
   private List<Curso> cursos; // Agregación: los cursos pueden existir independientemente

   public Universidad(String nombre) {
      this.nombre = nombre;
      this.cursos = new ArrayList<>();
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public List<Curso> getCursos() {
      return cursos;
   }

   public void setCursos(List<Curso> cursos) {
      this.cursos = cursos;
   }

   // Método para agregar curso (Agregación)
   public void agregarCurso(Curso curso) {
      this.cursos.add(curso);
   }

   // Método para remover curso
   public void removerCurso(Curso curso) {
      this.cursos.remove(curso);
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Universidad: ").append(nombre).append("\n");
      sb.append("Cursos ofrecidos:\n");
      for (Curso curso : cursos) {
         sb.append("  - ").append(curso).append("\n");
      }
      return sb.toString();
   }
}