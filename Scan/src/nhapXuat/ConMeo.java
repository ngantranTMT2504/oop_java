package nhapXuat;


class DongVat {
	private String ten;
	private String mauMat;
	
	protected void TiengKeu() {
		System.out.println("Chuan bi keu");
	}
}

public class ConMeo extends DongVat {
	private String tiengKeu = "MeoMeo";
	private boolean isCam = false;
	

	public ConMeo(boolean isCam) {
		this.isCam = isCam;
	}
	
	
	public void TiengKeu() {
		super.TiengKeu();
		if (!isCam) {
			System.out.println(tiengKeu);			
		} else {
			System.out.println("TOi Bi Cam cmnr");
		}
	}
	
	public void SetTiengKeu(String tiengKeu) {// vi pham tinh dong goi
		this.tiengKeu = tiengKeu;
	}
	
	public static void main(String[] args) {
		int son = 10;
		DongVat a = new ConMeo(false);
		a.TiengKeu(); 
		DongVat b = new ConMeo(false);
		b.TiengKeu(); 
		DongVat meoCam = new ConMeo(true);
		meoCam.TiengKeu(); 
	};
}

