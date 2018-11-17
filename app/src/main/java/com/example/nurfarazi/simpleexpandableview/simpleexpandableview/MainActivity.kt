package com.example.nurfarazi.simpleexpandableview.simpleexpandableview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nurfarazi.simpleexpandableview.simpleexpandableAdapter.ExpandableListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val header: MutableList<String> = ArrayList()
    val drugCount: MutableList<String> = ArrayList()
    val totalCost: MutableList<String> = ArrayList()
    val body: MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Game Of Thrones"

        val season1: MutableList<String> = ArrayList()
        season1.add("Winter is Coming")
        season1.add("The Kingsroad")
        season1.add("Lord Snow")
        season1.add("Cripples")
        season1.add("The Wolf")
        season1.add("A Golden Crown")
        season1.add("You Win or You Die")
        season1.add("The Pointy End")
        season1.add("Baelor")
        season1.add("Fire and Blood")


        val season2: MutableList<String> = ArrayList()
        season2.add("The North Remembers")
        season2.add("The Night Lands")
        season2.add("What is")
        season2.add("Garden of Bones")
        season2.add("The Ghost")
        season2.add("The Old New")
        season2.add("A Man Honor")
        season2.add("The Prince")
        season2.add("Blackwater")
        season2.add("Valar Morghulis")

        val season3: MutableList<String> = ArrayList()
        season3.add("Valar Dohaeris")
        season3.add("Dark Wings")
        season3.add("Walk of Punishment")
        season3.add("And Now His Ended")
        season3.add("Kissed by Fire")
        season3.add("The Climb")
        season3.add("The Bear and")
        season3.add("Second Sons")
        season3.add("The Rains of")
        season3.add("Mhysa")


        val season4: MutableList<String> = ArrayList()
        season4.add("Two Swords")
        season4.add("The Lion and the Rose")
        season4.add("Breaker of Chains")
        season4.add("Oathkeeper")
        season4.add("First of His Name")
        season4.add("The Laws of Gods and Men")
        season4.add("Mockingbird")
        season4.add("The Mountain and the Viper")
        season4.add("The Watchers on the Wall")
        season4.add("The Children")


        val season5: MutableList<String> = ArrayList()
        season5.add("The Wars to Come")
        season5.add("The House of")
        season5.add("High Sparrow")
        season5.add("Sons of the Harpy")
        season5.add("Kill the Boy")
        season5.add("Unbowed, Unbent, Unbroken")
        season5.add("The Gift")
        season5.add("Hardhome")
        season5.add("The Dance of Dragons")
        season5.add("Mother's Mercy")

        val season6: MutableList<String> = ArrayList()
        season6.add("The Red Woman")
        season6.add("Home")
        season6.add("Oathbreaker")
        season6.add("Book of the Stranger")
        season6.add("The Door")
        season6.add("Blood of My Blood")
        season6.add("The Broken Man")
        season6.add("No One")
        season6.add("Battle of the Bastards")
        season6.add("The Winds of Winter (69 min)")


        val season7: MutableList<String> = ArrayList()
        season7.add("Dragonstone")
        season7.add("Stormborn")
        season7.add("The Queen's Justice")
        season7.add("The Spoils of War")
        season7.add("Eastwatch")
        season7.add("Beyond the Wall")
        season7.add("The Dragon and the Wolf")

        val special: MutableList<String> = ArrayList()
        special.add("Inside Game of Thrones")
        special.add("You Win or You Die")
        special.add("A Gathering Storm")
        special.add("Ice and Fire: A Foreshadowing")
        special.add("A Day in the Life")
        special.add("Inside Game of Thrones - The Best Seat in the House (5 min)")
        special.add("Inside Game of Thrones - Prosthetics (4 min)")
        special.add("18 Hours at the Paint Hall (30 min)")
        special.add("The Story So Far (65 min")

        header.add("Ma pharma")
        header.add("Neyamot")
        header.add("Nabi Pharma")
        header.add("Naz pharma")
        header.add("01928374652")
        header.add("Bhai bhai Pharma")
        header.add("Sekele Pharma")
        header.add("Adhunik Pharma")

        drugCount.add("5 Item")
        drugCount.add("6 Item")
        drugCount.add("1 Item")
        drugCount.add("3 Item")
        drugCount.add("2 Item")
        drugCount.add("7 Item")
        drugCount.add("9 Item")
        drugCount.add("12 Item")
        
        totalCost.add("5 Item")
        totalCost.add("6 Item")
        totalCost.add("1 Item")
        totalCost.add("3 Item")
        totalCost.add("2 Item")
        totalCost.add("7 Item")
        totalCost.add("9 Item")
        totalCost.add("12 Item")


        body.add(season1)
        body.add(season2)
        body.add(season3)
        body.add(season4)
        body.add(season5)
        body.add(season6)
        body.add(special)

        expandableListView.setAdapter(ExpandableListAdapter(this,expandableListView, header, drugCount, totalCost, body))
    }
}
