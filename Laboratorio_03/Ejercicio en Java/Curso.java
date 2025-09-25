class Curso {
   private String nombre;
   private String codigo;
   private Horario horario; // Composición: si el curso se destruye, el horario también

   public Curso(String nombre, String codigo, String dia, String horaInicio, String horaFin) {
      this.nombre = nombre;
      this.codigo = codigo;
      // Composición: el curso crea y posee el horario
      this.horario = new Horario(dia, horaInicio, horaFin);
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getCodigo() {
      return codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public Horario getHorario() {
      return horario;
   }

   // No hay setter para horario porque es composición - el horario pertenece al
   // curso

   @Override
   public String toString() {
      return "Curso [" + codigo + " - " + nombre + ", " + horario + "]";
   }
}