package utilities;

import model.lottogamemodels.DrawResult;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public abstract class URLProcessorBase implements URLProcessor<List<DrawResult>>{

    @Override
    public List<DrawResult> process(URL url) throws IOException {

        URLConnection urlConnection = url.openConnection();

        try (InputStream input = urlConnection.getInputStream()) {
            return  processURLData(input);
        }

    }

    protected abstract List<DrawResult> processURLData(InputStream inputStream) throws IOException;
}
