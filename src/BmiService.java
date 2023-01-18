public class BmiService {
    float index;
    public float calculate (float height, float mass){
        index= mass/(height*height);
        return index;
    }
}
