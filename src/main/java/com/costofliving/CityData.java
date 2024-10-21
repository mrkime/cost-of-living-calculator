package main.java.com.costofliving;

import java.util.HashMap;

public class CityData {
    private static final HashMap<String, Double> costOfLivingIndex = new HashMap<>();

    static {
        // US Cities
        // The values now represent percentages where 100 is the national average
        // These are estimates for October 2024 based on current trends and projections

        // Alabama
        costOfLivingIndex.put("Birmingham, AL", 89.3);
        costOfLivingIndex.put("Huntsville, AL", 93.2);
        costOfLivingIndex.put("Montgomery, AL", 87.1);
        costOfLivingIndex.put("Mobile, AL", 87.2);
        costOfLivingIndex.put("Tuscaloosa, AL", 88.5);
        costOfLivingIndex.put("Hoover, AL", 92.4);
        costOfLivingIndex.put("Auburn, AL", 90.0);
        costOfLivingIndex.put("Dothan, AL", 85.2);
        costOfLivingIndex.put("Decatur, AL", 86.4);
        costOfLivingIndex.put("Madison, AL", 94.8);
        costOfLivingIndex.put("Florence, AL", 84.3);
        costOfLivingIndex.put("Vestavia Hills, AL", 95.1);
        costOfLivingIndex.put("Phenix City, AL", 85.2);
        costOfLivingIndex.put("Prattville, AL", 88.5);
        costOfLivingIndex.put("Gadsden, AL", 82.2);
        costOfLivingIndex.put("Alabaster, AL", 91.9);
        costOfLivingIndex.put("Northport, AL", 87.1);
        costOfLivingIndex.put("Opelika, AL", 88.2);
        costOfLivingIndex.put("Enterprise, AL", 84.2);
        costOfLivingIndex.put("Daphne, AL", 93.8);

        // Alaska
        costOfLivingIndex.put("Anchorage, AK", 125.7);
        costOfLivingIndex.put("Fairbanks, AK", 122.3);
        costOfLivingIndex.put("Juneau, AK", 130.9);
        costOfLivingIndex.put("Wasilla, AK", 117.5);
        costOfLivingIndex.put("Palmer, AK", 116.0);

        // Arizona
        costOfLivingIndex.put("Phoenix, AZ", 103.2);
        costOfLivingIndex.put("Tucson, AZ", 95.0);
        costOfLivingIndex.put("Mesa, AZ", 101.5);
        costOfLivingIndex.put("Chandler, AZ", 104.3);
        costOfLivingIndex.put("Scottsdale, AZ", 115.8);
        costOfLivingIndex.put("Glendale, AZ", 99.5);
        costOfLivingIndex.put("Gilbert, AZ", 103.7);
        costOfLivingIndex.put("Peoria, AZ", 101.0);
        costOfLivingIndex.put("Tempe, AZ", 106.2);

        // Arkansas
        costOfLivingIndex.put("Little Rock, AR", 92.0);
        costOfLivingIndex.put("Fort Smith, AR", 87.5);
        costOfLivingIndex.put("Fayetteville, AR", 95.3);
        costOfLivingIndex.put("Springdale, AR", 93.0);
        costOfLivingIndex.put("Jonesboro, AR", 85.2);
        costOfLivingIndex.put("North Little Rock, AR", 89.5);
        costOfLivingIndex.put("Conway, AR", 90.7);
        costOfLivingIndex.put("Rogers, AR", 96.0);
        costOfLivingIndex.put("Bentonville, AR", 97.5);

        // California
        costOfLivingIndex.put("Los Angeles, CA", 148.0);
        costOfLivingIndex.put("San Francisco, CA", 192.3);
        costOfLivingIndex.put("San Diego, CA", 138.7);
        costOfLivingIndex.put("San Jose, CA", 176.0);
        costOfLivingIndex.put("Sacramento, CA", 118.5);
        costOfLivingIndex.put("Fresno, CA", 107.0);
        costOfLivingIndex.put("Oakland, CA", 146.0);
        costOfLivingIndex.put("Long Beach, CA", 138.2);
        costOfLivingIndex.put("Bakersfield, CA", 102.5);
        costOfLivingIndex.put("Anaheim, CA", 140.5);
        costOfLivingIndex.put("Santa Ana, CA", 136.5);
        costOfLivingIndex.put("Riverside, CA", 115.0);
        costOfLivingIndex.put("Stockton, CA", 112.0);
        costOfLivingIndex.put("Chula Vista, CA", 134.5);
        costOfLivingIndex.put("Irvine, CA", 155.0);
        costOfLivingIndex.put("Fremont, CA", 161.0);
        costOfLivingIndex.put("San Bernardino, CA", 110.2);
        costOfLivingIndex.put("Modesto, CA", 106.3);
        costOfLivingIndex.put("Oxnard, CA", 135.7);
        costOfLivingIndex.put("Fontana, CA", 115.2);
        costOfLivingIndex.put("Moreno Valley, CA", 114.6);
        costOfLivingIndex.put("Glendale, CA", 142.5);
        costOfLivingIndex.put("Huntington Beach, CA", 150.1);
        costOfLivingIndex.put("Santa Clarita, CA", 135.5);
        costOfLivingIndex.put("Garden Grove, CA", 130.2);
        costOfLivingIndex.put("Oceanside, CA", 128.7);
        costOfLivingIndex.put("Rancho Cucamonga, CA", 125.4);
        costOfLivingIndex.put("Ontario, CA", 123.0);
        costOfLivingIndex.put("Santa Rosa, CA", 135.4);
        costOfLivingIndex.put("Corona, CA", 120.5);
        costOfLivingIndex.put("Lancaster, CA", 111.6);
        costOfLivingIndex.put("Elk Grove, CA", 125.8);
        costOfLivingIndex.put("Palmdale, CA", 111.3);
        costOfLivingIndex.put("Salinas, CA", 135.0);
        costOfLivingIndex.put("Hayward, CA", 145.6);
        costOfLivingIndex.put("Pomona, CA", 118.0);
        costOfLivingIndex.put("Escondido, CA", 127.7);
        costOfLivingIndex.put("Sunnyvale, CA", 170.2);
        costOfLivingIndex.put("Torrance, CA", 145.4);
        costOfLivingIndex.put("Pasadena, CA", 152.0);
        costOfLivingIndex.put("Orange, CA", 150.0);
        costOfLivingIndex.put("Fullerton, CA", 135.7);
        costOfLivingIndex.put("Roseville, CA", 125.2);
        costOfLivingIndex.put("Visalia, CA", 102.6);
        costOfLivingIndex.put("Concord, CA", 135.9);
        costOfLivingIndex.put("Santa Clara, CA", 165.3);
        costOfLivingIndex.put("Simi Valley, CA", 138.3);
        costOfLivingIndex.put("Thousand Oaks, CA", 142.7);

        // Colorado
        costOfLivingIndex.put("Denver, CO", 128.0);
        costOfLivingIndex.put("Colorado Springs, CO", 104.6);
        costOfLivingIndex.put("Aurora, CO", 114.4);
        costOfLivingIndex.put("Fort Collins, CO", 114.3);
        costOfLivingIndex.put("Lakewood, CO", 113.8);
        costOfLivingIndex.put("Thornton, CO", 111.7);
        costOfLivingIndex.put("Arvada, CO", 117.0);
        costOfLivingIndex.put("Westminster, CO", 118.2);
        costOfLivingIndex.put("Pueblo, CO", 95.2);
        costOfLivingIndex.put("Centennial, CO", 125.0);
        costOfLivingIndex.put("Boulder, CO", 145.2);
        costOfLivingIndex.put("Greeley, CO", 102.5);
        costOfLivingIndex.put("Longmont, CO", 110.3);
        costOfLivingIndex.put("Loveland, CO", 111.2);
        costOfLivingIndex.put("Broomfield, CO", 116.7);
        costOfLivingIndex.put("Grand Junction, CO", 97.7);
        costOfLivingIndex.put("Commerce City, CO", 107.4);
        costOfLivingIndex.put("Parker, CO", 119.3);
        costOfLivingIndex.put("Littleton, CO", 118.5);
        costOfLivingIndex.put("Brighton, CO", 108.2);

        // Connecticut
        costOfLivingIndex.put("Bridgeport, CT", 119.1);
        costOfLivingIndex.put("Stamford, CT", 145.9);
        costOfLivingIndex.put("New Haven, CT", 121.4);
        costOfLivingIndex.put("Hartford, CT", 116.7);
        costOfLivingIndex.put("Waterbury, CT", 104.1);
        costOfLivingIndex.put("Norwalk, CT", 134.1);
        costOfLivingIndex.put("Danbury, CT", 124.8);
        costOfLivingIndex.put("New Britain, CT", 105.5);
        costOfLivingIndex.put("West Hartford, CT", 123.6);
        costOfLivingIndex.put("Greenwich, CT", 179.8);
        costOfLivingIndex.put("Fairfield, CT", 142.5);
        costOfLivingIndex.put("Hamden, CT", 113.7);
        costOfLivingIndex.put("Meriden, CT", 103.4);
        costOfLivingIndex.put("Bristol, CT", 103.3);
        costOfLivingIndex.put("Manchester, CT", 110.4);
        costOfLivingIndex.put("West Haven, CT", 112.2);
        costOfLivingIndex.put("Stratford, CT", 118.2);
        costOfLivingIndex.put("East Hartford, CT", 104.1);
        costOfLivingIndex.put("Milford, CT", 122.9);
        costOfLivingIndex.put("Middletown, CT", 109.7);

        // Florida
        costOfLivingIndex.put("Miami, FL", 122.6);
        costOfLivingIndex.put("Orlando, FL", 101.5);
        costOfLivingIndex.put("Tampa, FL", 103.2);
        costOfLivingIndex.put("Jacksonville, FL", 96.7);
        costOfLivingIndex.put("Fort Lauderdale, FL", 115.5);
        costOfLivingIndex.put("St. Petersburg, FL", 101.0);
        costOfLivingIndex.put("Hialeah, FL", 102.3);
        costOfLivingIndex.put("Tallahassee, FL", 98.5);
        costOfLivingIndex.put("Cape Coral, FL", 106.0);
        costOfLivingIndex.put("Pembroke Pines, FL", 107.5);
        costOfLivingIndex.put("Hollywood, FL", 105.0);
        costOfLivingIndex.put("Coral Springs, FL", 104.5);
        costOfLivingIndex.put("Gainesville, FL", 96.7);
        costOfLivingIndex.put("Port St. Lucie, FL", 100.2);
        costOfLivingIndex.put("West Palm Beach, FL", 113.7);
        costOfLivingIndex.put("Clearwater, FL", 103.4);
        costOfLivingIndex.put("Lakeland, FL", 98.2);
        costOfLivingIndex.put("Pompano Beach, FL", 101.6);
        costOfLivingIndex.put("Palm Bay, FL", 95.0);
        costOfLivingIndex.put("Davie, FL", 103.0);

        // Georgia
        costOfLivingIndex.put("Atlanta, GA", 107.3);
        costOfLivingIndex.put("Augusta, GA", 88.7);
        costOfLivingIndex.put("Savannah, GA", 95.6);
        costOfLivingIndex.put("Columbus, GA", 89.0);
        costOfLivingIndex.put("Athens, GA", 91.0);
        costOfLivingIndex.put("Macon, GA", 87.6);
        costOfLivingIndex.put("Sandy Springs, GA", 110.5);
        costOfLivingIndex.put("Roswell, GA", 107.8);
        costOfLivingIndex.put("Johns Creek, GA", 111.2);
        costOfLivingIndex.put("Warner Robins, GA", 86.0);
        costOfLivingIndex.put("Albany, GA", 85.5);
        costOfLivingIndex.put("Alpharetta, GA", 112.5);
        costOfLivingIndex.put("Marietta, GA", 105.0);
        costOfLivingIndex.put("Valdosta, GA", 84.7);
        costOfLivingIndex.put("Brookhaven, GA", 109.0);
        costOfLivingIndex.put("Peachtree City, GA", 108.7);
        costOfLivingIndex.put("Dunwoody, GA", 110.0);
        costOfLivingIndex.put("Milton, GA", 113.0);
        costOfLivingIndex.put("Gainesville, GA", 95.0);
        costOfLivingIndex.put("Smyrna, GA", 106.5);

        // Hawaii
        costOfLivingIndex.put("Honolulu, HI", 185.7);
        costOfLivingIndex.put("Hilo, HI", 140.0);
        costOfLivingIndex.put("Kailua, HI", 170.5);
        costOfLivingIndex.put("Kaneohe, HI", 165.7);
        costOfLivingIndex.put("Waipahu, HI", 155.4);
        costOfLivingIndex.put("Pearl City, HI", 163.0);
        costOfLivingIndex.put("Ewa Beach, HI", 162.7);
        costOfLivingIndex.put("Mililani, HI", 158.9);
        costOfLivingIndex.put("Lihue, HI", 168.0);
        costOfLivingIndex.put("Lahaina, HI", 173.5);
        costOfLivingIndex.put("Kapolei, HI", 165.0);
        costOfLivingIndex.put("Kihei, HI", 164.5);
        costOfLivingIndex.put("Wailuku, HI", 159.7);
        costOfLivingIndex.put("Hana, HI", 168.7);
        costOfLivingIndex.put("Makawao, HI", 162.3);

        // Illinois
        costOfLivingIndex.put("Chicago, IL", 117.7);
        costOfLivingIndex.put("Aurora, IL", 104.1);
        costOfLivingIndex.put("Rockford, IL", 87.7);
        costOfLivingIndex.put("Joliet, IL", 98.8);
        costOfLivingIndex.put("Naperville, IL", 122.7);
        costOfLivingIndex.put("Springfield, IL", 85.1);
        costOfLivingIndex.put("Peoria, IL", 83.3);
        costOfLivingIndex.put("Elgin, IL", 104.9);
        costOfLivingIndex.put("Waukegan, IL", 99.5);
        costOfLivingIndex.put("Champaign, IL", 88.2);
        costOfLivingIndex.put("Cicero, IL", 107.7);
        costOfLivingIndex.put("Schaumburg, IL", 112.4);
        costOfLivingIndex.put("Bloomington, IL", 90.7);
        costOfLivingIndex.put("Evanston, IL", 127.7);
        costOfLivingIndex.put("Arlington Heights, IL", 116.3);
        costOfLivingIndex.put("Bolingbrook, IL", 104.1);
        costOfLivingIndex.put("Decatur, IL", 78.7);
        costOfLivingIndex.put("Palatine, IL", 109.0);
        costOfLivingIndex.put("Skokie, IL", 115.7);
        costOfLivingIndex.put("Des Plaines, IL", 105.8);

        // Indiana
        costOfLivingIndex.put("Indianapolis, IN", 91.7);
        costOfLivingIndex.put("Fort Wayne, IN", 85.5);
        costOfLivingIndex.put("Evansville, IN", 84.6);
        costOfLivingIndex.put("South Bend, IN", 83.8);
        costOfLivingIndex.put("Carmel, IN", 106.3);
        costOfLivingIndex.put("Fishers, IN", 105.4);
        costOfLivingIndex.put("Bloomington, IN", 99.2);
        costOfLivingIndex.put("Hammond, IN", 87.5);
        costOfLivingIndex.put("Lafayette, IN", 89.4);
        costOfLivingIndex.put("Noblesville, IN", 100.5);
        costOfLivingIndex.put("Gary, IN", 79.9);
        costOfLivingIndex.put("Muncie, IN", 78.8);
        costOfLivingIndex.put("Greenwood, IN", 92.8);
        costOfLivingIndex.put("Kokomo, IN", 81.2);
        costOfLivingIndex.put("Terre Haute, IN", 80.0);
        costOfLivingIndex.put("Anderson, IN", 79.4);
        costOfLivingIndex.put("Elkhart, IN", 81.3);
        costOfLivingIndex.put("Mishawaka, IN", 84.7);
        costOfLivingIndex.put("Columbus, IN", 90.0);
        costOfLivingIndex.put("Jeffersonville, IN", 87.4);

        // Iowa
        costOfLivingIndex.put("Des Moines, IA", 94.0);
        costOfLivingIndex.put("Cedar Rapids, IA", 91.0);
        costOfLivingIndex.put("Davenport, IA", 89.7);
        costOfLivingIndex.put("Sioux City, IA", 87.5);
        costOfLivingIndex.put("Waterloo, IA", 88.4);
        costOfLivingIndex.put("Iowa City, IA", 102.1);
        costOfLivingIndex.put("Council Bluffs, IA", 90.7);
        costOfLivingIndex.put("Ames, IA", 95.6);
        costOfLivingIndex.put("Ankeny, IA", 96.5);
        costOfLivingIndex.put("Cedar Falls, IA", 94.3);
        costOfLivingIndex.put("Dubuque, IA", 88.0);
        costOfLivingIndex.put("Urbandale, IA", 95.7);
        costOfLivingIndex.put("West Des Moines, IA", 98.0);
        costOfLivingIndex.put("Mason City, IA", 85.3);
        costOfLivingIndex.put("Marion, IA", 92.8);
        costOfLivingIndex.put("Bettendorf, IA", 97.5);
        costOfLivingIndex.put("Fort Dodge, IA", 83.9);
        costOfLivingIndex.put("Ottumwa, IA", 84.5);
        costOfLivingIndex.put("Clinton, IA", 82.7);
        costOfLivingIndex.put("Marshalltown, IA", 83.4);

        // Idaho
        costOfLivingIndex.put("Boise, ID", 102.8);
        costOfLivingIndex.put("Meridian, ID", 107.8);
        costOfLivingIndex.put("Nampa, ID", 96.5);
        costOfLivingIndex.put("Idaho Falls, ID", 94.3);
        costOfLivingIndex.put("Pocatello, ID", 88.7);
        costOfLivingIndex.put("Caldwell, ID", 93.5);
        costOfLivingIndex.put("Twin Falls, ID", 94.2);
        costOfLivingIndex.put("Lewiston, ID", 90.4);
        costOfLivingIndex.put("Post Falls, ID", 95.6);
        costOfLivingIndex.put("Rexburg, ID", 89.3);
        costOfLivingIndex.put("Eagle, ID", 118.5);
        costOfLivingIndex.put("Moscow, ID", 97.4);
        costOfLivingIndex.put("Coeur d'Alene, ID", 103.3);
        costOfLivingIndex.put("Kuna, ID", 97.1);
        costOfLivingIndex.put("Mountain Home, ID", 90.5);
        costOfLivingIndex.put("Ammon, ID", 94.6);
        costOfLivingIndex.put("Blackfoot, ID", 89.7);
        costOfLivingIndex.put("Chubbuck, ID", 91.5);
        costOfLivingIndex.put("Burley, ID", 89.3);
        costOfLivingIndex.put("Hayden, ID", 97.8);

        // Kansas
        costOfLivingIndex.put("Wichita, KS", 92.5);
        costOfLivingIndex.put("Overland Park, KS", 108.6);
        costOfLivingIndex.put("Kansas City, KS", 95.4);
        costOfLivingIndex.put("Topeka, KS", 88.5);
        costOfLivingIndex.put("Olathe, KS", 105.2);
        costOfLivingIndex.put("Lawrence, KS", 101.0);
        costOfLivingIndex.put("Shawnee, KS", 103.3);
        costOfLivingIndex.put("Lenexa, KS", 104.4);
        costOfLivingIndex.put("Manhattan, KS", 98.0);
        costOfLivingIndex.put("Salina, KS", 85.2);
        costOfLivingIndex.put("Hutchinson, KS", 84.5);
        costOfLivingIndex.put("Leawood, KS", 115.5);
        costOfLivingIndex.put("Garden City, KS", 86.3);
        costOfLivingIndex.put("Derby, KS", 94.0);
        costOfLivingIndex.put("Emporia, KS", 85.0);
        costOfLivingIndex.put("Dodge City, KS", 83.0);
        costOfLivingIndex.put("Junction City, KS", 90.5);
        costOfLivingIndex.put("Pittsburg, KS", 84.2);
        costOfLivingIndex.put("Prairie Village, KS", 114.0);
        costOfLivingIndex.put("Liberal, KS", 82.5);

        // Kentucky
        costOfLivingIndex.put("Louisville, KY", 91.2);
        costOfLivingIndex.put("Lexington, KY", 93.4);
        costOfLivingIndex.put("Bowling Green, KY", 88.8);
        costOfLivingIndex.put("Owensboro, KY", 85.1);
        costOfLivingIndex.put("Covington, KY", 96.4);
        costOfLivingIndex.put("Georgetown, KY", 93.4);
        costOfLivingIndex.put("Richmond, KY", 84.9);
        costOfLivingIndex.put("Florence, KY", 92.1);
        costOfLivingIndex.put("Elizabethtown, KY", 87.3);
        costOfLivingIndex.put("Hopkinsville, KY", 80.5);
        costOfLivingIndex.put("Nicholasville, KY", 93.6);
        costOfLivingIndex.put("Independence, KY", 92.4);
        costOfLivingIndex.put("Frankfort, KY", 85.1);
        costOfLivingIndex.put("Jeffersontown, KY", 93.8);
        costOfLivingIndex.put("Henderson, KY", 86.4);
        costOfLivingIndex.put("Paducah, KY", 83.8);
        costOfLivingIndex.put("Radcliff, KY", 86.1);
        costOfLivingIndex.put("Ashland, KY", 80.3);
        costOfLivingIndex.put("Winchester, KY", 87.5);
        costOfLivingIndex.put("Murray, KY", 85.2);

        // Louisiana
        costOfLivingIndex.put("New Orleans, LA", 97.7);
        costOfLivingIndex.put("Baton Rouge, LA", 94.1);
        costOfLivingIndex.put("Shreveport, LA", 87.7);
        costOfLivingIndex.put("Lafayette, LA", 91.5);
        costOfLivingIndex.put("Lake Charles, LA", 90.0);
        costOfLivingIndex.put("Kenner, LA", 95.2);
        costOfLivingIndex.put("Bossier City, LA", 89.5);
        costOfLivingIndex.put("Monroe, LA", 84.7);
        costOfLivingIndex.put("Alexandria, LA", 85.3);
        costOfLivingIndex.put("Houma, LA", 89.7);
        costOfLivingIndex.put("Central, LA", 93.1);
        costOfLivingIndex.put("Slidell, LA", 92.2);
        costOfLivingIndex.put("New Iberia, LA", 87.7);
        costOfLivingIndex.put("Ruston, LA", 86.8);
        costOfLivingIndex.put("Sulphur, LA", 90.4);
        costOfLivingIndex.put("Hammond, LA", 88.4);
        costOfLivingIndex.put("Opelousas, LA", 82.2);
        costOfLivingIndex.put("Mandeville, LA", 101.1);
        costOfLivingIndex.put("Morgan, LA", 94.4);

        // Maine
        costOfLivingIndex.put("Portland, ME", 119.1);
        costOfLivingIndex.put("Lewiston, ME", 96.2);
        costOfLivingIndex.put("Bangor, ME", 94.6);
        costOfLivingIndex.put("South Portland, ME", 116.6);
        costOfLivingIndex.put("Auburn, ME", 98.3);
        costOfLivingIndex.put("Biddeford, ME", 106.3);
        costOfLivingIndex.put("Sanford, ME", 103.2);
        costOfLivingIndex.put("Brunswick, ME", 108.9);
        costOfLivingIndex.put("Augusta, ME", 94.4);
        costOfLivingIndex.put("Camden, ME", 115.0);
        costOfLivingIndex.put("Cape Elizabeth, ME", 125.0);
        costOfLivingIndex.put("Falmouth, ME", 123.0);
        costOfLivingIndex.put("Gorham, ME", 105.0);
        costOfLivingIndex.put("Kennebunk, ME", 115.0);
        costOfLivingIndex.put("Waterville, ME", 92.0);
        costOfLivingIndex.put("Saco, ME", 104.0);
        costOfLivingIndex.put("Ellsworth, ME", 98.0);
        costOfLivingIndex.put("Rockland, ME", 102.0);
        costOfLivingIndex.put("Yarmouth, ME", 120.0);
        costOfLivingIndex.put("Old Orchard Beach, ME", 105.0);

        // Maryland
        costOfLivingIndex.put("Baltimore, MD", 102.3);
        costOfLivingIndex.put("Columbia, MD", 126.4);
        costOfLivingIndex.put("Germantown, MD", 127.5);
        costOfLivingIndex.put("Waldorf, MD", 117.5);
        costOfLivingIndex.put("Kailua, HI", 170.5);
        costOfLivingIndex.put("Kaneohe, HI", 165.7);
        costOfLivingIndex.put("Waipahu, HI", 155.4);
        costOfLivingIndex.put("Pearl City, HI", 163.0);
        costOfLivingIndex.put("Ewa Beach, HI", 162.7);
        costOfLivingIndex.put("Mililani, HI", 158.9);
        costOfLivingIndex.put("Lihue, HI", 168.0);
        costOfLivingIndex.put("Lahaina, HI", 173.5);
        costOfLivingIndex.put("Kapolei, HI", 165.0);
        costOfLivingIndex.put("Kihei, HI", 164.5);
        costOfLivingIndex.put("Wailuku, HI", 159.7);
        costOfLivingIndex.put("Hana, HI", 168.7);
        costOfLivingIndex.put("Makawao, HI", 162.3);

        // Illinois
        costOfLivingIndex.put("Chicago, IL", 117.7);
        costOfLivingIndex.put("Aurora, IL", 104.1);
        costOfLivingIndex.put("Rockford, IL", 87.7);
        costOfLivingIndex.put("Joliet, IL", 98.8);
        costOfLivingIndex.put("Naperville, IL", 122.7);
        costOfLivingIndex.put("Springfield, IL", 85.1);
        costOfLivingIndex.put("Peoria, IL", 83.3);
        costOfLivingIndex.put("Elgin, IL", 104.9);
        costOfLivingIndex.put("Waukegan, IL", 99.5);
        costOfLivingIndex.put("Champaign, IL", 88.2);
        costOfLivingIndex.put("Cicero, IL", 107.7);
        costOfLivingIndex.put("Schaumburg, IL", 112.4);
        costOfLivingIndex.put("Bloomington, IL", 90.7);
        costOfLivingIndex.put("Evanston, IL", 127.7);
        costOfLivingIndex.put("Arlington Heights, IL", 116.3);
        costOfLivingIndex.put("Bolingbrook, IL", 104.1);
        costOfLivingIndex.put("Decatur, IL", 78.7);
        costOfLivingIndex.put("Palatine, IL", 109.0);
        costOfLivingIndex.put("Skokie, IL", 115.7);
        costOfLivingIndex.put("Des Plaines, IL", 105.8);

        // Indiana
        costOfLivingIndex.put("Indianapolis, IN", 91.7);
        costOfLivingIndex.put("Fort Wayne, IN", 85.5);
        costOfLivingIndex.put("Evansville, IN", 84.6);
        costOfLivingIndex.put("South Bend, IN", 83.8);
        costOfLivingIndex.put("Carmel, IN", 106.3);
        costOfLivingIndex.put("Fishers, IN", 105.4);
        costOfLivingIndex.put("Bloomington, IN", 99.2);
        costOfLivingIndex.put("Hammond, IN", 87.5);
        costOfLivingIndex.put("Lafayette, IN", 89.4);
        costOfLivingIndex.put("Noblesville, IN", 100.5);
        costOfLivingIndex.put("Gary, IN", 79.9);
        costOfLivingIndex.put("Muncie, IN", 78.8);
        costOfLivingIndex.put("Greenwood, IN", 92.8);
        costOfLivingIndex.put("Kokomo, IN", 81.2);
        costOfLivingIndex.put("Terre Haute, IN", 80.0);
        costOfLivingIndex.put("Anderson, IN", 79.4);
        costOfLivingIndex.put("Elkhart, IN", 81.3);
        costOfLivingIndex.put("Mishawaka, IN", 84.7);
        costOfLivingIndex.put("Columbus, IN", 90.0);
        costOfLivingIndex.put("Jeffersonville, IN", 87.4);

        // Iowa
        costOfLivingIndex.put("Des Moines, IA", 94.0);
        costOfLivingIndex.put("Cedar Rapids, IA", 91.0);
        costOfLivingIndex.put("Davenport, IA", 89.7);
        costOfLivingIndex.put("Sioux City, IA", 87.5);
        costOfLivingIndex.put("Waterloo, IA", 88.4);
        costOfLivingIndex.put("Iowa City, IA", 102.1);
        costOfLivingIndex.put("Council Bluffs, IA", 90.7);
        costOfLivingIndex.put("Ames, IA", 95.6);
        costOfLivingIndex.put("Ankeny, IA", 96.5);
        costOfLivingIndex.put("Cedar Falls, IA", 94.3);
        costOfLivingIndex.put("Dubuque, IA", 88.0);
        costOfLivingIndex.put("Urbandale, IA", 95.7);
        costOfLivingIndex.put("West Des Moines, IA", 98.0);
        costOfLivingIndex.put("Mason City, IA", 85.3);
        costOfLivingIndex.put("Marion, IA", 92.8);
        costOfLivingIndex.put("Bettendorf, IA", 97.5);
        costOfLivingIndex.put("Fort Dodge, IA", 83.9);
        costOfLivingIndex.put("Ottumwa, IA", 84.5);
        costOfLivingIndex.put("Clinton, IA", 82.7);
        costOfLivingIndex.put("Marshalltown, IA", 83.4);

        // Idaho
        costOfLivingIndex.put("Boise, ID", 102.8);
        costOfLivingIndex.put("Meridian, ID", 107.8);
        costOfLivingIndex.put("Nampa, ID", 96.5);
        costOfLivingIndex.put("Idaho Falls, ID", 94.3);
        costOfLivingIndex.put("Pocatello, ID", 88.7);
        costOfLivingIndex.put("Caldwell, ID", 93.5);
        costOfLivingIndex.put("Twin Falls, ID", 94.2);
        costOfLivingIndex.put("Lewiston, ID", 90.4);
        costOfLivingIndex.put("Post Falls, ID", 95.6);
        costOfLivingIndex.put("Rexburg, ID", 89.3);
        costOfLivingIndex.put("Eagle, ID", 118.5);
        costOfLivingIndex.put("Moscow, ID", 97.4);
        costOfLivingIndex.put("Coeur d'Alene, ID", 103.3);
        costOfLivingIndex.put("Kuna, ID", 97.1);
        costOfLivingIndex.put("Mountain Home, ID", 90.5);
        costOfLivingIndex.put("Ammon, ID", 94.6);
        costOfLivingIndex.put("Blackfoot, ID", 89.7);
        costOfLivingIndex.put("Chubbuck, ID", 91.5);
        costOfLivingIndex.put("Burley, ID", 89.3);
        costOfLivingIndex.put("Hayden, ID", 97.8);

        // Kansas
        costOfLivingIndex.put("Wichita, KS", 92.5);
        costOfLivingIndex.put("Overland Park, KS", 108.6);
        costOfLivingIndex.put("Kansas City, KS", 95.4);
        costOfLivingIndex.put("Topeka, KS", 88.5);
        costOfLivingIndex.put("Olathe, KS", 105.2);
        costOfLivingIndex.put("Lawrence, KS", 101.0);
        costOfLivingIndex.put("Shawnee, KS", 103.3);
        costOfLivingIndex.put("Lenexa, KS", 104.4);
        costOfLivingIndex.put("Manhattan, KS", 98.0);
        costOfLivingIndex.put("Salina, KS", 85.2);
        costOfLivingIndex.put("Hutchinson, KS", 84.5);
        costOfLivingIndex.put("Leawood, KS", 115.5);
        costOfLivingIndex.put("Garden City, KS", 86.3);
        costOfLivingIndex.put("Derby, KS", 94.0);
        costOfLivingIndex.put("Emporia, KS", 85.0);
        costOfLivingIndex.put("Dodge City, KS", 83.0);
        costOfLivingIndex.put("Junction City, KS", 90.5);
        costOfLivingIndex.put("Pittsburg, KS", 84.2);
        costOfLivingIndex.put("Prairie Village, KS", 114.0);
        costOfLivingIndex.put("Liberal, KS", 82.5);

        // Kentucky
        costOfLivingIndex.put("Louisville, KY", 91.2);
        costOfLivingIndex.put("Lexington, KY", 93.4);
        costOfLivingIndex.put("Bowling Green, KY", 88.8);
        costOfLivingIndex.put("Owensboro, KY", 85.1);
        costOfLivingIndex.put("Covington, KY", 96.4);
        costOfLivingIndex.put("Georgetown, KY", 93.4);
        costOfLivingIndex.put("Richmond, KY", 84.9);
        costOfLivingIndex.put("Florence, KY", 92.1);
        costOfLivingIndex.put("Elizabethtown, KY", 87.3);
        costOfLivingIndex.put("Hopkinsville, KY", 80.5);
        costOfLivingIndex.put("Nicholasville, KY", 93.6);
        costOfLivingIndex.put("Independence, KY", 92.4);
        costOfLivingIndex.put("Frankfort, KY", 85.1);
        costOfLivingIndex.put("Jeffersontown, KY", 93.8);
        costOfLivingIndex.put("Henderson, KY", 86.4);
        costOfLivingIndex.put("Paducah, KY", 83.8);
        costOfLivingIndex.put("Radcliff, KY", 86.1);
        costOfLivingIndex.put("Ashland, KY", 80.3);
        costOfLivingIndex.put("Winchester, KY", 87.5);
        costOfLivingIndex.put("Murray, KY", 85.2);

        // Louisiana
        costOfLivingIndex.put("New Orleans, LA", 97.7);
        costOfLivingIndex.put("Baton Rouge, LA", 94.1);
        costOfLivingIndex.put("Shreveport, LA", 87.7);
        costOfLivingIndex.put("Lafayette, LA", 91.5);
        costOfLivingIndex.put("Lake Charles, LA", 90.0);
        costOfLivingIndex.put("Kenner, LA", 95.2);
        costOfLivingIndex.put("Bossier City, LA", 89.5);
        costOfLivingIndex.put("Monroe, LA", 84.7);
        costOfLivingIndex.put("Alexandria, LA", 85.3);
        costOfLivingIndex.put("Houma, LA", 89.7);
        costOfLivingIndex.put("Central, LA", 93.1);
        costOfLivingIndex.put("Slidell, LA", 92.2);
        costOfLivingIndex.put("New Iberia, LA", 87.7);
        costOfLivingIndex.put("Ruston, LA", 86.8);
        costOfLivingIndex.put("Sulphur, LA", 90.4);
        costOfLivingIndex.put("Hammond, LA", 88.4);
        costOfLivingIndex.put("Opelousas, LA", 82.2);
        costOfLivingIndex.put("Mandeville, LA", 101.1);
        costOfLivingIndex.put("Morgan, LA", 94.4);

        // Maine
        costOfLivingIndex.put("Portland, ME", 119.1);
        costOfLivingIndex.put("Lewiston, ME", 96.2);
        costOfLivingIndex.put("Bangor, ME", 94.6);
        costOfLivingIndex.put("South Portland, ME", 116.6);
        costOfLivingIndex.put("Auburn, ME", 98.3);
        costOfLivingIndex.put("Biddeford, ME", 106.3);
        costOfLivingIndex.put("Sanford, ME", 103.2);
        costOfLivingIndex.put("Brunswick, ME", 108.9);
        costOfLivingIndex.put("Augusta, ME", 94.4);
        costOfLivingIndex.put("Camden, ME", 115.0);
        costOfLivingIndex.put("Cape Elizabeth, ME", 125.0);
        costOfLivingIndex.put("Falmouth, ME", 123.0);
        costOfLivingIndex.put("Gorham, ME", 105.0);
        costOfLivingIndex.put("Kennebunk, ME", 115.0);
        costOfLivingIndex.put("Waterville, ME", 92.0);
        costOfLivingIndex.put("Saco, ME", 104.0);
        costOfLivingIndex.put("Ellsworth, ME", 98.0);
        costOfLivingIndex.put("Rockland, ME", 102.0);
        costOfLivingIndex.put("Yarmouth, ME", 120.0);
        costOfLivingIndex.put("Old Orchard Beach, ME", 105.0);

        // Maryland
        costOfLivingIndex.put("Baltimore, MD", 102.3);
        costOfLivingIndex.put("Columbia, MD", 126.4);
        costOfLivingIndex.put("Germantown, MD", 127.5);
        costOfLivingIndex.put("Waldorf, MD", 117.5);
        costOfLivingIndex.put("Silver Spring, MD", 129.9);
        costOfLivingIndex.put("Frederick, MD", 118.1);
        costOfLivingIndex.put("Gaithersburg, MD", 132.6);
        costOfLivingIndex.put("Bethesda, MD", 170.1);
        costOfLivingIndex.put("Rockville, MD", 140.5);
        costOfLivingIndex.put("Bowie, MD", 121.7);
        costOfLivingIndex.put("Bel Air South, MD", 119.3);
        costOfLivingIndex.put("Catonsville, MD", 116.3);
        costOfLivingIndex.put("Hagerstown, MD", 95.5);
        costOfLivingIndex.put("Annapolis, MD", 131.7);
        costOfLivingIndex.put("Owings Mills, MD", 119.8);
        costOfLivingIndex.put("College Park, MD", 123.7);
        costOfLivingIndex.put("Salisbury, MD", 100.8);
        costOfLivingIndex.put("Eldersburg, MD", 120.5);
        costOfLivingIndex.put("Bel Air North, MD", 121.9);
        costOfLivingIndex.put("Laurel, MD", 119.9);
        costOfLivingIndex.put("Edgewood, MD", 108.7);
        costOfLivingIndex.put("Greenbelt, MD", 123.6);
        costOfLivingIndex.put("Cumberland, MD", 84.4);

        // Massachusetts
        costOfLivingIndex.put("Boston, MA", 167.7);
        costOfLivingIndex.put("Worcester, MA", 120.0);
        costOfLivingIndex.put("Springfield, MA", 105.0);
        costOfLivingIndex.put("Cambridge, MA", 165.0);
        costOfLivingIndex.put("Lowell, MA", 130.0);
        costOfLivingIndex.put("Brockton, MA", 131.1);
        costOfLivingIndex.put("Quincy, MA", 142.2);
        costOfLivingIndex.put("Lynn, MA", 127.2);
        costOfLivingIndex.put("New Bedford, MA", 102.9);
        costOfLivingIndex.put("Fall River, MA", 103.3);
        costOfLivingIndex.put("Lawrence, MA", 124.5);
        costOfLivingIndex.put("Newton, MA", 179.0);
        costOfLivingIndex.put("Somerville, MA", 154.7);
        costOfLivingIndex.put("Framingham, MA", 135.5);
        costOfLivingIndex.put("Haverhill, MA", 126.5);
        costOfLivingIndex.put("Malden, MA", 140.8);
        costOfLivingIndex.put("Waltham, MA", 141.7);
        costOfLivingIndex.put("Brookline, MA", 159.3);
        costOfLivingIndex.put("Revere, MA", 133.2);
        costOfLivingIndex.put("Plymouth, MA", 126.9);

        // Michigan
        costOfLivingIndex.put("Detroit, MI", 92.6);
        costOfLivingIndex.put("Grand Rapids, MI", 93.5);
        costOfLivingIndex.put("Warren, MI", 92.3);
        costOfLivingIndex.put("Sterling Heights, MI", 97.0);
        costOfLivingIndex.put("Ann Arbor, MI", 110.0);
        costOfLivingIndex.put("Lansing, MI", 89.5);
        costOfLivingIndex.put("Dearborn, MI", 94.4);
        costOfLivingIndex.put("Clinton Township, MI", 96.9);
        costOfLivingIndex.put("Livonia, MI", 97.9);
        costOfLivingIndex.put("Troy, MI", 108.0);
        costOfLivingIndex.put("Westland, MI", 95.5);
        costOfLivingIndex.put("Farmington Hills, MI", 109.1);
        costOfLivingIndex.put("Flint, MI", 79.9);
        costOfLivingIndex.put("Southfield, MI", 97.6);
        costOfLivingIndex.put("Wyoming, MI", 90.9);
        costOfLivingIndex.put("Rochester Hills, MI", 113.9);
        costOfLivingIndex.put("Kalamazoo, MI", 85.8);
        costOfLivingIndex.put("Novi, MI", 114.7);
        costOfLivingIndex.put("Taylor, MI", 92.8);
        costOfLivingIndex.put("Dearborn Heights, MI", 93.8);

        // Minnesota
        costOfLivingIndex.put("Minneapolis, MN", 115.6);
        costOfLivingIndex.put("Saint Paul, MN", 109.1);
        costOfLivingIndex.put("Rochester, MN", 103.1);
        costOfLivingIndex.put("Bloomington, MN", 113.9);
        costOfLivingIndex.put("Duluth, MN", 93.3);
        costOfLivingIndex.put("Brooklyn Park, MN", 109.8);
        costOfLivingIndex.put("Plymouth, MN", 119.2);
        costOfLivingIndex.put("Woodbury, MN", 122.2);
        costOfLivingIndex.put("Maple Grove, MN", 120.3);
        costOfLivingIndex.put("Blaine, MN", 112.9);
        costOfLivingIndex.put("Lakeville, MN", 118.7);
        costOfLivingIndex.put("St. Cloud, MN", 91.4);
        costOfLivingIndex.put("Eagan, MN", 115.0);
        costOfLivingIndex.put("Burnsville, MN", 112.7);
        costOfLivingIndex.put("Eden Prairie, MN", 126.1);
        costOfLivingIndex.put("Coon Rapids, MN", 107.6);
        costOfLivingIndex.put("Apple Valley, MN", 116.2);
        costOfLivingIndex.put("Minnetonka, MN", 124.7);
        costOfLivingIndex.put("Edina, MN", 135.1);
        costOfLivingIndex.put("St. Louis Park, MN", 117.4);

        // Mississippi
        costOfLivingIndex.put("Jackson, MS", 84.9);
        costOfLivingIndex.put("Gulfport, MS", 85.0);
        costOfLivingIndex.put("Southaven, MS", 90.5);
        costOfLivingIndex.put("Biloxi, MS", 86.8);
        costOfLivingIndex.put("Hattiesburg, MS", 84.8);
        costOfLivingIndex.put("Olive Branch, MS", 91.4);
        costOfLivingIndex.put("Tupelo, MS", 83.3);
        costOfLivingIndex.put("Meridian, MS", 80.3);
        costOfLivingIndex.put("Greenville, MS", 78.5);
        costOfLivingIndex.put("Clinton, MS", 90.3);
        costOfLivingIndex.put("Madison, MS", 99.7);
        costOfLivingIndex.put("Pearl, MS", 86.6);
        costOfLivingIndex.put("Horn Lake, MS", 91.5);
        costOfLivingIndex.put("Oxford, MS", 93.0);
        costOfLivingIndex.put("Brandon, MS", 92.4);
        costOfLivingIndex.put("Starkville, MS", 86.5);
        costOfLivingIndex.put("Ridgeland, MS", 98.8);
        costOfLivingIndex.put("Columbus, MS", 79.5);
        costOfLivingIndex.put("Pascagoula, MS", 85.1);
        costOfLivingIndex.put("Vicksburg, MS", 80.3);

        // Missouri
        costOfLivingIndex.put("Kansas City, MO", 94.4);
        costOfLivingIndex.put("St. Louis, MO", 93.4);
        costOfLivingIndex.put("Springfield, MO", 88.5);
        costOfLivingIndex.put("Columbia, MO", 92.1);
        costOfLivingIndex.put("Independence, MO", 90.0);
        costOfLivingIndex.put("Lee's Summit, MO", 102.2);
        costOfLivingIndex.put("O'Fallon, MO", 100.1);
        costOfLivingIndex.put("St. Joseph, MO", 83.0);
        costOfLivingIndex.put("St. Charles, MO", 98.9);
        costOfLivingIndex.put("Blue Springs, MO", 97.8);
        costOfLivingIndex.put("Florissant, MO", 87.6);
        costOfLivingIndex.put("Chesterfield, MO", 116.8);
        costOfLivingIndex.put("Jefferson City, MO", 89.3);
        costOfLivingIndex.put("Joplin, MO", 82.4);
        costOfLivingIndex.put("Cape Girardeau, MO", 85.6);
        costOfLivingIndex.put("Ballwin, MO", 107.0);
        costOfLivingIndex.put("Raytown, MO", 91.9);
        costOfLivingIndex.put("Liberty, MO", 100.6);
        costOfLivingIndex.put("Bridgeton, MO", 90.3);

        // Montana
        costOfLivingIndex.put("Billings, MT", 97.3);
        costOfLivingIndex.put("Missoula, MT", 101.1);
        costOfLivingIndex.put("Great Falls, MT", 93.9);
        costOfLivingIndex.put("Bozeman, MT", 124.4);
        costOfLivingIndex.put("Butte, MT", 91.0);
        costOfLivingIndex.put("Helena, MT", 104.8);
        costOfLivingIndex.put("Kalispell, MT", 103.0);
        costOfLivingIndex.put("Livingston, MT", 105.4);
        costOfLivingIndex.put("Havre, MT", 93.5);
        costOfLivingIndex.put("Whitefish, MT", 115.0);
        costOfLivingIndex.put("Belgrade, MT", 102.0);
        costOfLivingIndex.put("Anaconda, MT", 90.0);
        costOfLivingIndex.put("Lewistown, MT", 89.0);
        costOfLivingIndex.put("Miles City, MT", 92.2);
        costOfLivingIndex.put("Plains, MT", 88.0);
        costOfLivingIndex.put("Libby, MT", 89.0);
        costOfLivingIndex.put("Dillon, MT", 91.0);
        costOfLivingIndex.put("Deer Lodge, MT", 89.0);
        costOfLivingIndex.put("Hamilton, MT", 99.0);
        costOfLivingIndex.put("Stevensville, MT", 95.5);

        // Nebraska
        costOfLivingIndex.put("Omaha, NE", 94.3);
        costOfLivingIndex.put("Lincoln, NE", 95.5);
        costOfLivingIndex.put("Bellevue, NE", 92.7);
        costOfLivingIndex.put("Grand Island, NE", 90.9);
        costOfLivingIndex.put("Kearney, NE", 93.4);
        costOfLivingIndex.put("Fremont, NE", 91.8);
        costOfLivingIndex.put("Hastings, NE", 88.5);
        costOfLivingIndex.put("North Platte, NE", 87.2);
        costOfLivingIndex.put("Norfolk, NE", 86.9);
        costOfLivingIndex.put("Columbus, NE", 88.7);
        costOfLivingIndex.put("Papillion, NE", 97.1);
        costOfLivingIndex.put("La Vista, NE", 95.6);
        costOfLivingIndex.put("Scottsbluff, NE", 85.4);
        costOfLivingIndex.put("Beatrice, NE", 84.3);

        // Nevada
        costOfLivingIndex.put("Las Vegas, NV", 105.0);
        costOfLivingIndex.put("Reno, NV", 110.4);
        costOfLivingIndex.put("Henderson, NV", 108.5);
        costOfLivingIndex.put("Carson City, NV", 105.3);
        costOfLivingIndex.put("North Las Vegas, NV", 103.5);
        costOfLivingIndex.put("Sparks, NV", 108.7);
        costOfLivingIndex.put("Elko, NV", 102.8);
        costOfLivingIndex.put("Mesquite, NV", 99.6);
        costOfLivingIndex.put("Boulder City, NV", 106.9);
        costOfLivingIndex.put("Fernley, NV", 101.2);

        // New Hampshire
        costOfLivingIndex.put("Manchester, NH", 115.0);
        costOfLivingIndex.put("Nashua, NH", 113.3);
        costOfLivingIndex.put("Concord, NH", 110.2);
        costOfLivingIndex.put("Derry, NH", 111.5);
        costOfLivingIndex.put("Dover, NH", 112.0);
        costOfLivingIndex.put("Rochester, NH", 108.7);
        costOfLivingIndex.put("Salem, NH", 114.8);
        costOfLivingIndex.put("Merrimack, NH", 115.9);
        costOfLivingIndex.put("Londonderry, NH", 116.3);
        costOfLivingIndex.put("Hudson, NH", 113.5);

        // New Jersey
        costOfLivingIndex.put("Newark, NJ", 125.0);
        costOfLivingIndex.put("Jersey City, NJ", 140.3);
        costOfLivingIndex.put("Paterson, NJ", 122.0);
        costOfLivingIndex.put("Elizabeth, NJ", 118.6);
        costOfLivingIndex.put("Edison, NJ", 130.0);
        costOfLivingIndex.put("Woodbridge, NJ", 126.5);
        costOfLivingIndex.put("Lakewood, NJ", 124.8);
        costOfLivingIndex.put("Toms River, NJ", 121.7);
        costOfLivingIndex.put("Hamilton, NJ", 119.3);
        costOfLivingIndex.put("Trenton, NJ", 110.5);

        // New Mexico
        costOfLivingIndex.put("Albuquerque, NM", 97.0);
        costOfLivingIndex.put("Las Cruces, NM", 90.7);
        costOfLivingIndex.put("Rio Rancho, NM", 93.0);
        costOfLivingIndex.put("Santa Fe, NM", 107.3);
        costOfLivingIndex.put("Roswell, NM", 85.0);
        costOfLivingIndex.put("Farmington, NM", 89.6);
        costOfLivingIndex.put("Clovis, NM", 84.2);
        costOfLivingIndex.put("Hobbs, NM", 86.5);
        costOfLivingIndex.put("Alamogordo, NM", 85.8);
        costOfLivingIndex.put("Carlsbad, NM", 92.7);

        // New York
        costOfLivingIndex.put("New York, NY", 180.0);
        costOfLivingIndex.put("Buffalo, NY", 97.5);
        costOfLivingIndex.put("Rochester, NY", 99.0);
        costOfLivingIndex.put("Yonkers, NY", 143.0);
        costOfLivingIndex.put("Syracuse, NY", 95.6);
        costOfLivingIndex.put("Albany, NY", 107.2);
        costOfLivingIndex.put("New Rochelle, NY", 144.5);
        costOfLivingIndex.put("Mount Vernon, NY", 140.2);
        costOfLivingIndex.put("Schenectady, NY", 92.8);
        costOfLivingIndex.put("Utica, NY", 87.9);

        // North Carolina
        costOfLivingIndex.put("Charlotte, NC", 103.0);
        costOfLivingIndex.put("Raleigh, NC", 102.5);
        costOfLivingIndex.put("Greensboro, NC", 95.6);
        costOfLivingIndex.put("Durham, NC", 101.0);
        costOfLivingIndex.put("Winston-Salem, NC", 94.5);
        costOfLivingIndex.put("Fayetteville, NC", 89.7);
        costOfLivingIndex.put("Cary, NC", 106.2);
        costOfLivingIndex.put("Wilmington, NC", 100.8);
        costOfLivingIndex.put("High Point, NC", 92.3);
        costOfLivingIndex.put("Concord, NC", 98.9);

        // North Dakota
        costOfLivingIndex.put("Fargo, ND", 98.7);
        costOfLivingIndex.put("Bismarck, ND", 95.5);
        costOfLivingIndex.put("Grand Forks, ND", 94.0);
        costOfLivingIndex.put("Minot, ND", 93.7);
        costOfLivingIndex.put("West Fargo, ND", 97.5);
        costOfLivingIndex.put("Williston, ND", 98.3);
        costOfLivingIndex.put("Dickinson, ND", 94.6);
        costOfLivingIndex.put("Mandan, ND", 93.2);
        costOfLivingIndex.put("Jamestown, ND", 88.9);
        costOfLivingIndex.put("Wahpeton, ND", 87.5);

        // Ohio
        costOfLivingIndex.put("Columbus, OH", 95.0);
        costOfLivingIndex.put("Cleveland, OH", 93.0);
        costOfLivingIndex.put("Cincinnati, OH", 95.0);
        costOfLivingIndex.put("Toledo, OH", 87.3);
        costOfLivingIndex.put("Akron, OH", 91.7);
        costOfLivingIndex.put("Dayton, OH", 89.2);
        costOfLivingIndex.put("Parma, OH", 90.8);
        costOfLivingIndex.put("Canton, OH", 84.5);
        costOfLivingIndex.put("Youngstown, OH", 81.2);
        costOfLivingIndex.put("Lorain, OH", 86.9);

        // Oklahoma
        costOfLivingIndex.put("Oklahoma City, OK", 93.5);
        costOfLivingIndex.put("Tulsa, OK", 91.3);
        costOfLivingIndex.put("Norman, OK", 93.0);
        costOfLivingIndex.put("Broken Arrow, OK", 94.5);
        costOfLivingIndex.put("Lawton, OK", 85.2);
        costOfLivingIndex.put("Edmond, OK", 98.7);
        costOfLivingIndex.put("Moore, OK", 92.8);
        costOfLivingIndex.put("Midwest City, OK", 89.6);
        costOfLivingIndex.put("Enid, OK", 84.7);
        costOfLivingIndex.put("Stillwater, OK", 90.5);

        // Oregon
        costOfLivingIndex.put("Portland, OR", 132.5);
        costOfLivingIndex.put("Eugene, OR", 110.7);
        costOfLivingIndex.put("Salem, OR", 103.6);
        costOfLivingIndex.put("Gresham, OR", 117.5);
        costOfLivingIndex.put("Hillsboro, OR", 125.0);
        costOfLivingIndex.put("Beaverton, OR", 128.2);
        costOfLivingIndex.put("Bend, OR", 121.9);
        costOfLivingIndex.put("Medford, OR", 108.4);
        costOfLivingIndex.put("Springfield, OR", 106.2);
        costOfLivingIndex.put("Corvallis, OR", 112.8);

        // Pennsylvania
        costOfLivingIndex.put("Philadelphia, PA", 122.0);
        costOfLivingIndex.put("Pittsburgh, PA", 100.5);
        costOfLivingIndex.put("Allentown, PA", 103.4);
        costOfLivingIndex.put("Erie, PA", 90.7);
        costOfLivingIndex.put("Reading, PA", 93.5);
        costOfLivingIndex.put("Scranton, PA", 88.9);
        costOfLivingIndex.put("Bethlehem, PA", 102.8);
        costOfLivingIndex.put("Lancaster, PA", 101.2);
        costOfLivingIndex.put("Harrisburg, PA", 96.7);
        costOfLivingIndex.put("Altoona, PA", 85.3);

        // Rhode Island
        costOfLivingIndex.put("Providence, RI", 120.0);
        costOfLivingIndex.put("Warwick, RI", 115.5);
        costOfLivingIndex.put("Cranston, RI", 113.2);
        costOfLivingIndex.put("Pawtucket, RI", 110.3);
        costOfLivingIndex.put("East Providence, RI", 109.7);
        costOfLivingIndex.put("Woonsocket, RI", 107.6);
        costOfLivingIndex.put("Newport, RI", 131.8);
        costOfLivingIndex.put("Central Falls, RI", 105.9);
        costOfLivingIndex.put("Westerly, RI", 117.4);
        costOfLivingIndex.put("North Providence, RI", 111.5);

        // South Carolina
        costOfLivingIndex.put("Charleston, SC", 104.3);
        costOfLivingIndex.put("Columbia, SC", 95.7);
        costOfLivingIndex.put("North Charleston, SC", 100.0);
        costOfLivingIndex.put("Mount Pleasant, SC", 118.4);
        costOfLivingIndex.put("Greenville, SC", 101.7);
        costOfLivingIndex.put("Rock Hill, SC", 97.3);
        costOfLivingIndex.put("Summerville, SC", 101.2);
        costOfLivingIndex.put("Goose Creek, SC", 98.6);
        costOfLivingIndex.put("Sumter, SC", 87.4);
        costOfLivingIndex.put("Hilton Head Island, SC", 122.8);

        // South Dakota
        costOfLivingIndex.put("Sioux Falls, SD", 95.3);
        costOfLivingIndex.put("Rapid City, SD", 93.0);
        costOfLivingIndex.put("Aberdeen, SD", 90.5);
        costOfLivingIndex.put("Brookings, SD", 92.0);
        costOfLivingIndex.put("Watertown, SD", 90.7);
        costOfLivingIndex.put("Mitchell, SD", 88.2);
        costOfLivingIndex.put("Yankton, SD", 87.9);
        costOfLivingIndex.put("Pierre, SD", 91.4);
        costOfLivingIndex.put("Huron, SD", 86.3);
        costOfLivingIndex.put("Vermillion, SD", 89.8);

        // Tennessee
        costOfLivingIndex.put("Nashville, TN", 110.0);
        costOfLivingIndex.put("Memphis, TN", 95.2);
        costOfLivingIndex.put("Knoxville, TN", 94.0);
        costOfLivingIndex.put("Chattanooga, TN", 98.5);
        costOfLivingIndex.put("Clarksville, TN", 92.0);
        costOfLivingIndex.put("Murfreesboro, TN", 101.3);
        costOfLivingIndex.put("Franklin, TN", 118.7);
        costOfLivingIndex.put("Jackson, TN", 87.4);
        costOfLivingIndex.put("Johnson City, TN", 89.8);
        costOfLivingIndex.put("Bartlett, TN", 96.5);

        // Texas
        costOfLivingIndex.put("Houston, TX", 102.2);
        costOfLivingIndex.put("Dallas, TX", 106.0);
        costOfLivingIndex.put("Austin, TX", 118.6);
        costOfLivingIndex.put("San Antonio, TX", 97.0);
        costOfLivingIndex.put("Fort Worth, TX", 103.0);
        costOfLivingIndex.put("El Paso, TX", 88.7);
        costOfLivingIndex.put("Arlington, TX", 101.5);
        costOfLivingIndex.put("Corpus Christi, TX", 91.8);
        costOfLivingIndex.put("Plano, TX", 111.3);
        costOfLivingIndex.put("Lubbock, TX", 89.4);

        // Utah
        costOfLivingIndex.put("Salt Lake City, UT", 111.5);
        costOfLivingIndex.put("West Valley City, UT", 105.2);
        costOfLivingIndex.put("Provo, UT", 108.7);
        costOfLivingIndex.put("West Jordan, UT", 106.5);
        costOfLivingIndex.put("Orem, UT", 107.0);
        costOfLivingIndex.put("Sandy, UT", 113.2);
        costOfLivingIndex.put("Ogden, UT", 102.4);
        costOfLivingIndex.put("St. George, UT", 105.8);
        costOfLivingIndex.put("Layton, UT", 106.7);
        costOfLivingIndex.put("South Jordan, UT", 115.3);

        // Vermont
        costOfLivingIndex.put("Burlington, VT", 118.0);
        costOfLivingIndex.put("South Burlington, VT", 115.5);
        costOfLivingIndex.put("Rutland, VT", 100.5);
        costOfLivingIndex.put("Barre, VT", 94.7);
        costOfLivingIndex.put("Montpelier, VT", 101.0);
        costOfLivingIndex.put("Essex Junction, VT", 114.2);
        costOfLivingIndex.put("Bennington, VT", 98.3);
        costOfLivingIndex.put("Brattleboro, VT", 103.7);
        costOfLivingIndex.put("Milton, VT", 111.8);
        costOfLivingIndex.put("St. Albans, VT", 99.5);

        // Virginia
        costOfLivingIndex.put("Virginia Beach, VA", 109.0);
        costOfLivingIndex.put("Norfolk, VA", 105.5);
        costOfLivingIndex.put("Chesapeake, VA", 104.7);
        costOfLivingIndex.put("Richmond, VA", 100.3);
        costOfLivingIndex.put("Newport News, VA", 98.5);
        costOfLivingIndex.put("Alexandria, VA", 156.8);
        costOfLivingIndex.put("Hampton, VA", 97.4);
        costOfLivingIndex.put("Roanoke, VA", 92.7);
        costOfLivingIndex.put("Portsmouth, VA", 96.8);
        costOfLivingIndex.put("Suffolk, VA", 102.1);

        // Washington
        costOfLivingIndex.put("Seattle, WA", 162.7);
        costOfLivingIndex.put("Spokane, WA", 103.4);
        costOfLivingIndex.put("Tacoma, WA", 118.5);
        costOfLivingIndex.put("Vancouver, WA", 116.7);
        costOfLivingIndex.put("Bellevue, WA", 185.2);
        costOfLivingIndex.put("Kent, WA", 127.6);
        costOfLivingIndex.put("Everett, WA", 125.3);
        costOfLivingIndex.put("Renton, WA", 135.4);
        costOfLivingIndex.put("Spokane Valley, WA", 101.8);
        costOfLivingIndex.put("Federal Way, WA", 122.7);

        // West Virginia
        costOfLivingIndex.put("Charleston, WV", 92.0);
        costOfLivingIndex.put("Huntington, WV", 90.3);
        costOfLivingIndex.put("Morgantown, WV", 97.0);
        costOfLivingIndex.put("Parkersburg, WV", 90.6);
        costOfLivingIndex.put("Wheeling, WV", 91.5);
        costOfLivingIndex.put("Weirton, WV", 86.7);
        costOfLivingIndex.put("Fairmont, WV", 88.9);
        costOfLivingIndex.put("Martinsburg, WV", 95.2);
        costOfLivingIndex.put("Beckley, WV", 87.3);
        costOfLivingIndex.put("Clarksburg, WV", 86.8);

        // Wisconsin
        costOfLivingIndex.put("Milwaukee, WI", 97.5);
        costOfLivingIndex.put("Madison, WI", 110.0);
        costOfLivingIndex.put("Green Bay, WI", 92.5);
        costOfLivingIndex.put("Kenosha, WI", 98.3);
        costOfLivingIndex.put("Racine, WI", 95.2);
        costOfLivingIndex.put("Appleton, WI", 93.7);
        costOfLivingIndex.put("Waukesha, WI", 103.5);
        costOfLivingIndex.put("Oshkosh, WI", 90.8);
        costOfLivingIndex.put("Eau Claire, WI", 94.6);
        costOfLivingIndex.put("Janesville, WI", 91.3);

        // Wyoming
        costOfLivingIndex.put("Cheyenne, WY", 98.8);
        costOfLivingIndex.put("Casper, WY", 96.0);
        costOfLivingIndex.put("Laramie, WY", 97.2);
        costOfLivingIndex.put("Gillette, WY", 95.5);
        costOfLivingIndex.put("Rock Springs, WY", 94.3);
        costOfLivingIndex.put("Sheridan, WY", 99.7);
        costOfLivingIndex.put("Green River, WY", 93.8);
        costOfLivingIndex.put("Evanston, WY", 92.9);
        costOfLivingIndex.put("Riverton, WY", 91.5);
        costOfLivingIndex.put("Jackson, WY", 176.5);

        // International Cities with Abbreviations
        costOfLivingIndex.put("Singapore, SG", 114.0);
        costOfLivingIndex.put("Sydney, AU", 123.2);
        costOfLivingIndex.put("Luxembourg, LU", 113.0);
        costOfLivingIndex.put("Amsterdam, NL", 120.8);
        costOfLivingIndex.put("Hong Kong, CN", 140.7);
        costOfLivingIndex.put("Toronto, CA", 119.0);
        costOfLivingIndex.put("Vancouver, CA", 126.0);
        costOfLivingIndex.put("Tokyo, JP", 140.0);
        costOfLivingIndex.put("London, UK", 151.0);
        costOfLivingIndex.put("Paris, FR", 140.0);
        costOfLivingIndex.put("Berlin, DE", 110.0);
        costOfLivingIndex.put("Zurich, CH", 150.0);
        costOfLivingIndex.put("Geneva, CH", 149.0);
        costOfLivingIndex.put("Brussels, BE", 120.0);
        costOfLivingIndex.put("Rome, IT", 105.0);
        costOfLivingIndex.put("Madrid, ES", 95.0);
        costOfLivingIndex.put("Dubai, AE", 132.0);
        costOfLivingIndex.put("Copenhagen, DK", 142.0);
        costOfLivingIndex.put("Stockholm, SE", 133.0);
        costOfLivingIndex.put("Oslo, NO", 150.0);
        costOfLivingIndex.put("Helsinki, FI", 127.0);
        costOfLivingIndex.put("Vienna, AT", 120.0);
        costOfLivingIndex.put("Dublin, IE", 138.0);
        costOfLivingIndex.put("Auckland, NZ", 130.0);
        costOfLivingIndex.put("Melbourne, AU", 135.0);
        costOfLivingIndex.put("Buenos Aires, AR", 70.0);
        costOfLivingIndex.put("Mexico City, MX", 80.0);
        costOfLivingIndex.put("Santiago, CL", 75.0);
        costOfLivingIndex.put("São Paulo, BR", 85.0);
        costOfLivingIndex.put("Lima, PE", 77.0);
        costOfLivingIndex.put("Jakarta, ID", 60.0);
        costOfLivingIndex.put("Bangkok, TH", 67.0);
        costOfLivingIndex.put("Seoul, KR", 105.0);
        costOfLivingIndex.put("Kuala Lumpur, MY", 65.0);
        costOfLivingIndex.put("Beijing, CN", 110.0);
        costOfLivingIndex.put("Shanghai, CN", 120.0);
        costOfLivingIndex.put("Mumbai, IN", 55.0);
        costOfLivingIndex.put("New Delhi, IN", 60.0);
        costOfLivingIndex.put("Cape Town, ZA", 80.0);
        costOfLivingIndex.put("Nairobi, KE", 75.0);
    }

    public static HashMap<String, Double> getCostOfLivingIndex() {
        return costOfLivingIndex;
    }
}