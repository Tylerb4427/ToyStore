package ToyStore;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
        ToyStore store= new ToyStore();
        store.loadToys("Bat Sorry Sorry Sorry Bat Baseball Ball");
        store.loadToys("Sorry Bat Ball");
        System.out.println(store.toString());
        System.out.println(store.getThatToy("Baseball").toString());
        System.out.println(store.getMostFrequentToy());
        store.sortToysByCount();
        System.out.println(store.toString());
	}
}