package deveandroid.cep.api

import deveandroid.cep.model.Endereco
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface api {

    @GET("{cep}/json/")
    fun getEndereco(@Path("cep") cep : String) : retrofit2.Call<Endereco>

}