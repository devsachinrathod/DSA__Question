// https://github.com/devsachinrathod/DSA__Question.git

//Q-1] Searching the highest valuse of an array.

function realBackTracking(foots, index = 0, calculateHighestStep = []) {
    // base case: when we reach the end
    if (index === foots.length) {
        return calculateHighestStep;
    }
    // check and push
    if (foots[index] > calculateHighestStep[0] || calculateHighestStep.length === 0) {
        calculateHighestStep[0] = foots[index];
    }
    // recursive call
    return realBackTracking(foots, index + 1, calculateHighestStep);
}
let step = [21, 2, 4, 6, 8, 67];
console.log("Highest Step:", realBackTracking(step)[0]);
