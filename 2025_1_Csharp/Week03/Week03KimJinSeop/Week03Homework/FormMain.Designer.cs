﻿namespace Week03Homework
{
    partial class FormMain
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblExpression = new System.Windows.Forms.Label();
            this.lblNumbers = new System.Windows.Forms.Label();
            this.btnNum7 = new System.Windows.Forms.Button();
            this.btnNum8 = new System.Windows.Forms.Button();
            this.btnNum9 = new System.Windows.Forms.Button();
            this.btnDiv = new System.Windows.Forms.Button();
            this.btnNum4 = new System.Windows.Forms.Button();
            this.btnNum5 = new System.Windows.Forms.Button();
            this.btnNum6 = new System.Windows.Forms.Button();
            this.btnMul = new System.Windows.Forms.Button();
            this.btnNum1 = new System.Windows.Forms.Button();
            this.btnNum2 = new System.Windows.Forms.Button();
            this.btnNum3 = new System.Windows.Forms.Button();
            this.btnSub = new System.Windows.Forms.Button();
            this.btnNum0 = new System.Windows.Forms.Button();
            this.btnCal = new System.Windows.Forms.Button();
            this.btnAdd = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblExpression
            // 
            this.lblExpression.Location = new System.Drawing.Point(13, 9);
            this.lblExpression.Name = "lblExpression";
            this.lblExpression.Size = new System.Drawing.Size(255, 27);
            this.lblExpression.TabIndex = 0;
            // 
            // lblNumbers
            // 
            this.lblNumbers.BackColor = System.Drawing.Color.White;
            this.lblNumbers.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblNumbers.Location = new System.Drawing.Point(15, 43);
            this.lblNumbers.Name = "lblNumbers";
            this.lblNumbers.Size = new System.Drawing.Size(253, 40);
            this.lblNumbers.TabIndex = 1;
            // 
            // btnNum7
            // 
            this.btnNum7.Location = new System.Drawing.Point(15, 99);
            this.btnNum7.Name = "btnNum7";
            this.btnNum7.Size = new System.Drawing.Size(55, 43);
            this.btnNum7.TabIndex = 2;
            this.btnNum7.Text = "7";
            this.btnNum7.UseVisualStyleBackColor = true;
            this.btnNum7.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum8
            // 
            this.btnNum8.Location = new System.Drawing.Point(81, 99);
            this.btnNum8.Name = "btnNum8";
            this.btnNum8.Size = new System.Drawing.Size(55, 43);
            this.btnNum8.TabIndex = 2;
            this.btnNum8.Text = "8";
            this.btnNum8.UseVisualStyleBackColor = true;
            this.btnNum8.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum9
            // 
            this.btnNum9.Location = new System.Drawing.Point(147, 99);
            this.btnNum9.Name = "btnNum9";
            this.btnNum9.Size = new System.Drawing.Size(55, 43);
            this.btnNum9.TabIndex = 2;
            this.btnNum9.Text = "9";
            this.btnNum9.UseVisualStyleBackColor = true;
            this.btnNum9.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnDiv
            // 
            this.btnDiv.Location = new System.Drawing.Point(213, 99);
            this.btnDiv.Name = "btnDiv";
            this.btnDiv.Size = new System.Drawing.Size(55, 43);
            this.btnDiv.TabIndex = 2;
            this.btnDiv.Text = "/";
            this.btnDiv.UseVisualStyleBackColor = true;
            // 
            // btnNum4
            // 
            this.btnNum4.Location = new System.Drawing.Point(15, 148);
            this.btnNum4.Name = "btnNum4";
            this.btnNum4.Size = new System.Drawing.Size(55, 43);
            this.btnNum4.TabIndex = 2;
            this.btnNum4.Text = "4";
            this.btnNum4.UseVisualStyleBackColor = true;
            this.btnNum4.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum5
            // 
            this.btnNum5.Location = new System.Drawing.Point(81, 148);
            this.btnNum5.Name = "btnNum5";
            this.btnNum5.Size = new System.Drawing.Size(55, 43);
            this.btnNum5.TabIndex = 2;
            this.btnNum5.Text = "5";
            this.btnNum5.UseVisualStyleBackColor = true;
            this.btnNum5.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum6
            // 
            this.btnNum6.Location = new System.Drawing.Point(147, 148);
            this.btnNum6.Name = "btnNum6";
            this.btnNum6.Size = new System.Drawing.Size(55, 43);
            this.btnNum6.TabIndex = 2;
            this.btnNum6.Text = "6";
            this.btnNum6.UseVisualStyleBackColor = true;
            this.btnNum6.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnMul
            // 
            this.btnMul.Location = new System.Drawing.Point(213, 148);
            this.btnMul.Name = "btnMul";
            this.btnMul.Size = new System.Drawing.Size(55, 43);
            this.btnMul.TabIndex = 2;
            this.btnMul.Text = "*";
            this.btnMul.UseVisualStyleBackColor = true;
            // 
            // btnNum1
            // 
            this.btnNum1.Location = new System.Drawing.Point(15, 197);
            this.btnNum1.Name = "btnNum1";
            this.btnNum1.Size = new System.Drawing.Size(55, 43);
            this.btnNum1.TabIndex = 2;
            this.btnNum1.Text = "1";
            this.btnNum1.UseVisualStyleBackColor = true;
            this.btnNum1.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum2
            // 
            this.btnNum2.Location = new System.Drawing.Point(81, 197);
            this.btnNum2.Name = "btnNum2";
            this.btnNum2.Size = new System.Drawing.Size(55, 43);
            this.btnNum2.TabIndex = 2;
            this.btnNum2.Text = "2";
            this.btnNum2.UseVisualStyleBackColor = true;
            this.btnNum2.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnNum3
            // 
            this.btnNum3.Location = new System.Drawing.Point(147, 197);
            this.btnNum3.Name = "btnNum3";
            this.btnNum3.Size = new System.Drawing.Size(55, 43);
            this.btnNum3.TabIndex = 2;
            this.btnNum3.Text = "3";
            this.btnNum3.UseVisualStyleBackColor = true;
            this.btnNum3.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnSub
            // 
            this.btnSub.Location = new System.Drawing.Point(213, 197);
            this.btnSub.Name = "btnSub";
            this.btnSub.Size = new System.Drawing.Size(55, 43);
            this.btnSub.TabIndex = 2;
            this.btnSub.Text = "-";
            this.btnSub.UseVisualStyleBackColor = true;
            // 
            // btnNum0
            // 
            this.btnNum0.Location = new System.Drawing.Point(15, 246);
            this.btnNum0.Name = "btnNum0";
            this.btnNum0.Size = new System.Drawing.Size(55, 43);
            this.btnNum0.TabIndex = 2;
            this.btnNum0.Text = "0";
            this.btnNum0.UseVisualStyleBackColor = true;
            this.btnNum0.Click += new System.EventHandler(this.btnNumber_Click);
            // 
            // btnCal
            // 
            this.btnCal.Location = new System.Drawing.Point(81, 246);
            this.btnCal.Name = "btnCal";
            this.btnCal.Size = new System.Drawing.Size(121, 43);
            this.btnCal.TabIndex = 2;
            this.btnCal.Text = "=";
            this.btnCal.UseVisualStyleBackColor = true;
            // 
            // btnAdd
            // 
            this.btnAdd.Location = new System.Drawing.Point(213, 246);
            this.btnAdd.Name = "btnAdd";
            this.btnAdd.Size = new System.Drawing.Size(55, 43);
            this.btnAdd.TabIndex = 2;
            this.btnAdd.Text = "+";
            this.btnAdd.UseVisualStyleBackColor = true;
            // 
            // FormMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(280, 305);
            this.Controls.Add(this.btnAdd);
            this.Controls.Add(this.btnSub);
            this.Controls.Add(this.btnNum3);
            this.Controls.Add(this.btnMul);
            this.Controls.Add(this.btnCal);
            this.Controls.Add(this.btnNum6);
            this.Controls.Add(this.btnNum2);
            this.Controls.Add(this.btnDiv);
            this.Controls.Add(this.btnNum0);
            this.Controls.Add(this.btnNum5);
            this.Controls.Add(this.btnNum1);
            this.Controls.Add(this.btnNum9);
            this.Controls.Add(this.btnNum4);
            this.Controls.Add(this.btnNum8);
            this.Controls.Add(this.btnNum7);
            this.Controls.Add(this.lblNumbers);
            this.Controls.Add(this.lblExpression);
            this.Name = "FormMain";
            this.Text = "계산기";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label lblExpression;
        private System.Windows.Forms.Label lblNumbers;
        private System.Windows.Forms.Button btnNum7;
        private System.Windows.Forms.Button btnNum8;
        private System.Windows.Forms.Button btnNum9;
        private System.Windows.Forms.Button btnDiv;
        private System.Windows.Forms.Button btnNum4;
        private System.Windows.Forms.Button btnNum5;
        private System.Windows.Forms.Button btnNum6;
        private System.Windows.Forms.Button btnMul;
        private System.Windows.Forms.Button btnNum1;
        private System.Windows.Forms.Button btnNum2;
        private System.Windows.Forms.Button btnNum3;
        private System.Windows.Forms.Button btnSub;
        private System.Windows.Forms.Button btnNum0;
        private System.Windows.Forms.Button btnCal;
        private System.Windows.Forms.Button btnAdd;
    }
}

