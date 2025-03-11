#define TRIG 13
#define ECHO 12

void setup() {
  // put your setup code here, to run once:
  pinMode(7, OUTPUT); //red led
  pinMode(8, OUTPUT); //green led

  Serial.begin(9600);
  
  pinMode(TRIG, OUTPUT);
  pinMode(ECHO, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  /*
  digitalWrite(7, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(7, LOW);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(8, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(8, LOW);
  delay(1000); // Wait for 1000 millisecond(s)
  */


  long duration, distance;
  
  digitalWrite(TRIG, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIG, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG, LOW);
  
  duration = pulseIn(ECHO, HIGH);
  distance = duration / 58.2;
  
  Serial.print(distance);
  Serial.print(" cm");

  if(distance >= 100){
    digitalWrite(7, HIGH);
    digitalWrite(8, LOW);
    Serial.println("  RED LED");
  }
  else{
    digitalWrite(7, LOW);
    digitalWrite(8, HIGH);
    Serial.println("  GREEN LED");
  }
  
  delay(1000);
}