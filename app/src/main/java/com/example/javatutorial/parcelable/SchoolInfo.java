package com.example.javatutorial.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class SchoolInfo implements Parcelable {
    private String schoolName;
    private String schoolAddress;
    private int schoolId = 0;
    private StudentInfo studentInfo;

    public SchoolInfo(String schoolName, String schoolAddress, StudentInfo studentInfo) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.studentInfo = studentInfo;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }
    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    protected SchoolInfo(Parcel in) {
        schoolName = in.readString();
        schoolId = in.readInt();
        schoolAddress = in.readString();
        studentInfo = in.readParcelable(StudentInfo.class.getClassLoader());
    }

    public static final Creator<SchoolInfo> CREATOR = new Creator<SchoolInfo>() {
        @Override
        public SchoolInfo createFromParcel(Parcel in) {
            return new SchoolInfo(in);
        }

        @Override
        public SchoolInfo[] newArray(int size) {
            return new SchoolInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(schoolName);
        dest.writeInt(schoolId);
        dest.writeString(schoolAddress);
        dest.writeParcelable(studentInfo, flags);
    }
}
