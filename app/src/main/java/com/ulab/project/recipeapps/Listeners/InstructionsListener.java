package com.ulab.project.recipeapps.Listeners;

import com.ulab.project.recipeapps.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);

}
