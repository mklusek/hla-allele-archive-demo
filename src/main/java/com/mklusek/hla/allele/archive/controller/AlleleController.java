package com.mklusek.hla.allele.archive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/allele")
public class AlleleController {
    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                .body("This feature is not implemented yet.");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable final String id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                .body("This feature is not implemented yet.");
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody final String item) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                .body("This feature is not implemented yet.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable final String id, @RequestBody final String item) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                .body("This feature is not implemented yet.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable final String id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
                .body("This feature is not implemented yet.");
    }
}
