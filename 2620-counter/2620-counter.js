/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    a=1;
    return function() {
        if(a==1){
            a=2;
            return n;

        }
        n=n+1;
        return n;
        
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */