import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class ShapeDemo
{
    public static double totalArea( Shape [ ] arr )
    {
        double total = 0;
        
        for( Shape s : arr )
            if( s != null )
                total += s.area( );
        
        return total;
    }

    public static double totalArea( java.util.List<? extends Shape> arr )
    {
        double total = 0;
        
        for( Shape s : arr )
            if( s != null )
                total += s.area( );
        
        return total;
    }
    
    public static double totalSemiperimeter( Shape [ ] arr )
    {
        double total = 0;
        
        for( Shape s : arr )
            if( s != null )
                total += s.semiperimeter( );
        
        return total;
    }
    
    public static void printAll( Shape [ ] arr )
    {
        for( Shape s : arr )
            System.out.println( s );
    }
    
    public static void main( String [ ] args )
    {
        Shape [ ] a = { new Circle( 2 ), new Rectangle( 1.0, 3.0 ),
                        new Circle(0.5), new Circle(0.5), new Rectangle(2.3, 9.8)};
        
        if (a[0].compareTo(a[1]) <= 0 && a[0].compareTo(a[2]) <= 0) {
        	if (a[1].compareTo(a[2]) <= 0) {
        		System.out.println("L to H: " + a[0].area() + ", " + a[1].area() + ", " + a[2].area());
        	}
        	else 
        		System.out.println("L to H: " + a[0].area() + ", " + a[2].area() + ", " + a[1].area());
        }
        
        else if (a[1].compareTo(a[0]) <= 0 && a[1].compareTo(a[2]) <= 0) {
        	if (a[0].compareTo(a[2]) <= 0)
        		System.out.println("L to H: " + a[1].area() + ", " + a[0].area() + ", " + a[2].area());
        	else 
        		System.out.println("L to H: " + a[1].area() + ", " + a[2].area() + ", " + a[0].area());
        }
        
        else if (a[2].compareTo(a[0]) <= 0 && a[2].compareTo(a[1]) <= 0) {
        	if (a[0].compareTo(a[1]) <= 0)
        		System.out.println("L to H: " + a[2].area() + ", " + a[0].area() + ", " + a[1].area());
        	else 
        		System.out.println("L to H: " + a[2].area() + ", " + a[1].area() + ", " + a[0].area());
        }
        
        Set<Double> area = new TreeSet<Double>();
        for (int i = 0; i < a.length; i++) {
        	area.add(a[i].area());
        }
        
        Iterator<Double> CR= area.iterator();
        while(CR.hasNext()) {
        	System.out.println(CR.next() + " ");
        }
        
        
        System.out.println( "Total area = " + totalArea( a ) );
        System.out.println( "Total semiperimeter = " + totalSemiperimeter( a ) );
        
        java.util.List<Circle> lst = new java.util.ArrayList<Circle>( );
        lst.add( new Circle( 2.0 ) );
        lst.add( new Circle( 1.0 ) );
        System.out.println( "Total area = " + totalArea( lst ) );
        
        printAll( a );
    }
}
