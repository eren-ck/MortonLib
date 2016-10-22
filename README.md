# MortonLib

Java library to encode/decode Morton codes (Z-order curve). The library maps 2D/3D data to one dimension. This encoding can be used to store the data in various data structures (hash tables, B-trees, ..). The Z-ordering is often used to build quadtrees of point sets. 

More information: [Z-order curve](https://en.wikipedia.org/wiki/Z-order_curve)

# Usage


```java

Morton2D mortonTest = new Morton2D();

//range for (x,y) is (0,0) to (16777215,16777215) 
long mortonCode = mortonTest.encode(15, 3);          // => 95

int[] xy = mortonTest.decode(mortonCode); 			// => [15,3]


```

```java

Morton3D mortonTest = new Morton3D();

//range for (x,y,z) is (0,0,0) to (2097151,2097151,2097151) 
long mortonCode = mortonTest.encode(15, 15, 15); //4095

int xyz[] = mortonTest.decode(mortonCode); // => [15,15,15]


```


# Source

[Bit Twiddling Hacks](http://graphics.stanford.edu/~seander/bithacks.html#InterleaveTableLookup) 

[libmorton](https://github.com/Forceflow/libmorton) 


# License 

[MIT licensed](https://github.com/eren-ck/MortonLib/blob/master/LICENSE)