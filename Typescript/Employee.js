"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = exports.age = void 0;
exports.age = 20;
var Employee = /** @class */ (function () {
    function Employee(name, code) {
        this.empAge = 30;
        this.empName = name;
        this.empCode = code;
    }
    Employee.prototype.displayEmployee = function () {
        console.log("Employee age :" + this.empAge);
        console.log("Employee Code: " + this.empCode + ", Employee Name: " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;
var companyName = "EduBridge";
console.log("Comapny NAme :", companyName);
