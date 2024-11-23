package game.godschaos.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@CrossOrigin
@RequestMapping(ResourceConstants.BASE_URL)
public class HomeResource {

    @RequestMapping(path = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHome() {
        return ResponseEntity.ok("Hello World!");
    }
}
