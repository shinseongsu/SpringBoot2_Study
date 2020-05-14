package com.sample.web.admin.controller.html;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseForm implements Serializable {

    private static final long serialVersionUID = 893506941860422885L;

    String auditUser;

    LocalDateTime auditDateTime;

    Integer version;

    public abstract Long getId();

    public boolean isNew() {
        return getId() == null;
    }

}
