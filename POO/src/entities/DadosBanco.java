package entities;

public class DadosBanco {

	private int accountNumber;
	private String name;
	private double initialDeposit;
	
	public DadosBanco(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.initialDeposit = initialDeposit;
	}
	
	 public DadosBanco(int accountNumber, String name) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.initialDeposit = 0.0;
	    }
	  
	    public DadosBanco() {
	        this.accountNumber = 0;
	        this.name = "Sem nome";
	        this.initialDeposit = 0.0;
	    }

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getInitialDeposit() {
			return initialDeposit;
		}

		public void setInitialDeposit(double initialDeposit) {
			this.initialDeposit = initialDeposit;
		}
		
		 public void updateBalance(double value) {
		        this.initialDeposit += value;
		    }
		 
		 public void withdraw (double tax) {
			 this.initialDeposit -= tax + 5;
		 }

		
	}

