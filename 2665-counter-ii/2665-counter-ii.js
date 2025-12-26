
var createCounter = (val) => {
        let curr = val;
        return {
            increment: () =>{
                curr+=1;
               return curr;
            },
            decrement: () =>{
                curr -=1;
                return curr;
            },
            reset: () =>{
                curr = val;
                return curr;
            }
        };
};
