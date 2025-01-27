package comparation;

import java.util.Comparator;


class Namecomparator implements Comparator<Students> {

        @Override
        public int compare(Students st1, Students st2) {
            return st1.name.compareTo(st2.name);
        }
    }

class Salarycomparator implements Comparator<Students> {

        @Override
        public int compare(Students st1, Students st2) {
            return st1.salary.compareTo(st2.salary);
        }
    }

