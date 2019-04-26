package cliente.federicosalas

import grails.gorm.transactions.Transactional
import groovy.json.JsonSlurper

@Transactional
class AgenciesService {

    //Funcion que se en carga de hacer un requerimiento a la API Agencies segun los datos cargados en el formulario
    def mostrarSitios(String site_id, String payment_method_id, String latitud,
                      String longitud, String radio, String limit, String offset, String criterio) {
        def urlSitios = new URL('http://localhost:8000/agencias/' + site_id + '/' + payment_method_id +
                '?offset='+offset+'&near_to='+latitud+','+longitud+','+radio+'&limit='+limit+'&criterio='+criterio)
        def connection = (HttpURLConnection) urlSitios.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def agencies = json.parse(connection.getInputStream())
        [agencies: agencies.data]
    }
}
