import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProgressDialogAdapter(private val items: List<String>) : RecyclerView.Adapter<ProgressDialogAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutProgressDialogBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(private val binding: LayoutProgressDialogBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(message: String) {
            binding.textProgressBar.text = message
            binding.textProgressBar.visibility = if (message.isNotEmpty()) View.VISIBLE else View.GONE
            // You can perform additional binding operations if needed
        }
    }
}
