/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package maidiukv2;

import Maidiukv2.*;
import java.io.IOException;
import java.util.List;

public interface IHuricane {
    List<Huricane> loadData(String filePath) throws IOException;
    void yearRange(List<Huricane> hurricanes, int start, int end) throws IOException;
    void sortedBySpeed(List<Huricane> hurricanes) throws IOException;
    void listCatAndSpeed(List<Huricane> hurricanes, String name) throws IOException;
    void saveYearlyH(List<Huricane> hurricanes, String filePath) throws IOException;
    void saveYearlyHurricaneCountData(List<Huricane> hurricanes, String filename) throws IOException;
}

