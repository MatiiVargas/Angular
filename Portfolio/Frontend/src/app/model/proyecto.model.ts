export class proyectos{
    id?: number;
    rotulo: String;
    contenido: String;
    picture: String;

    constructor(rotulo: String,contenido: String, picture: String){
        this.rotulo = rotulo;
        this.contenido = contenido;
        this.picture = picture;
    }
}