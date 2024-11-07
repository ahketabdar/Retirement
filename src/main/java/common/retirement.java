package common;

import java.util.Date;

public class retirement {

	public int id;
	public int loanAmount;
	public int prize;
	public int pop;
	public String name;
	public String family;
	public Date dor;
	public int pass;
	public boolean shiraz;
	public Date dof;
	public boolean kish;
	public Date dok;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public Date getDor() {
		return dor;
	}
	public void setDor(Date dor) {
		this.dor = dor;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public boolean isShiraz() {
		return shiraz;
	}
	public void setShiraz(boolean shiraz) {
		this.shiraz = shiraz;
	}
	public Date getDof() {
		return dof;
	}
	public void setDof(Date dof) {
		this.dof = dof;
	}
	public boolean isKish() {
		return kish;
	}
	public void setKish(boolean kish) {
		this.kish = kish;
	}
	public Date getDok() {
		return dok;
	}
	public void setDok(Date dok) {
		this.dok = dok;
	}
	
	
	@Override
	public String toString() {
		return "retirement [id=" + id + ", loanAmount=" + loanAmount + ", prize=" + prize + ", pop=" + pop + ", name="
				+ name + ", family=" + family + ", dor=" + dor + ", pass=" + pass + ", shiraz=" + shiraz + ", dof="
				+ dof + ", kish=" + kish + ", dok=" + dok + "]";
	}
	
	
	
}
