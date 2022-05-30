export class educacion{
    id?: number;
    carrera: String;
    instituto: String;
    anio: String;

    constructor(carrera: String,instituto: String, anio: String){
        this.carrera = carrera;
        this.instituto = instituto;
        this.anio = anio;
    }
}