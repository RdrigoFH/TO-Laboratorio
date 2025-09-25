class Estudiante extends Persona {
   private String carrera;
   private double promedio;

   public Estudiante(String nombre, int edad, String carrera, double promedio) {
      super(nombre, edad);
      this.carrera = carrera;
      this.promedio = promedio;
   }

   public String getCarrera() {
      return carrera;
   }

   public void setCarrera(String carrera) {
      this.carrera = carrera;
   }

   public double getPromedio() {
      return promedio;
   }

   public void setPromedio(double promedio) {
      this.promedio = promedio;
   }

   @Override
   public String toString() {
      return "Estudiante [" + super.toString() + ", Carrera: " + carrera + ", Promedio: " + promedio + "]";
   }
}