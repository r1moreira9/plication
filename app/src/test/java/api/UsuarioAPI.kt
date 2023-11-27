package api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UsuarioAPI {

    @GET("users")
    suspend fun listarUsuario()
    companion object{

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val UsuarioAPI = retrofit.create(UsuarioAPI::class.java)

        fun getInstance(): UsuarioAPI{
            return  UsuarioAPI

        }
    }
}




