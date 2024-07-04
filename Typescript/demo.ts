/*
In TypeScript, you can create multiple functions with the same name but different
 parameter types and return types. But, the number of parameters
  should be exactly the same, only the data type can differ.
  */
  function add11(a: number, b: number): number;
  function add11(a: string, b: string): string;
  function add11(a: any, b: any): any {
      return a + b;
  }
  // add11(5, 20);
  // add11("Hello", "EB");
  console.log("Addition using integer:"+add11(15,20));
  console.log("Addition using string:"+add11("Onkar","R"));
  console.log("Addition using float:"+add11(15.3,20.1));