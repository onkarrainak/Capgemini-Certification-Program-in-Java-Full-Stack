//Generic Function
function identity<T>(arg: T): T { 
    return arg; 
   } 
   let output1 = identity<string>("myString"); 
   let output2 = identity<number>( 100 );
   let output3=identity<boolean>(true);
   console.log(output1);
   console.log(output2);
   console.log(output3);
   let empCode: any = "123"; 
   console.log(typeof(empCode));
   let empStatus: any = true; 
   console.log(typeof(empStatus));