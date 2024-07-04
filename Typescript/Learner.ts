class Learner {
    lid: number;
    lname: string;
    lcousrstatus: boolean;
    
    constructor(lid: number, lname: string, lcousrstatus: boolean) {
        this.lid = lid;
        this.lname = lname;
        this.lcousrstatus = lcousrstatus;
    }
    displayLearner() {
        console.log("Lid : " + this.lid);
        console.log("Lname : " + this.lname);
        console.log("Lcousestatus : " + this.lcousrstatus);
    }
}
let l = new Learner(1, 'sharley', false);
l.displayLearner();
let l1=new Learner(2,"asha",false);
l1.displayLearner();