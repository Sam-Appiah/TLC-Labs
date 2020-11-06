using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace ConsoleApp1
{
    public class Timer: IDisposable
    {
        Component 
        public void Dispose()
        {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.Start();

            int calculate(params Int32[] num)
            {
                int sum = 0;
                foreach (var i in num)
                {
                    sum += i;
                }
                return sum;
            }
            stopwatch.Stop();

            TimeSpan ts = stopwatch.Elapsed;

            String elapsedTime = String.Format("{0:00}:{1:00}:{2:00}:{3:00}",
                   ts.Hours, ts.Minutes, ts.Seconds,
                ts.Milliseconds / 10);
            Console.Error.WriteLine(elapsedTime.ToString());
            Console.ReadLine();
        }

        public Timer(string time)
        {
            Component.Dispose();
        }

    }

}