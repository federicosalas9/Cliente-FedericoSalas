package cliente.federicosalas

class Agencie {

    Address address
    String agency_code
    String correspondent_id
    String description
    String disabled
    String distance
    String id
    String payment_method_id
    String phone
    String site_id
    String terminal

    static constraints = {
        address nullable: true
        agency_code nullable: true
        correspondent_id nullable: true
        description nullable: true
        disabled nullable: true
        distance nullable: true
        id nullable: true
        payment_method_id nullable: true
        phone nullable: true
        site_id nullable: true
        terminal nullable: true
    }
}
