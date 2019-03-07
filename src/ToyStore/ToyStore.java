package ToyStore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{   

            String str[] = toys.split(" ");
            ArrayList<String> ta = new ArrayList<String>();
            boolean exist = false;
            //ta = Arrays.asList(str);
            for (int k=0;k<str.length;k++)
                ta.add(str[k]);            
            for (int i=0;i<ta.size();i++){
                for (int n=0;n<toyList.size();n++){
                    if( ta.get(i).equals(toyList.get(n).getName())){
                        toyList.get(n).setCount(toyList.get(n).getCount()+1);
                        exist=true;
                    }
                }
                if (!exist)
                toyList.add(new Toy(ta.get(i),1));
                exist=false;
            }
        }
                
              
	
  
  	public Toy getThatToy( String nm )
  	{
            for (Toy toyList1 : toyList) {
                if (nm.equals(toyList1.getName())) {
                    return toyList1;
                }
            }
  	return null;
  	}
  
  	public String getMostFrequentToy()
  	{
            Toy temp;
            ArrayList<Toy> tempA= toyList;
            for (int i=1; i<tempA.size(); i++)
                if(tempA.get(i).getCount()>tempA.get(i-1).getCount()){
                temp = tempA.get(i);
                tempA.set(i,tempA.get(i-1));
                tempA.set(i-1,temp);
                }
            return tempA.get(0).toString();
  	}  
  
  	public void sortToysByCount()
  	{   
            Toy temp;
            for (int i=1; i<toyList.size(); i++)
                if(toyList.get(i).getCount()>toyList.get(i-1).getCount()){
                temp = toyList.get(i);
                toyList.set(i,toyList.get(i-1));
                toyList.set(i-1,temp);
                }
                
  	}  
  	  
	public String toString()
	{
           String ans = "";
            for (Toy i : toyList) 
                ans+=i.toString()+" "; 
            return ans;
        }
	
}