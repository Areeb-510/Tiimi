import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tiimiprototype.fragments.EmailFragment
import com.example.tiimiprototype.fragments.WhatsappFragment

class PageAdapter(fm:FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm,lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                return EmailFragment()
            }
            1 -> {
                return WhatsappFragment()
            }
            else -> {
                return EmailFragment()
            }
        }
    }

}
