package ren.solid.ganhuoio.api;

import ren.solid.ganhuoio.bean.RandomPicture;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by _SOLID
 * Date:2016/7/28
 * Time:17:06
 */
public interface PictureService {
    String BASE_URL = "http://lelouchcrgallery.tk/";

    @GET("rand")
    Observable<RandomPicture> getRandomPicture();
}
