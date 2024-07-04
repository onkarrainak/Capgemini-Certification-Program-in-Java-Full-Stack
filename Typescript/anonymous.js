//Anonymous funation meand function don't have any name,Represent function with expression
var messsg = function () {
    console.log("Welcome to Edubridge");
};
var mul = function (a, b) {
    return a * b;
};
var displaay = function (msg, name) {
    return msg + ' ' + name + '!';
};
console.log(displaay('Hello', 'Pooja'));
console.log("Multiplication :" + mul(12, 3));
messsg();
