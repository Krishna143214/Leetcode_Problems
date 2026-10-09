/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function() {

    a=-1;
this.forEach((item) => {
a=item;
});

    return a;
    
};

/**
 * const arr = [1, 2, 3];
 * arr.last(); // 3
 */