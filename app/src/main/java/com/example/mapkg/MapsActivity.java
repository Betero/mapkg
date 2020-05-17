package com.example.mapkg;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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



        // Add a marker in Sydney and move the camera
        LatLng сathedral = new LatLng(54.70645005, 20.512169623964496);
        LatLng fort1 = new LatLng(54.70606519543658, 20.60565233230591);
        LatLng fort1a = new LatLng(54.734873239025106, 20.609128475189213);
        LatLng fort2 = new LatLng(54.748802070052355, 20.601339340209964);
        LatLng fort2a = new LatLng(54.75568729921951, 20.571641921997074);
        LatLng fort3 = new LatLng(54.761692343405734, 20.54651498794556);
        LatLng fort4 = new LatLng(54.764156011012226, 20.48784971237183);
        LatLng fort5 = new LatLng(54.75239343278619, 20.442960262298588);
        LatLng fort5a = new LatLng(54.73954355426537, 20.427478551864628);
        LatLng fort6 = new LatLng(54.72226565543917, 20.413584709167484);
        LatLng fort7 = new LatLng(54.69391535, 20.387900272220783);
        LatLng fort8 = new LatLng(54.6647476772742145, 20.43045043945313);
        LatLng fort9 = new LatLng(54.65327898585188, 20.485038757324222);
        LatLng fort10 = new LatLng(54.65064718445805, 20.528469085693363);
        LatLng fort11 = new LatLng(54.65670503795502, 20.567607879638675);
        LatLng fort12 = new LatLng(54.6713493947706, 20.599536895751957);
        mMap.addMarker(new MarkerOptions().position(fort1).title("Marker in Fort1, Штайн"));
        mMap.addMarker(new MarkerOptions().position(fort1a).title("Marker in Fort1a, Грёбен"));
        mMap.addMarker(new MarkerOptions().position(fort2).title("Marker in Fort2, Бронзарт"));
        mMap.addMarker(new MarkerOptions().position(fort2a).title("Marker in Fort2а, Барнеков"));
        mMap.addMarker(new MarkerOptions().position(fort3).title("Marker in Fort3, Король Фдрих-Вильгельм 1"));
        mMap.addMarker(new MarkerOptions().position(fort4).title("Marker in Fort4, Гнайзенау"));
        mMap.addMarker(new MarkerOptions().position(fort5).title("Marker in Fort5, Король Фдрих-Вильгельм 3"));
        mMap.addMarker(new MarkerOptions().position(fort5a).title("Marker in Fort5a, Лендорф"));
        mMap.addMarker(new MarkerOptions().position(fort6).title("Marker in Fort6, Королева Луиза"));
        mMap.addMarker(new MarkerOptions().position(fort7).title("Marker in Fort7, Герцог фон Хольштайн"));
        mMap.addMarker(new MarkerOptions().position(fort8).title("Marker in Fort8, Король Фридрих"));
        mMap.addMarker(new MarkerOptions().position(fort9).title("Marker in Fort9, Донна"));
        mMap.addMarker(new MarkerOptions().position(fort10).title("Marker in Fort10, Каницт"));
        mMap.addMarker(new MarkerOptions().position(fort11).title("Marker in Fort11, Денхофф"));
        mMap.addMarker(new MarkerOptions().position(fort12).title("Marker in Fort12, Ойленбург"));
        mMap.addMarker(new MarkerOptions().position(сathedral).title("Marker in Сathedral"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(сathedral));
    }
}
