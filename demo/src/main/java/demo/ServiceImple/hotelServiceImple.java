package demo.ServiceImple;

import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jsoup.Jsoup;

import demo.Model.hotel;

public class hotelServiceImple{
    
    ArrayList<hotel> retrieveHotelData() {
        ArrayList<hotel> hotelDataList = new ArrayList<>();
    
        try {
            // retrieving the desired web page
            Document webPage = Jsoup
                .connect("https://www.booking.com/hotel/in/venus-international.en-gb.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaGyIAQGYAQm4ARnIAQzYAQHoAQH4AQuIAgGoAgO4As-H85sGwAIB0gIkZDFhZjUyNDUtMjVjYS00NGI5LWE4MzMtM2Q2YTNiOWNmNjkw2AIG4AIB&sid=3a261a171a1821b4a13fc41a1d566b16&all_sr_blocks=26603638_287856319_2_41_0;checkin=2022-11-25;checkout=2022-11-26;dest_id=-2106102;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;highlighted_blocks=26603638_287856319_2_41_0;hpos=2;matching_block_id=26603638_287856319_2_41_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=26603638_287856319_2_41_0__170910;srepoch=1669120991;srpvid=3492596f0e76016c;type=total;ucfs=1&#hotelTmpl")
                .get();
    
            Element tableRows = doc.getElementbyId("d2fee87262 pp-header__title");

}
