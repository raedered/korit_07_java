package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Company {
    private int companyId;
    private String companyName;
    private String adress;
    private String city;
    private String state;
    private String zipCode;
}

public class CompanyMain {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Company company = new Company(100, "Apple", "Apple Computer Inc . infinnite Loop", "Cupertino", "CA", "95014");
        String jsonCampany = gsonBuilder.toJson(company);
        System.out.println(jsonCampany);
    }
}
