package com.mycompany.contacthub.forms;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserForm {
    private String name;
    private String email;
    private String phone;
    private String password;
    private String about;
}
