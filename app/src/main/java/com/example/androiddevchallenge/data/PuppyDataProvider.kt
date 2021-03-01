/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object PuppyDataProvider {

    val Edison = Puppy(
        id = 1,
        name = "Edison",
        sex = Sex.Male,
        age = "Adult",
        breed = "Boxer/Labrador Retriever Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.edison_1,
            R.drawable.edison_2,
            R.drawable.edison_3,
            R.drawable.edison_4
        )
    )

    val Precious = Puppy(
        id = 2,
        name = "Precious",
        sex = Sex.Female,
        age = "Young",
        breed = "American Bulldog",
        color = "White - with Brown or Chocolate",
        location = "West Hollywood, CA",
        images = listOf(
            R.drawable.precious_1,
            R.drawable.precious_2,
            R.drawable.precious_3,
            R.drawable.precious_4
        )
    )

    val Tink = Puppy(
        id = 3,
        name = "Tink",
        sex = Sex.Female,
        age = "Young",
        breed = "Shepherd (Unknown Type)/Labrador Retriever Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.tink_1,
            R.drawable.tink_2,
            R.drawable.tink_3,
            R.drawable.tink_4
        )
    )

    val Riley = Puppy(
        id = 4,
        name = "Riley",
        sex = Sex.Female,
        age = "Young",
        breed = "American Bulldog/Pit Bull Terrier Mix",
        color = "White - with Black",
        location = "West Hollywood, CA",
        images = listOf(
            R.drawable.riley_1,
            R.drawable.riley_2,
            R.drawable.riley_3,
        )
    )

    val Hula = Puppy(
        id = 5,
        name = "Hula",
        sex = Sex.Female,
        age = "4 years old, Young",
        breed = "German Shepherd Dog/Australian Cattle Dog Mix",
        color = "Tan/Yellow/Fawn - with Black",
        location = "West Hollywood, CA",
        images = listOf(
            R.drawable.hula_1,
            R.drawable.hula_2,
        )
    )

    val Buster = Puppy(
        id = 6,
        name = "Buster",
        sex = Sex.Male,
        age = "Young",
        breed = "Australian Shepherd/Boxer Mix",
        color = "Red/Golden/Orange/Chestnut - with White",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.buster_1,
            R.drawable.buster_2,
            R.drawable.buster_3,
            R.drawable.buster_4,
        )
    )

    val Lucas = Puppy(
        id = 7,
        name = "Lucas",
        sex = Sex.Male,
        age = "5 years old, Young",
        breed = "English Bulldog",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.lucas_1,
            R.drawable.lucas_2,
            R.drawable.lucas_3,
            R.drawable.lucas_4,
        )
    )

    val Harry = Puppy(
        id = 8,
        name = "Harry",
        sex = Sex.Male,
        age = "6 years old, Young",
        breed = "Poodle (Miniature)/Schnauzer (Miniature) Mix",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.harry_1,
            R.drawable.harry_2,
            R.drawable.harry_3,
        )
    )

    val Bronx = Puppy(
        id = 9,
        name = "Bronx",
        sex = Sex.Male,
        age = "13 years old, Senior",
        breed = "Pit Bull Terrier",
        color = "Gray/Blue/Silver/Salt & Pepper",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.bronx_1,
        )
    )

    val Gunner = Puppy(
        id = 10,
        name = "Gunner",
        sex = Sex.Male,
        age = "1 year old, Young",
        breed = "Boxer/Bull Terrier Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.gunner_1,
            R.drawable.gunner_2,
            R.drawable.gunner_3,
        )
    )

    val Roxy = Puppy(
        id = 11,
        name = "Roxy",
        sex = Sex.Female,
        age = "4 years old, Young",
        breed = "Boxer/Bull Terrier Mix",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        images = listOf(
            R.drawable.roxy_1,
        )
    )

    val puppyList = listOf(
        Edison, Precious, Tink, Riley, Buster, Lucas, Gunner, Harry, Bronx, Hula, Roxy
    )
}
