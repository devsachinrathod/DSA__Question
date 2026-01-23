// import PrintHello from './First.js';


// function PrintHelloAgain() {
//     console.log("Hello Again, World!");
// }


// function analixeComplexity() {
//     for (let i = 0; i < 10; i++) {
//         for (let j = 0; j < i; j++) {
//         // Some complex operation
//             console.log(i, " ", j);
//         }
//     }
// }


// function f1(n){
//     for (let i = 1; i < n; i *= 2) {
//         console.log(i);
//     }
// }
// function f2(n){
//     for (let i = 1; i < n; i++) {
//         for (let j = 1; j < n; j++) {
//             console.log(i, " ", j);
//         }
//     }
// }
// function f3(n){
//     for (let i = 1; i < n; i++) {
//         for (let j = 1; j < n; j++) {
//             for (let k = 1; k < n; k++) {
//                 console.log(i, " ", j, " ", k);
//             }
//         }
//     }
// }


// function f2(n){
//     for (let i = 1; i < n; i++) {
//         for (let j = 1; j < n; j+=i) {
//             console.log(i, " ", j);
//         }
//     }
// }
function duplicateDatatypes( arr){
   for(let i =1; i <= arr.length; i++){
    for(let j=1; j < i ; j++){
        if(arr[i] == arr[j]){
            console.log("the value is duplicates");
            console.log(arr[i]);
        }
    }
   }
}
duplicateDatatypes([1,2,32,2,4,5]);

// f2(40);
// f1(40);
// analixeComplexity();
// PrintHello();
// PrintHelloAgain();