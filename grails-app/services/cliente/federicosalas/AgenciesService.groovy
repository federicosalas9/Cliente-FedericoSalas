package cliente.federicosalas

import grails.gorm.transactions.Transactional
import groovy.json.JsonSlurper

import javax.xml.bind.ValidationException

@Transactional
class AgenciesService {

    def validarFormulario(String site_id, String payment_method_id, String latitud,
                          String longitud, String radio, String limit, String offset, String criterio) {
        if (site_id == " " || site_id.length() > 3) {
            throw new ValidationException("El siteid no puede ser nulo ni mayor a 3 caracteres")
        }

        if (criterio == " " || payment_method_id.equals("distance") || payment_method_id.equals("address_line") || payment_method_id.equals("agency_code")) {
            throw new ValidationException("El criterio no puede ser nulo " +
                    "y debe tener alguno de los sig. valores:distance, agency_code o address_line")
        }

        if (latitud == " "||latitud.length()>10) {
            throw new ValidationException("La latitud no puede ser nula ni mayor a 10 caracteres incluyendo el - y el .")
        }

        if (longitud == " "||longitud.length()>9) {
            throw new ValidationException("La longitud no puede ser nula ni mayor a 9 caracteres incluyendo el - y el .")
        }

        if (radio == " ") {
            throw new ValidationException("El radio no puede ser nulo")
        }

        if (limit == " ") {
            throw new ValidationException("El limite de cantidad de agencias de respuersta no puede ser nulo")
        }

        if (offset == " ") {
            throw new ValidationException("El offset no puede ser nulo")
        }

        if (payment_method_id == " ") {
            throw new ValidationException("El limite de cantidad de agencias de respuersta no puede ser nulo")
        }
    }

    //Funcion que se en carga de hacer un requerimiento a la API Agencies segun los datos cargados en el formulario
    def mostrarSitios(String site_id, String payment_method_id, String latitud,
                      String longitud, String radio, String limit, String offset, String criterio) {
        def urlSitios = new URL('http://localhost:8000/agencias/' + site_id + '/' + payment_method_id +
                '?offset=' + offset + '&near_to=' + latitud + ',' + longitud + ',' + radio + '&limit=' + limit + '&criterio=' + criterio)
        def connection = (HttpURLConnection) urlSitios.openConnection()
        connection.setRequestMethod("GET")
        connection.setRequestProperty("Accept", "application/json")
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        JsonSlurper json = new JsonSlurper()
        def agencies = json.parse(connection.getInputStream())
        [agencies: agencies.data]
    }
}
