// function f1(n){
//   for (let i = 1; i < n; i *= 3) {
//   for (let j = 1; j < n; j++) {
//       console.log(i, " ", j);
//   }
// }   
// }
// f1(10);

//All comaprision operators take constant time O(1).
function comparisionTesting(a , b){
  if (a < b) { // O(1)
    console.log("a is less than b");
  }
  else if (a > b) { // O(1)
    console.log("a is greater than b");
  }
  else { // O(1)
    console.log("a is equal to b");
  }

}
comparisionTesting(10, 10);