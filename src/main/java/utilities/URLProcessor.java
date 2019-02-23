package utilities;

import java.io.IOException;
import java.net.URL;

public interface URLProcessor<T> {

    T process(URL url) throws IOException;
}
