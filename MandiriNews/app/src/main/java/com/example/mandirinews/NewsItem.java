package com.example.mandirinews;

public class NewsItem {
    private String title;
    private String description;
    // Tambahkan getter-setter
}

public interface NewsApiService {
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(
            @Query("a74ff1f7cbaf472f86e33556cada5f3b") String apiKey,
            @Query("country") String country,
            @Query("pageSize") int pageSize,
            @Query("page") int page
    );
}

