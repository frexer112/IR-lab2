package lab2;


public class test1 {
public static void main(String argv[]) throws Exception {
DifferentialPilot pilot = new DifferentialPilot(5.6f, 13.5f);
TouchSensor touch = new TouchSensor(SensorPort.S1);
int i = 0 ;
if (!touch.isPressed()) {
pilot.forword();

}else {
	for(i=0;i<3;i++) {
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