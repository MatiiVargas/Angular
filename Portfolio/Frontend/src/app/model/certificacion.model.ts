export class educacion{
    id?: number;
    titulo: String;
    fecha: String;
    academia: String;

    constructor(titulo: String,fecha: String, academia: String){
        this.titulo = titulo;
        this.fecha = fecha;
        this.academia = academia;
    }
}