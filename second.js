import PrintHello from './First.js';


function PrintHelloAgain() {
    console.log("Hello Again, World!");
}


function analixeComplexity() {
    for (let i = 0; i < 10; i++) {
        for (let j = 0; j < i; j++) {
        // Some complex operation
            console.log(i, " ", j);
        }
    }
}

function f1(n){
    for (let i = 1; i < n; i *= 2) {
        console.log(i);
    }
}

function f2(n){
    for (let i = 1; i < n; i++) {
        for (let j = 1; j < n; j+=i) {
            console.log(i, " ", j);
        }
    }
}
f2(40);
// f1(40);
// analixeComplexity();
// PrintHello();
// PrintHelloAgain();