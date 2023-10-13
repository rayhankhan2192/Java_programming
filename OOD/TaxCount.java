public interface TaxCount {
  double totalTax();

  default double countTax(double salary) {
    if (salary > 55000 && salary <= 70000) {
      return (salary - 55000) * 0.05;
    }
    if (salary > 70000 && salary <= 90000) {

      return ((salary - 70000) * 0.1) + (15000*0.05);
    }
    if (salary > 90000) {

      return ((salary - 90000) * 0.02) + (15000*0.05) + (20000*0.1);
    }
    return 0;
  }
}