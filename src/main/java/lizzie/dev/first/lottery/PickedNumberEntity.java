package lizzie.dev.first.lottery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PickedNumberEntity {
    public PickedNumberEntity(int indexNum, int no1, int no2, int no3, int no4, int no5, int no6) {
        this. indexNum = indexNum;
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;
        this.no4 = no4;
        this.no5 = no5;
        this.no6 = no6;
    }
    int indexNum;
    int no1;
    int no2;
    int no3;
    int no4;
    int no5;
    int no6;
}
