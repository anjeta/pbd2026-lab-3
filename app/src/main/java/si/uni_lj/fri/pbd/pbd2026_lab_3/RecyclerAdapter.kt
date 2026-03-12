package si.uni_lj.fri.pbd.pbd2026_lab_3

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :  RecyclerView.Adapter<RecyclerAdapter.CardViewHolder?>() {

    private val titles = arrayOf("Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Jupiter",
        "Saturn",
        "Uranus",
        "Neptune")
    private val details = arrayOf("The smallest planet",
        "The second brightest object in the night sky", "The only known to harbour life",
        "Named after the Roman god of war", "The largest planet in the Solar system",
        "Famous for its rings", "The coldest planet",
        "The farthest from the Sun")
    private val images = intArrayOf(R.drawable.mercury,
        R.drawable.venus,
        R.drawable.earth,
        R.drawable.mars,
        R.drawable.jupiter,
        R.drawable.saturn,
        R.drawable.uranus,
        R.drawable.neptune)

    inner class CardViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var itemImage: ImageView? = null
        var itemTitle: TextView? = null
        var itemDetail: TextView? = null

        init {
            // TODO: set the above fields, show Snackbar when a user clicks on an item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        // TODO: Inflate the view, make a CardViewHolder and return it

        return TODO("Provide the return value")
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        // TODO: set the image, title, and details data
    }
}