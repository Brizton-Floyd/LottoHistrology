package utilities;

import model.lottogamemodels.DrawResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LottoURLProcessor extends URLProcessorBase {

    @Override
    protected List<DrawResult> processURLData(InputStream input) throws IOException {

        List<DrawResult> results = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))){

            String line;
            while ((line = reader.readLine()) != null){
                DrawResult result = new DrawResult();
                DrawResult.formatDrawData(line, result);
                results.add(result);

                //Cash Five,2,16,2019,31,18,13,11,30
                System.out.println(line);
            }
        }

        DrawResult.drawNumberCount = 0;
        return results;
    }
}
