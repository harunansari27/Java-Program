public class RectangleArea {

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int area1 = (ax2 - ax1 ) * (ay2 -ay1) ; //6*4 =  24
        int area2 = (bx2 - bx1 ) * (by2 -by1) ; 

        int overlapWidth = Math.max(0, Math.min(ax2 , bx2)- Math.max(ax1, bx1)) ;
        int overlapHeight = Math.max(0, Math.min(ay2 , by2)- Math.max(ay1, by1)) ;
        int overlapArea = overlapWidth * overlapHeight ;

        return area1  + area2 - overlapArea ;
    }
    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea();
        int result = ra.computeArea(-3,0,3,4,0,-1,9,2);
        System.out.println("Total Area: " + result); // Output: 45
        
    }
}
