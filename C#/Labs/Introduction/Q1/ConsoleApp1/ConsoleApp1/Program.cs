using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        public static void Main(string[] args)
        {

            //Student stu = new Student("Sam", "Prog", 10, 2, "turntabl", new double[] { 5.0, 5.0, 5.0, 5.0});
            //stu.setRating();
            //Console.WriteLine(stu.Rating);
            //Console.ReadLine();
            //string[] names = { "sam", "Adei", "Vic" };
            //int[] energyLevel = { 90, 90 , 50 };

            //int numberOfStudents = int.Parse(args[0]);

            //Student[] studentlist = new Student[numberOfStudents];

            ///*Student p = new Student("sam", 90);
            //p.attendLecture();*/

            //for (int i = 0; i < numberOfStudents; i++)
            //{
            //    studentlist[i] = new Student(names[i], energyLevel[i]);
            //}

            //foreach (Student stdlist in studentlist)
            //{
            //    Console.WriteLine(stdlist.getDetails());
            //    Console.ReadLine();
            //}


            //Stopwatch stopwatch = new Stopwatch();
            //stopwatch.Start();

            //int result = Timer.Calculator.calculate(1, 2, 3, 4, 10, 20);
            //Console.WriteLine(result);

            //stopwatch.Stop();

            //TimeSpan ts = stopwatch.Elapsed;

            //String elapsedTime = String.Format("{0:00}:{1:00}:{2:00}:{3:00}",
            //       ts.Hours, ts.Minutes, ts.Seconds,
            //    ts.Milliseconds / 10);
            //Console.WriteLine(elapsedTime.ToString());
            //Console.ReadLine();
            Timer calc = new Timer("sfe");
            Console.Error.WriteLine(calc.Dispose(1, 2, 3, 4, 10, 20));
        }
    }
    }
}
