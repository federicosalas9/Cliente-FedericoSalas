package cliente.federicosalas

class AgenciesController {

    def agenciesService

    def index() {}

    def enviar() {
        agenciesService.mostrarSitios(params.site_id, params.payment_method_id,
                params.latitud, params.longitud,params.radio,params.limit,params.offset,params.criterio)
    }
}
