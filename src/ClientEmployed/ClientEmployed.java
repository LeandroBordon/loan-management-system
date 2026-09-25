package ClientEmployed;

import lombok.Getter;
import lombok.Setter;

public class ClientEmployed {
    @Getter
    @Setter
    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String type_user;

    public ClientEmployed(Long id,String name,String surname,String phone,String email,String type_user) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.type_user = type_user;
    }

}
