export class idioma{
    id?: number;
    denominar: String;
    escuela: String;
    periodo: String;

    constructor(denominar: String,escuela: String, periodo: String){
        this.denominar = denominar;
        this.escuela = escuela;
        this.periodo = periodo;
    }
}