package com.exemplo.exercicio.exercicion2.Funcoes;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by RenatoWSilva on 20/11/2018.
 */

public interface JsonPlaceholder  {

    @GET("posts")
    Call<ArrayList<Post>> getPost();

    @GET("posts/{postId}")
    Call<Post> getPostById(
            @Path("postId") Integer postId
    );

    @GET("comments")
    Call<ArrayList<Comment>> getComment();

    @GET("albums")
    Call<ArrayList<Album>> getAlbum();

    @GET("albums/{albumId}/photos")
    Call<ArrayList<Photo>> getPhotos(
            @Path("albumId") Integer albumId
    );

    @GET("todos")
    Call<ArrayList<Todo>> getTodo();


}
