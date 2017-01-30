
ArraySource source = new ArraySource()
int[] symetricalArray = source.symetricalArray 
int[] nonSymetricalArray = source.nonSymetricalArray 

ArrayChecker myChecker = new ArrayChecker()
print "First array: "
int[] arrayToPrint = myChecker.checkAndReverse(symetricalArray)
myChecker.printArray(arrayToPrint)
print "Second array: " 
arrayToPrint = myChecker.checkAndReverse(nonSymetricalArray)
myChecker.printArray(arrayToPrint)






