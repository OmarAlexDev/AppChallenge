package com.example.appchallengue1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_smartphones.*

/**
 * A simple [Fragment] subclass.
 * Use the [SmartphonesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SmartphonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_smartphones, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        smartphones_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = SmartphonesAdapter(createData())
        }
    }

    fun createData(): ArrayList<Smartphone>{
        val smartphones = ArrayList<Smartphone>()
        smartphones.add(Smartphone(R.drawable.findx,"Find X", "Oppo","2018","The Oppo Find X is a beautiful handset with innovative features, powerful performance and a futuristic design, but its star gimmick ultimately detracts from an otherwise top-notch (yet notch-free) flagship experience."))
        smartphones.add(Smartphone(R.drawable.findx2pro,"Find X2 Pro", "Oppo","2020","The Oppo Find X2 Pro is a fantastic smartphone – from its design to its software and features, it exudes premium-ness, and it feels a treat to use. The display in particular is top-end, with a few features which beat out the competition, and it also seems that Oppo is taking strides in creating a truly great post-processing system for photos. You’re really paying for all these great features though, with a price tag that’s just as high-end as the tech, and that may limit its appeal."))
        smartphones.add(Smartphone(R.drawable.iphone12,"Iphone 12", "Apple","2020","The iPhone 12 sports a gorgeous new design, full 5G support, great cameras and even better performance. However, the lack of a charger in box and limited base storage are drawbacks."))
        smartphones.add(Smartphone(R.drawable.lgv60,"V60 ThinQ 5G", "LG","2020","The LG V60 ThinQ 5G is a solid all-around alternative to Samsung's Galaxy S20 Plus and S20 Ultra, with better battery life. But the Dual Screen attachment, is wonky and the cameras disappoint."))
        smartphones.add(Smartphone(R.drawable.mi10,"Mi 10", "Xiaomi","2020","Xiaomi’s Mi 10 is a great phone thanks to its seriously premium design, a gorgeous 90Hz screen, and a nippy chipset. That said, its value for money fails to smash it out of the park, with similarly priced phones like the OnePlus 8 Pro and the Huawei P40 winning out from a camera point of view, and Realme and Oppo offering a more agreeable interface experience at a similar price."))
        smartphones.add(Smartphone(R.drawable.mi11,"Mi 11", "Xiaomi","2020","Xiaomi Mi 11 is a gamer's paradise with its Qualcomm Snapdragon 888 chipset, which offers HDR level graphics teamed with desktop level capabilities. Considering the camera options loaded within the device, vloggers will get to shoot multiple contents using a single smartphone. Moreover, Xiaomi ensures prolonged usage by offering a 4600mAh battery with 55W v4.0 Quick Charging and Wireless Charging technology."))
        smartphones.add(Smartphone(R.drawable.note20ultra,"Note 20 Ultra", "Samsung","2020","It depends on what you want from a device, and which device you currently have. The Note 20 Ultra is without a doubt a great and powerful phone, but it’s also expensive. The thing that sets it apart from the rest is the S-Pen, so if you see a lot of value in that, the Ultra may be for you. Except if you already have last year’s Galaxy Note 10 Plus. In this case, there’s little reason to upgrade."))
        smartphones.add(Smartphone(R.drawable.op7pro,"7 Pro", "Oneplus","2019","The value in OnePlus phones continues to be unbeatable, even if the OnePlus 7 Pro is the most expensive OnePlus phone yet. It's the phone I'd recommend to anyone looking for a new phone, even over Samsung's Galaxy S10 series."))
        smartphones.add(Smartphone(R.drawable.op8pro,"8 Pro", "Oneplus","2020","The OnePlus 8 Pro has a similar design as the OnePlus 8 but with some subtle changes. Its display is actually rounded on the sides, rather than just having curved glass like on the 8. It has a pretty big 6.78-inch QHD+ (1440x3168-pixel) AMOLED panel, with a claimed high colour accuracy and HDR10+ support."))
        smartphones.add(Smartphone(R.drawable.opnord,"Nord", "Oneplus","2020","The OnePlus Nord is currently the most affordable 5G smartphone in the Indian market, which gives it a unique advantage.The OnePlus Nord might not always match up to the competition on specifications alone, but when you take into account the software and promise of timely updates, it does make a very compelling case for itself."))
        smartphones.add(Smartphone(R.drawable.pixel4a,"Pixel 4a", "Google","2020","The compact size, clean interface and great point-and-shoot camera of the Pixel 4a will appeal to those looking for an affordable, reasonably sized handset with enough grunt to handle the basics, plus the ability to capture some excellent pictures."))
        smartphones.add(Smartphone(R.drawable.pixel5,"Pixel 5", "Google","2020","The Google Pixel 5 is a charming and reasonably-priced premium phone with an amazing camera and good battery life. But it's far less powerful than other options in its price range, and completely outmatched in value by Google’s cheaper Pixel 4a 5G and Pixel 4a."))
        smartphones.add(Smartphone(R.drawable.redminote10pro,"Note 10 Pro", "Redmi","2021","The Xiaomi Redmi Note 10 Pro is an upcoming mid-range offering by the device maker. Accompanied by a powerful spec sheet comprising of a powerful chipset and 6GB RAM, it also offers all the desired features. Apart from featuring a mammoth capacity battery, it's powerful camera setup is sure to satisfy the buyer of the device. Additionally, the sleek body and the styling of the device adds to its list of offerings."))
        smartphones.add(Smartphone(R.drawable.realme7pro,"7 Pro", "Realme","2020","The Realme 7 Pro is the flagship model for the 7 series. The smartphone offers a striking HD+ display with a premium design. To add on to its spec-sheet, the device offers an impressive camera set-up, massive battery equipped with 65W Super Dart charging technology, and the latest operating system. Moreover, the Dolby Atmos speakers and splashproof feature of the smartphone makes it an amazing device to invest in.."))
        smartphones.add(Smartphone(R.drawable.s21,"S21", "Samsung","2020","I would have liked to have seen Samsung push the hardware envelope for the Galaxy S21, but that’s the domain of the Galaxy S21 Ultra. By making what I feel was the right choice when it came to removing features, the Galaxy S21 still offers the latest flagship chips, a fantastic display and powerful cameras in a refined smartphone at a competitive price; one that should worry the iPhone 12. "))
        smartphones.add(Smartphone(R.drawable.s20ultra,"S20 Ultra", "Samsung","2020","The Samsung Galaxy S20 Ultra goes big in every way imaginable, with 108MP photos, a 100x camera zoom, 40MP selfies, and a 6.9-inch 120Hz display. With over-the-top internal specs on a par with some laptops, you'll pay more for this phone than any non-foldable phone before it, but that's not surprising. What is surprising are some of the bugs we've encountered that keep the Ultra from reaching its full potential."))


        return smartphones
    }
}