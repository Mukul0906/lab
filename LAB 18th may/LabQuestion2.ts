abstract class Car {
    // variables
    public regNo:number;
    // constructor
    constructor(regNo:number){
        this.regNo=regNo
    }
    // abstract method
    public abstract brakingSystem();
}

class Maruti extends Car { // sub class 1
    // implementing abstract method
    public brakingSystem() {
        console.log("Braking system of Maruti car having registrtion no. "+this.regNo+" has been applied.");
    }
}
class Suzuki extends Car { // sub class 2
    // implementing abstract method
    public brakingSystem() {  
        console.log("Braking system of Suzuki car having registrtion no. "+this.regNo+" has been applied."); 
    } 
}

let mc = new Maruti(9065);
mc.brakingSystem();
let sc = new Suzuki(8075);
sc.brakingSystem();