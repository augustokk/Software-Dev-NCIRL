public class Salary{
	private int monthlyWage;
	private int weeklyHours;
	private int annualSalary;
	private double hourlyRate;


	Salary(){
		monthlyWage = 1200;
		weeklyHours = 24;
	}

	Salary(int monthlyWage, int weeklyHours){
		this.monthlyWage = monthlyWage;
		this.weeklyHours = weeklyHours;
	}

	// setters
	public void setMonthlyWage(int monthlyWage){
		this.monthlyWage = monthlyWage;
	}

	public void setWeeklyHours(int weeklyHours){
		this.weeklyHours = weeklyHours;
	}

	// compute
	public void computeAnnualSalary(){
		// 12 months in a year so we mulitply monthly wage by 12
		annualSalary = monthlyWage * 12;

		if(annualSalary < 20000){
			System.out.println("Tough livable salary:" + annualSalary);
		}
		else if(annualSalary > 100000){
			System.out.println("Wow, rich guy:" + annualSalary);
		}
		else{
			System.out.println("Probably gets by: " + annualSalary);
		}

	}

	public void computeHourlyRate(){
		// divide by 52 and then divide by the hours
		// we're assuming there are 52 weeks in a year
		// so we get the weekly wage by diving the annual salary by 52
		// further divide the weekly wage by the weekly hours
		// we can refactor this by multiplying the weekly hours by 52
		// then dividing that into the annual salary
		hourlyRate = (double)annualSalary / (double)(52 * weeklyHours);
	}

	// getters
	public int getAnnualSalary(){
		return annualSalary;
	}

	public double getHourlyRate(){
		return hourlyRate;
	}



}