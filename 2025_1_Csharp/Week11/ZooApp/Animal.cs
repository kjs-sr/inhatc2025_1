using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ZooApp
{
    abstract class Animal
    {
        private string _name;
        protected int _level;
        protected COLOR _color;

        public string Name { get { return _name; } }
        public COLOR Color { get { return _color; } }
        public int Level { get { return _level; } }

        public Animal(String name, COLOR color)
        {
            _name = name;
            _color = color;
        }

        public override string ToString()
        {
            return $"ANIMAL:{_name}";
        }

        public virtual void Eat() { AddLevel(3); }
        public void Play() { AddLevel(2); }

        abstract protected bool AddLevel(int level);
        //{
        //    if (_level + _level <= 100)
        //    {
        //        _level += level;
        //        return true;
        //    }
        //    else
        //    {
        //        _level = 100;
        //        return false;
        //    }
        //}
    }
}
