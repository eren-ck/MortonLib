# MortonLib

Java library to encode/decode Morton codes (Z-order curve). The library maps two dimensional data to one dimension. This encoding can be used to store the data in various data structures (hash tables, B-trees, ..). The Z-ordering is often used to build quadtrees of point sets. 

More information: [Z-order curve](https://en.wikipedia.org/wiki/Z-order_curve)

# Usage


```js

Morton2D mortonTest = new Morton2D();

//range for (x,y) is (0,0) to (16777215,16777215) 
int x=15;
int y=3;

long mortonCode = mortonTest.encode(x, y);          // => 95

int[] xy = mortonTest.decode(mortonCode); 			// => [15,3]

```


# Source

[Bit Twiddling Hacks](http://graphics.stanford.edu/~seander/bithacks.html#InterleaveTableLookup) 

[libmorton](https://github.com/Forceflow/libmorton) 


# License 

[MIT licensed](https://github.com/eren-ck/MortonLib/blob/master/LICENSE)