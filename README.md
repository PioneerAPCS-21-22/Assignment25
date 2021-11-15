# Assignment 25

## Part 1

The GC-content of a DNA string is given by the percentage of nucleobases in the string that are 'C' or 'G'. For example, the GC-content of "AGCTATAG" is 37.5% because 3 of the 8 nucleobases in the DNA string are 'C' or 'G' (3 / 8 = 0.375).

Write a method that returns the GC-content percentage of a given DNA string.

### Sample Outputs

```
gcContent("CCACCCTCGTGGTATGGCTAGGCATTCA") → 57.142857142857146%
gcContent("TAGCCAGAACCGTTTCTCTGA") → 47.61904761904762%
```

## Part 2

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

### Sample Outputs

```
bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
bobThere("b") → false
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style.

