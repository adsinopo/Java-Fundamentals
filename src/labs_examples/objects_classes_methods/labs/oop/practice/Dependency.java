package labs_examples.objects_classes_methods.labs.oop.practice;

public class Dependency {

    MotorizedTransport transport;

    public Dependency(MotorizedTransport transport){
        this.transport = transport;
    }

    public void testMethods(){
        transport.start();
        transport.accelerate(20);
        transport.stop();
        System.out.println("-----------------");
    }

    public void setTransport(MotorizedTransport transport) {
        this.transport = transport;
    }
}
