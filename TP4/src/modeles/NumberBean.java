package modeles;

public class NumberBean {
private int nb;

public NumberBean(){
setNb(0);	
}

public int getNb() {
	return nb;
}

public void setNb(int nb) {
	this.nb = nb;
}
public double getrandom(int x){
	return Math.random();
}
}
