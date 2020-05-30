package lab2;



public class test2 {
public static void main(String argv[]) throws Exception {
DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);
if (sonic.getDistance() > 20) {
pilot.forword();

}else {
	for(int i=0;i<3;i++) {
		if(i%2 == 0) {
			pilot.rotate(90);
			
		}else {
			pilot.rotate(-90);
			pilot.forword();
			System.out.println(i);
		}
	}
}
pilot.stop();
}
}