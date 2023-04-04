package fr.nsenave.ddi.api.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("ddi/store")
@Tag(name = "Store DDIs")
public class PostExample {

    @PostMapping
    Mono<Void> storeDDI(@RequestPart Mono<FilePart> ddiFile) {
        return null;
    }

}
