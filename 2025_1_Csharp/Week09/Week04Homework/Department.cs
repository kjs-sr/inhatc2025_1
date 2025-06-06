﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week04Homework
{
    //Object 클래스를 상속한 Department
    class Department : object
    {

        //인스턴스 필드
        private string _code;
        private string _name;

        //속성, Property
        //getter+setter 한꺼번에 구현
        //정의: 메소드와 흡사
        //사용: 변수와 유사
        public string Code
        {
            get { return _code; }
            private set
            {
                if (false == string.IsNullOrEmpty(value)) {
                    _code = value;
                }
            }
        }
        public string Name
        {
            get { return _name; }
            private set
            {
                if (false == string.IsNullOrEmpty(value) && value.Length >= 2)
                {
                    _name = value;
                }
            }
        }

        //getter
        public string GetCode()
        {
            return _code;
        }
        //setter
        private void SetCode(string value)
        {
            if(false == string.IsNullOrEmpty(value)) {
                _code = value;
            }
        }

        //인스턴스 메소드
        public override string ToString()
        {
            return $"[{Code}] {Name}";
        }

        //생성자, constructor
        //특수 메소드
        //반환타입 x, 클래스 이름과 동일해야 함.

        //기본(default) 생성자
        //컴파일러가 만들어 준다.
        //단, 하나라도 사용자가 만든 생성자가 있으면 만들지 않는다.
        //public Department()
        //{
        //}

        public Department(string code, string name)
        {
            _code = code;
            _name = name;
        }

        //메소드 오버로딩
        //동일한 메소드 이름을 만들 수 있음.
        //방법 : 매개변수를 다르게(개수, 형) 하면 됨.
    }
}
