// https://github.com/UALR-MobileAppsDevelopmentCourse/assignment-04-mamccorkle
//
//  UALR - MAD - F22 - Assignment 4 - Android Resources
//
//  Project: UALR - Mobile Applications Development - Fall 2022 - Assignment 4 - Android Resources
//  Created by: Mark McCorkle on 20221004
//  Based on: Code Provided by Dr Ivan Rodriguez-Conde
//
//  IDE:
//     Android Studio Chipmunk | 2021.2.1 Patch 2
//     Build #AI-212.5712.43.2112.8815526, built on July 10, 2022
//     Runtime version: 11.0.12+0-b1504.28-7817840 x86_64
//     VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
//     macOS 11.5.2
//     GC: G1 Young Generation, G1 Old Generation
//     Memory: 2048M
//     Cores: 8
//     Registry: external.system.auto.import.disabled=true
//
package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

import com.ualr.resources.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Add the binder:
    private ActivityMainBinding binding;

    // Add a Coordinator Layout for use with the Snackbar:
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Add button listener:
        binding.lessonLearntButton.setOnClickListener(this::onLessonLearntClicked);

        // Call the function to change the country description:
        changeCountryDescription();
    }

    public void changeCountryDescription() {
        // Change the country description based on the system language:
        binding.countryDescriptionText.setText(getResources().getText(R.string.text_view_country_description));
    }

    public void onLessonLearntClicked(View view) {
        // Create the Snackbar to be displayed to the user:
        Snackbar snackbar = Snackbar.make(view, R.string.congrats_text, Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
