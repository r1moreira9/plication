package api

import UsersApi
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UsuarioAPI {

    @GET("users")
     fun getAllUsers(): Call<List<UsersApi>>
    companion object{
        private val usuarioAPI: UsuarioAPI by lazy {

     val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(UsuarioAPI::class.java)
        }
        fun getInstance(): UsuarioAPI{
            return  usuarioAPI

        }
    }
}




