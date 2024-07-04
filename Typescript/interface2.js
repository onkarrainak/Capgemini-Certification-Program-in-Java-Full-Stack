var Employeel = /** @class */ (function () {
    function Employeel(code, name, des) {
        this.empCode = code;
        this.name = name;
        this.des = des;
    }
    Employeel.prototype.disDes = function () {
        console.log("Designation interface called");
    };
    Employeel.prototype.disEmp = function () {
        console.log("Emp Code :" + this.empCode);
        console.log("Emp Name :" + this.name);
        console.log("Emp Designation :" + this.des);
    };
    Employeel.prototype.getSalary = function (empCode) {
        return 20000;
    };
    return Employeel;
}());
var empl = new Employeel(101, "Pooja", "Trainer");
console.log("Emp Code :" + empl.empCode);
console.log("Emp Name :" + empl.name);
console.log("Emp Designation :" + empl.des);
empl.disEmp();
console.log("Emp salary : " + empl.getSalary(this.code));
