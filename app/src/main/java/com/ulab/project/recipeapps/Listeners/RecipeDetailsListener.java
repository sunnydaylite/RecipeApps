package com.ulab.project.recipeapps.Listeners;

import com.ulab.project.recipeapps.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener{
    void didFetch(RecipeDetailsResponse response, String message);
    void didError (String message);

}
