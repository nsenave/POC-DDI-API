package fr.nsenave.ddi.api.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("ddi")
@Tag(name = "Request DDI elements")
public class GetExample {

    @GetMapping("/{id}")
    Mono<String> getDDI(@PathVariable String id) {
        return null;
    }

    @GetMapping("/{id}/question-items")
    Mono<String> getDDIQuestionItems(@PathVariable String id) {
        return null;
    }

    @GetMapping("/{id}/variables")
    Mono<String> getDDIVariables(@PathVariable String id) {
        return null;
    }

    @GetMapping("/{id}/code-lists")
    Mono<String> getDDICodeLists(@PathVariable String id) {
        return null;
    }

}
