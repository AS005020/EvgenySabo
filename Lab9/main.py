from gpio import *
from time import *

def main():
	pinMode(1, IN)
	pinMode(2, OUT)
	pinMode(3, OUT)
	print("Blinking")
	while True:
		float = (analogRead(1)/1023.0)*200 - 100
		if  float < 20:
			digitalWrite(2, HIGH)
			delay(5)
			digitalWrite(3, LOW)
			delay(5)
		elif float > 25:
			digitalWrite(2, LOW)
			delay(5)
			digitalWrite(3, HIGH)
			delay(5)
		else:
			digitalWrite(2, LOW)
			digitalWrite(3, LOW)
			

if __name__ == "__main__":
	main()
