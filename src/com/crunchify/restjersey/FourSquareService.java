package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONObject;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

@Path("/prova")
public class FourSquareService {
<<<<<<< HEAD
	final static String ClientId = "PTGI42UUOXHP0X0LYKBWEFFLLSGEXVUBQDSXYN5R3OPBXROZ";
	final static String ClientSecret = "RWTGHHMMKUEL4KWCITNC2HKQDYVWBGIOUXKHCZ0AKUHFA4KF";
=======
	/*final String ClientId = "PTGI42UUOXHP0X0LYKBWEFFLLSGEXVUBQDSXYN5R3OPBXROZ";
	final String ClientSecret = "RWTGHHMMKUEL4KWCITNC2HKQDYVWBGIOUXKHCZ0AKUHFA4KF";
>>>>>>> 1da666f51d63dea0f1bda9a0a7cbdf12d63bb7af
	
	final String latitude = "40.7463956";
	final String longtitude = "-73.9852992";
	static String url = "https://api.foursquare.com/v2/venues/search";
	
	@Path("{ll}")
	@GET
	@Produces("application/json")
	private static JSONObject searchVenues(@PathParam("c") String ll) throws FoursquareApiException {
	    // First we need a initialize FoursquareApi. 
	    FoursquareApi foursquareApi = new FoursquareApi(ClientId, ClientSecret, url);
	    // After client has been initialized we can make queries.
	    Result<VenuesSearchResult> result = foursquareApi.venuesSearch(ll, null, null, null, null, null, null, null, null, null, null);

	    if (result.getMeta().getCode() == 200) {
	      // if query was ok we can finally we do something with the data
	      for (CompactVenue venue : result.getResult().getVenues()) {
	        // TODO: Do something we the data
	        System.out.println(venue.getName());
	      }
	    } else {
	      // TODO: Proper error handling
	      System.out.println("Error occured: ");
	      System.out.println("  code: " + result.getMeta().getCode());
	      System.out.println("  type: " + result.getMeta().getErrorType());
	      System.out.println("  detail: " + result.getMeta().getErrorDetail()); 
	    }
		return null;
	}*/
	
	/*private static void authenticationRequest(HttpServletRequest request, HttpServletResponse response) {
		FoursquareApi foursquareApi = new FoursquareApi("ClientId", "ClientSecret", "url");
		try {
	      // First we need to redirect our user to authentication page. 
	      response.sendRedirect(foursquareApi.getAuthenticationUrl());
	    } catch (IOException e) {
	      // TODO: Error handling
	    }
	  }

	  private static void handleCallback(HttpServletRequest request, HttpServletResponse response) {
	    // After user has logged in and confirmed that our program may access user's Foursquare account
	    // Foursquare redirects user back to callback url. 
	    FoursquareApi foursquareApi = new FoursquareApi("ClientId", "ClientSecret", "url");
	    // Callback url contains authorization code 
	    String code = request.getParameter("code");
	    try {
	      // finally we need to authenticate that authorization code 
	      foursquareApi.authenticateCode(code);
	      // ... and voilà we have a authenticated Foursquare client
	    } catch (FoursquareApiException e) {
	     // TODO: Error handling
	    }
	  }*/
	
}
