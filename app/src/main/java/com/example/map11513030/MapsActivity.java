package com.example.map11513030;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    LocationManager locationManager;
    double latitude, longitude, altitude;
    private final int MY_PERMISSIONS_REQUEST_LOCATION = 1002;
    private GoogleMap mMap;
    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
        }

        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                2000, 2, locationListener);
    }

    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(@NonNull Location location) {
            latitude = location.getLatitude();
            longitude = location.getLongitude();
            altitude = location.getAltitude();
        }
        @Override
        public void  onStatusChanged(String provider, int status, Bundle extras){}
        @Override
        public  void onProviderEnabled(String provider){}
        @Override
        public  void  onProviderDisabled(String provider){}
    };

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Sejong = new LatLng(36.541983, 127.274339);
        LatLng a1 = new LatLng(36.480098, 127.289035);
        LatLng a2 = new LatLng(36.592923, 127.292253);
        LatLng a3 = new LatLng(36.604296, 127.298521);
        LatLng a4 = new LatLng(36.541983, 127.274339);
        LatLng a5 = new LatLng(36.559264, 127.326714);
        LatLng a6 = new LatLng(36.529656, 127.370886);
        LatLng a7 = new LatLng(36.463843, 127.280359);
        LatLng a8 = new LatLng(36.496614, 127.205608);
        LatLng a9 = new LatLng(36.592507, 127.271511);
        LatLng a10 = new LatLng(36.592507, 127.195769);
        LatLng a11 = new LatLng(36.656326, 127.264213);
        LatLng a12 = new LatLng(36.722313, 127.158265);
        LatLng a13 = new LatLng(36.479212, 127.254573);
        LatLng a14 = new LatLng(36.515701, 127.262152);
        LatLng a15 = new LatLng(36.512015, 127.247161);
        LatLng a16 = new LatLng(36.504396, 127.247082);
        LatLng a17 = new LatLng(36.519952, 127.236705);
        LatLng a18 = new LatLng(36.478796, 127.290183);
        LatLng a19 = new LatLng(36.485846, 127.250834);
        LatLng a20 = new LatLng(36.572262, 127.283121);
        LatLng a21 = new LatLng(36.502207, 127.256792);
        LatLng a22 = new LatLng(36.599794, 127.28718);
        LatLng a23 = new LatLng(36.59521, 127.284356);

        mMap.addMarker(new MarkerOptions().position(a1).title("세종시청"));
        mMap.addMarker(new MarkerOptions().position(a2).title("세종시청 조치원 청사"));
        mMap.addMarker(new MarkerOptions().position(a3).title("조치원읍사무소"));
        mMap.addMarker(new MarkerOptions().position(a4).title("연기면사무소"));
        mMap.addMarker(new MarkerOptions().position(a5).title("연동면사무소"));
        mMap.addMarker(new MarkerOptions().position(a6).title("부강면사무소"));
        mMap.addMarker(new MarkerOptions().position(a7).title("금남면사무소"));
        mMap.addMarker(new MarkerOptions().position(a8).title("장군면사무소"));
        mMap.addMarker(new MarkerOptions().position(a9).title("연서면사무소"));
        mMap.addMarker(new MarkerOptions().position(a10).title("전의면사무소"));
        mMap.addMarker(new MarkerOptions().position(a11).title("전동면사무소"));
        mMap.addMarker(new MarkerOptions().position(a12).title("소정면사무소"));
        mMap.addMarker(new MarkerOptions().position(a13).title("한솔동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a14).title("도담동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a15).title("아름동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a16).title("종촌동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a17).title("고운동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a18).title("보람동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a19).title("새롬동 주민센터"));
        mMap.addMarker(new MarkerOptions().position(a20).title("세종시 농업기술센터"));
        mMap.addMarker(new MarkerOptions().position(a21).title("어진동복합커뮤니티센터"));
        mMap.addMarker(new MarkerOptions().position(a22).title("세종문화예술회관"));
        mMap.addMarker(new MarkerOptions().position(a23).title("시민체육관"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Sejong));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(11));
    }

    public void onClickGps(View v){

        if(latitude != 0 && longitude != 0) {
            LatLng gps = new LatLng(latitude, longitude);
            if(latitude>=36.4 && latitude<=36.76 && longitude>=127.14 && longitude <= 127.38){
                mMap.moveCamera(CameraUpdateFactory.newLatLng(gps));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
            }
            else{
                Toast.makeText(getApplicationContext(),"위치가 세종특별자치시 밖입니다.",Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(getApplicationContext(),"위치정보를 받고 있습니다. 잠시후 시도해주십시요.",Toast.LENGTH_SHORT).show();
        }
    }

}