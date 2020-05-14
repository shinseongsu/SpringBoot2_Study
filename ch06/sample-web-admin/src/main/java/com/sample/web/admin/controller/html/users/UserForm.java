package com.sample.web.admin.controller.html.users;

import com.sample.web.admin.controller.html.BaseForm;
import com.sample.web.admin.controller.html.Annotation.ContentType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class UserForm extends BaseForm {

    private static final long serialVersionUID = -6807767990335584883L;

    Long id;

    @NotEmpty
    String firstName;

    @NotEmpty
    String lastName;

    @NotEmpty
    String password;

    @NotEmpty
    String passwordConfirm;

    @NotEmpty
    @Email
    String email;

    @Digits(fraction = 0, integer = 10)
    String tel;

    String zip;

    String address;

    @ContentType(allowed = { MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_GIF_VALUE })
    transient MultipartFile userImage;


    @Override
    public Long getId() {
        return null;
    }
}
