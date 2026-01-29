function PrintHello(arr) {
    console.log(arr.length);
    console.log(...arr);
    console.log("Hello, World!");
}

PrintHello([1, 2, 4, 4343, 43, 434]);

export default PrintHello;

