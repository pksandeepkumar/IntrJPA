/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tex.intrjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sandeep
 */
@RestController
@RequestMapping("categories")
public class CategoryController {
    
    @GetMapping("/getAllCategories")
    public String getAllCategories() {
        
        return "response text";
    }
    
}
