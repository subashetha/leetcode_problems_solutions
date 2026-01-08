
 
 var expect = function(val) {
    return {                         // No nested function needed
        toBe(expected) {
            if (val === expected) return true;
            throw Error("Not Equal");
        },
        notToBe(expected) {
            if (val !== expected) return true; 
            throw Error("Equal");
        }
    };
};
