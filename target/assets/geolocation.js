function geoFindMe(){function n(e){var n=e.coords.latitude;var r=e.coords.longitude;var i=new google.maps.LatLng(n,r);var s={center:i,zoom:8};var o=new google.maps.Map(t,s);var u={map:o,position:i,draggable:false,animation:google.maps.Animation.DROP};var a=new google.maps.Marker(u)}function r(){e.innerHTML="Unable to retrieve your location"}var e=document.getElementById("latlong-out");var t=document.getElementById("map-canvas");if(!navigator.geolocation){e.innerHTML="<p>Geolocation is not supported by your browser</p>";return}navigator.geolocation.getCurrentPosition(n,r)}