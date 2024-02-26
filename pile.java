
public class Pile {
		int taille;
		int tabP[];
		int sommet;
		/***
		* Constructueur non paramétrique 
		 */
		Pile (){
			this.taille = 10;
			this.tabP = new int[taille];
			this.sommet = -1;
		}

		/***
		* Constructueur paramétrique 
		*@param pfTaille int taille de la pile 
		 */
		Pile (int pfTaille) {
			this.taille = pfTaille;
			this.tabP = new int[taille];
			this.sommet = -1;
		}
		
		
		//------------------------------------------------------------------
		/***
		* Méthode permettant la créaation d'une pile 
		 */
		public static Pile CreerPile(int i) {
			Pile MaPile = new Pile(i);
			return MaPile;
		}
		
		//------------------------------------------------------------------
		/***
		* Méthode permettant de verifier si la pile est vide
		 */
		public boolean est_vide() {
			if (this.sommet == -1) {
				return true;
			}
			return false;
		}
		
		//------------------------------------------------------------------
		/***
		* Méthode permettant d'empiler un élément dans la pile 
		*@param i int élément à ajouter 
		*/
		public void empiler(int i)  throws Exception{
			this.tabP[this.sommet+1] = i;
			this.sommet += 1;
			
			
		}
		
		//------------------------------------------------------------------

		/***
		* Méthode permettant de depiler un élément dans la pile 
		* 
		*/
		public int depiler()  throws Exception {	
			int res = this.tabP[sommet];
			this.sommet -= 1;
			
			return res;
		}

		/***
		* Méthode permettant de retourner la valeure au sommet de la pile 
		*/
		public int Sommet() {
			return this.tabP[this.sommet];
		
		}
		
		/***
		* Méthode permettant vider la pile 
		*/
		public void Vider() {
			this.sommet = -1;
		}

	
}
