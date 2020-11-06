using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Student:Person
    {
        private string preferredSubject;
        private string school;
        private double[] grades;

        public string Name { get => base.name; set => base.name = value; }
        public int EnergyLevel { get => base.energyLevel; set => base.energyLevel = value; }
        public int CaffeineCapacity { get => base.caffeineCapacity; set => base.caffeineCapacity = value; }
        public string School { get => school; set => school = value; }
        public string PreferredSubject { get => preferredSubject; set => preferredSubject = value; }
        public double[] Grades { get => grades; set => grades = value; }
        public double Rating { get => base.rating;}
        public void setRating()
        {
            double sum = 0;
            foreach (double grade in grades)
            {
                sum += grade;
            }
            base.rating = sum / grades.Length;

        }

        public Student(string name, string preferredSubject_, int energyLevel_, int caffeineCapacity_, string school_, double[] grades_)
        {
            base.name = name;
            preferredSubject = preferredSubject_;
            base.energyLevel = energyLevel_;
            base.caffeineCapacity = caffeineCapacity_;
            school = school_;
            grades = grades_;
        }

    //    public void attendLecture()
    //    {
    //        Console.WriteLine("Hey" + this.name + " man wossoop");
    //        Console.ReadLine();
    //    }

    //    public string getDetails()
    //    {
    //        return "name: " + this.name + "\n Energy Level: " + this.energyLevel;
    //    }
    }
}
