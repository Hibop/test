package com.huawei.springmvc.csedemo;

import com.huawei.springmvc.csedemo.model.Person;

import javax.ws.rs.core.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.huawei.springmvc.csedemo.CsedemoAgent;

import java.util.List;
import javax.validation.constraints.*;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringCodegen", date = "2017-08-18T11:43:39.491Z")

@RestSchema(schemaId = "csedemo")
@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON)
public class CsedemoImpl {

    private CsedemoAgent userCsedemoAgent = new CsedemoAgent();

    @RequestMapping(value = "/add",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public Integer add( @RequestParam(value = "a", required = true) Integer a, @RequestParam(value = "b", required = true) Integer b){

        return userCsedemoAgent.add(a, b);
    }


    @RequestMapping(value = "/sayhei",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHei( @RequestHeader(value="name", required=true) String name){

        return userCsedemoAgent.sayHei(name);
    }


    @RequestMapping(value = "/sayhello/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String sayHello( @PathVariable("name") String name){

        return userCsedemoAgent.sayHello(name);
    }


    @RequestMapping(value = "/sayhi",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String sayHi( @RequestParam(value = "name", required = true) String name){

        return userCsedemoAgent.sayHi(name);
    }


    @RequestMapping(value = "/saysomething",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    public String saySomething( @RequestParam(value = "prefix", required = true) String prefix, @RequestBody Person user){

        return userCsedemoAgent.saySomething(prefix, user);
    }

}
