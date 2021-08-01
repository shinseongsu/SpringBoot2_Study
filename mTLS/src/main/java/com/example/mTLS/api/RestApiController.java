package com.example.mTLS.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RestApiController {

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public ResponseEntity<?> api() {

        List<String> result = new ArrayList<>();
        result.add("sad");
        result.add("123");

        return ResponseEntity.ok(result);
    }

    @RequestMapping(value = "error", method = RequestMethod.GET)
    public ResponseEntity<?> Error() {

        Map<String, String> map = new HashMap<String, String>();
        map.put("error", "error");

        return ResponseEntity.ok(map);
    }

}
