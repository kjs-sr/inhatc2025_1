#include <SimpleTimer.h>
SimpleTimer timerCnt;

unsigned long loopCnt;

void timerCntFunc(){
  Serial.println(loopCnt);
  loopCnt++;
}

void setup() {
  Serial.begin(115200);
  Serial.println();

  timerCnt.setInterval(1000,timerCntFunc);
}

void loop() {
  timerCnt.run();
  loopCnt++;
}
