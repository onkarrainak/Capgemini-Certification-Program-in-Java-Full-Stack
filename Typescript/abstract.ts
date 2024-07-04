abstract class Person {
    getSalary(code: any) {
        throw new Error("Method not implemented.");
    }
    name: string;
    
    constructor(name: string) {//Parameterized
        this.name = name;
    }
    display(): void{//non abstract method
        console.log(this.name);
    }
    abstract msg(st:string):void;
//abstract Person find(String st);
    abstract find(string): Person;//abstract method
}
class Employee extends Person {
    
    msg(st: string): void {
        console.log("Welcome "+st);
    }
    find(name:string): Person {
        return new Employee(name,101);
    } 
    empCode: number;
    
    constructor(name: string, code: number) { 
        super(name); 
        this.empCode = code;
    }   
}
//Person emp=new Employee("Pjdd",34);
let emp: Person = new Employee("James", 100);
emp.display(); 
emp.msg("Onkar");
console.log(emp.find("Anand"));
console.log(emp);
let emp2: Person = emp.find('Steve');
console.log(emp2);