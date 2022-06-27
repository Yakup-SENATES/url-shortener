package dev.jacop.shortened.Service;

import dev.jacop.shortened.Model.Url;
import dev.jacop.shortened.Model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {

    public Url generateShortLink(UrlDto urlDto);
    public  Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);
}
