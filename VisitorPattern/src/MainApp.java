import com.visitor.businesslogic.TaxVisitor;
import com.visitor.interfaces.Visitor;
import com.visitor.pojo.Liquor;
import com.visitor.pojo.Necessity;
import com.visitor.pojo.Tobacco;

public class MainApp {
	public static void main(String[] args) {		
		Visitor visitor = new TaxVisitor();
		
		Liquor liquor = new Liquor(35);
		Tobacco tobacco = new Tobacco(12.65);
		Necessity necessity = new Necessity(65.25);
		
		System.out.println("Tax on tobacco: $"+ tobacco.accept(visitor));
		System.out.println("Tax on liquor: $"+ liquor.accept(visitor));
		System.out.println("Tax on necessities: $"+ necessity.accept(visitor));		
	}
}
