package controller;

import database.StudentDao;
import model.Absences;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class ControllerStudent {


    public ControllerStudent(){};

    public List<Absences> loadAbsences(int id) {

        List<Absences> result = new ArrayList<>();

        result = StudentDao.getMyAssenze(id);


        return result;

    }

    public boolean verifyPin(String pin,int id) {

        String real_pin = StudentDao.getPin(id);
        return pin.equals(real_pin);

    }

    public int manageAbsence(Absences a) {

        a.setCheckbit(0);
         return StudentDao.updateAbsence(a);

    }
}
