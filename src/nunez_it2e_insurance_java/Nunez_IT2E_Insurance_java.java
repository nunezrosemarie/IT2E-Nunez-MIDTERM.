
package nunez_it2e_insurance_java;


public class Nunez_IT2E_Insurance_java {

   
    public static void main(String[] args) {
    
class Insurance {
    // Attributes of the insurance policy
   
     private String policyHolder;
    private String policyNumber;
    private double premiumAmount;
    private String insuranceType;

    // Constructor
    public Insurance(String policyHolder, String policyNumber, double premiumAmount, String insuranceType) {
        this.policyHolder = policyHolder;
        this.policyNumber = policyNumber;
        this.premiumAmount = premiumAmount;
        this.insuranceType = insuranceType;
        
    }

    // Method to display policy details
    public void displayPolicyDetails() {
        System.out.println("Policy Holder: " + policyHolder);
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium Amount: $" + premiumAmount);
        System.out.println("Insurance Type: " + insuranceType);
        System.out.println("-----------------------------");
    }
}

  
        // Creating instances of Insurance class
        Insurance carInsurance = new Insurance("rose marie", "C123456", 500.0, "Car Insurance");
        Insurance healthInsurance = new Insurance("nunez", "H789012", 1200.0, "Health Insurance");

        // Displaying policy details
        carInsurance.displayPolicyDetails();
        healthInsurance.displayPolicyDetails();
    }
}


   private int id;
    private String policyHolder;
    private String policyType;
    private double premium;

    public Insurance(int id, String policyHolder, String policyType, double premium) {
        this.id = id;
        this.policyHolder = policyHolder;
        this.policyType = policyType;
        this.premium = premium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "id=" + id +
                ", policyHolder='" + policyHolder + '\'' +
                ", policyType='" + policyType + '\'' +
                ", premium=" + premium +
                '}';
    }
}