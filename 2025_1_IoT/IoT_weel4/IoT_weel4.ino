#include <Wire.h>
#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 16, 2);
  
void setup()
{
  lcd.init();
  lcd.backlight();
  lcd.print("LCD init");
  delay(2000);
  lcd.clear();
}

void loop()
{
  lcd.setCursor(0,0);
  lcd.print("Hello, Wolrd!");
  
  for(int position = 0; position < 16; position++){
    lcd.scrollDisplayLeft();
    delay(150);
  }
}