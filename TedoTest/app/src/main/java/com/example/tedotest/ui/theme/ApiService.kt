
package com.example.tedotest.ui.theme
import retrofit2.http.GET

class ApiService {
    interface ApiService{
        
        @GET (https://localhost:7105/api/TestDocument)
        suspend fun getData();
    }
}