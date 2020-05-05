package com.havi.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("fruit")
public class FruitProperties {
    private String colorName;
}
