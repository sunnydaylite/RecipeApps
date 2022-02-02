package com.ulab.project.recipeapps.Listeners;


import com.ulab.project.recipeapps.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError (String message);
}
