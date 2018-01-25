package Observer;

import Elements.Element;
import Observer.Observer;

abstract class SubjectElement implements Element{
	
	public void attach(Observer obs){
		observer.add(obs);
	}
	
	public void detach(Observer obs){
		observer.remove(obs);
	}
	
	public void notify2(){
		observer.forEach(Observer::update);
	}

public find List<Observer> observer= new ArrayList<>();

}






}