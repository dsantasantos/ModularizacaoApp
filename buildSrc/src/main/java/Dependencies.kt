package dependencies

object Versions {
    val kotlin = "1.3.41"
    const val kotlinVersion = "1.3.31"
    const val androidGradleVersion = "3.4.1"

    //support libs
    const val appcompatVersion = "1.1.0"
    const val constraintLayoutVersion = "1.1.3"
    const val coreKtx = "1.1.0"

    //test libs
    const val junitVersion = "4.12"
    const val runnerVersion = "1.2.0"
    const val espressoVersion = "3.2.0"

    const val minSDK = 20
    const val targetSDK = 28
    const val compileSDK = 28

    const val buildTools = "3.4.1"

    const val AndroidArchVersion = "1.1.1"
    const val databindingVersion = "3.1.4"
    const val lifeCycleVersion = "2.0.0"

    const val cardViewVersion = "1.0.0"
    const val recyclerViewVersion = "1.0.0"

    //Rx
    const val rxJavaVersion = "2.2.7"
    const val rxKotlinVersion = "2.4.0"
    const val rxAndroidVersion = "2.1.1"

    //Koin
    const val koinVersion = "2.0.1"

    //Retrofit
    const val retrofitVersion = "2.3.0"

    //Gson
    const val gsonVersion = "2.8.5"

    //Room version
    const val roomVersion = "2.1.0"

    //Picasso version
    const val picassoVersion = "2.71828"

    const val okHttpVersion = "4.2.1"

    const val playCoreVersion = "1.6.4"

}

object Deps {
    object Android {
        val minSdkVersion = 21
        val targetSdkVersion = 29
        val compileSdkVersion = 29
        val applicationId = "br.com.heiderlopes.demobuildsrc"
        val versionCode = 1
        val versionName = "0.1"
        val buildToolsVersion = "29.0.2"
    }

    object Kotlin {
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradleVersion}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }

    object SupportLibs {
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
        val constraint_layout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
        val core_ktx = "androidx.core:core-ktx:${Versions.coreKtx}"

        val cardView = "androidx.cardview:cardview:${Versions.cardViewVersion}"
        val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
        val dataBinding = "com.android.databinding:compiler:${Versions.databindingVersion}"
    }

    object AACLibs {
        val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleVersion}"
        val lifeCycle = "android.arch.lifecycle:extensions:${Versions.AndroidArchVersion}"

    }

    object Rx {
        val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
        val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
        val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    }

    object Koin {
        val koin = "org.koin:koin-android:${Versions.koinVersion}"
        val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"
    }


    object Retrofit {
        val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
        val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
        val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
        val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
        val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    }

    object Room {
        val room  =  "androidx.room:room-runtime:${Versions.roomVersion}"
        val roomRxJava = "androidx.room:room-rxjava2:${Versions.roomVersion}"
        val roomCompiler =  "androidx.room:room-compiler:${Versions.roomVersion}"
    }

    object Picasso {
        val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"
    }

    object Play {
        val core = "com.google.android.play:core:${Versions.playCoreVersion}"
    }

    object TestLibs {
        val junit = "junit:junit:${Versions.junitVersion}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
        val runner = "androidx.test:runner:${Versions.runnerVersion}"
    }
}