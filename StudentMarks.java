package com.jap.oops;

public class StudentMarks {

    /* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths) {

		int result=-1;

		result=physics+chemistry+maths;

        return result;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {

        int result=-1;

		result=physics+chemistry+maths+bio;

        return result;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {

		double result=-1.0;

		result=physics+chemistry+maths+bio;

        return result;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {

        float result=-1;

		result=maths+bio+physics+chemistry+lang;

        return result;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {

        float result=-1;

		result=maths+bio+physics+chemistry;

        return result;

    }

}
