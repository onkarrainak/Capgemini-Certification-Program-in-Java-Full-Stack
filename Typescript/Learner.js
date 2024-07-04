var Learner = /** @class */ (function () {
    function Learner(lid, lname, lcousrstatus) {
        this.lid = lid;
        this.lname = lname;
        this.lcousrstatus = lcousrstatus;
    }
    Learner.prototype.displayLearner = function () {
        console.log("Lid : " + this.lid);
        console.log("Lname : " + this.lname);
        console.log("Lcousestatus : " + this.lcousrstatus);
    };
    return Learner;
}());
var l = new Learner(1, 'sharley', false);
l.displayLearner();
var l1 = new Learner(2, "asha", false);
l1.displayLearner();
