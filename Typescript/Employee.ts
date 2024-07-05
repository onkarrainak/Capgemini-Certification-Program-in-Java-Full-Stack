export let age : number = 20;
export class Employee {
    empCode: number;
    empName: string;
    empAge:number=30;
    constructor(name: string, code: number) {
        this.empName = name;
        this.empCode = code;
    }
    displayEmployee() {
       console.log("Employee age :"+this.empAge)
        console.log ("Employee Code: " + this.empCode + ", Employee Name: " + this.empName );
    }
}
let companyName:string = "EduBridge";
console.log("Comapny NAme :" ,companyName);