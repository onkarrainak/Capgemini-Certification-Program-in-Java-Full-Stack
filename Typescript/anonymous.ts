//Anonymous funation meand function don't have any name,Represent function with expression
let messsg = function (): void {
    console.log("Welcome to Edubridge");
}
let mul = function (a: number, b: number): number {
    return a * b;
}
let displaay = function (msg: string, name: string): string {
    return msg + ' ' + name + '!';
}       
messsg();   
console.log(displaay('Hello', 'Onkar'));
console.log("Multiplication :" + mul(12, 3));
