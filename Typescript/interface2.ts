interface IEmployee {
    empCode: number;
    name: string;
    getSalary:(empCode: number) => number;//arrow
}
interface IEmpdes{
    des:string;
    disDes():void;
}
class Employeel implements IEmployee,IEmpdes { 
    empCode: number;
    name: string;
    des:string
    constructor(code: number, name: string,des:string) { 
       this.empCode = code;
        this.name = name;
        this.des=des;
    }
    disDes(): void {
        console.log("Designation interface called");
    }
    disEmp():void{
        console.log("Emp Code :"+this.empCode);
        console.log("Emp Name :"+this.name);
        console.log("Emp Designation :"+this.des);  
    }
    getSalary(empCode:number):number { 
        return 20000;
    }
}
let empl = new Employeel(101, "Pooja","Trainer");
console.log("Emp Code :"+empl.empCode);
console.log("Emp Name :"+empl.name);
console.log("Emp Designation :"+empl.des);
empl.disEmp();
console.log("Emp salary : "+empl.getSalary(this.code));