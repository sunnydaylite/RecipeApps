package com.ulab.project.recipeapps.Listeners;

import com.ulab.project.recipeapps.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener{
    void didFetch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);
}
