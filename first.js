class Node {
    constructor() {
        this.name = 'First';
    }

}

// @leet 33 – Search in Rotated Sorted Array
// Category: searching-sorting
// Language: JavaScript (Node.js)

/**
 * Write your solution below. Export the function for testing.
 * Replace the default implementation.
 */
let arr = [12, 2, 3, 3, 42, 3, 4];

export function solve(input) {
    if (!input || input.length === 0) {
        return "enter the value first";
    }
    for (let i = 1; i < arr.length; i++) {
        if (input == arr[i]) {
            return i;
        }
    }

    // TODO: implement
    return null;
}
let ass = solve(42);
console.log(ass);

// --- simple manual run ---
if (import.meta.url === `file://${process.argv[1]}`) {
    // Add manual tests here
    console.log("Run your samples here. Example:");
    console.log("solve()", solve());
}
