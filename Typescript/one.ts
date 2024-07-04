var fname: string = 'Onkar';
console.log("My name is " + fname);

var name1:string='Onkar';
console.log("My name is :"+name1);
console.log("Length :"+name1.length);
console.log("Uppercase: "+name1.toUpperCase());
var nm:string = "Rainak";  
var score1 = 47; 
var score2:number = 46.50 
var sum = score1 + score2  
console.log("name: "+nm)  
console.log("first score: "+score1)  
console.log("second score: "+score2)  
console.log("sum of the scores: "+sum)
var x:any;
x=10;
x="Sujay";
console.log("x: "+x)  
var stat:boolean=false;
console.log("status: "+stat) ;
let num:number = 1; 
function demo() {
    let num:number = 2;
    if(true) { 
        let num:number = 3;
        console.log("Inner:"+num); 
    }
    console.log("Outer:"+num);
}
console.log("Outeeer"+num); 
demo();