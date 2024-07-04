var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Human = /** @class */ (function () {
    function Human() {
        console.log("Human parent class constructor");
    }
    Human.prototype.speak = function () {
        console.log(this.name + " can speak.");
    };
    return Human;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    // constructors
    function Student(rollnumber, name1) {
        var _this = _super.call(this) || this; // calling Parent's constructor
        _this.rollnumber = rollnumber;
        _this.name = name1;
        return _this;
    }
    // functions
    Student.prototype.displayInformation = function () {
        console.log("Name : " + this.name + ", Roll Number : " + this.rollnumber);
    };
    return Student;
}(Human));
var student1 = new Student(2, "Elan");
var student2 = new Student(4, "Muneshwari");
// accessing variables
console.log("Student 1 name is : " + student1.name);
console.log("Student 2 roll number is : " + student2.rollnumber);
console.log("\n---Student 1---");
// calling functions
student1.displayInformation();
// calling funciton of parent class
student1.speak();
console.log("\n---Student 2---");
student2.displayInformation();
student2.speak();
