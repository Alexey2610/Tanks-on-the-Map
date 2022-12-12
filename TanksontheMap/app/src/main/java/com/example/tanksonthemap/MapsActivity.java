package com.example.tanksonthemap;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.tanksonthemap.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng bobsemple = new LatLng(-34, 151);
        new MarkerOptions()
                .position(bobsemple)
                .title("Bob Semple")
                .snippet(" Новозеландский импровизированный средний танк, разработанный министром труда Робертом Семплом на базе гусеничного трактора Caterpillar D8 во времена Второй мировой войны.")
        ;

        LatLng t34 = new LatLng(55.755826,37.617300);
        mMap.addMarker(new MarkerOptions()
                .position(t34)
                .title("T 34")
                .snippet("Советский средний танк периода Великой Отечественной войны, выпускался серийно с 1940 года. В течение 1942—1947 годов — основной танк РККА и ВС СССР. Являлся основным танком РККА до первой половины 1944 года, до поступления в войска его модификации Т-34-85.\n" +
                        "\n" +
                        "Самый массовый танк Второй мировой войны и послевоенного времени.")
        );
        LatLng tiger1 = new LatLng(52.520007,13.404954);
        mMap.addMarker(new MarkerOptions()
                .position(tiger1)
                .title("TIGER")
                .snippet(" Немецкий тяжёлый танк времён Второй мировой войны, прототипом которого являлся танк VK4501 (H), разработанный в 1942 году фирмой «Хеншель». Наряду с прототипом фирмы «Хеншель» руководству Рейха был представлен и проект Фердинанда Порше — VK4501 (P), но выбор военной комиссии пал на вариант «Хеншель».")
        );

            }


    }


