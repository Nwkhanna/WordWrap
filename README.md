# WordWrap
Word wrapping program created using Java and Scanner imports.
The program begins by asking the user to input a number for line width. This response is
recorded by the Scanner, and the user is then prompted to enter text to be modified to conform to
that line width. Until the Scanner encounters “Stop.” on a single line, the program will keep
running and asking for lines. Once the program encounters “Stop.” on a single line, the while
loops modifying the text will end, and the modified text will be printed. The text is first checked
for blank lines, and if there are blank lines, then they will be preserved. After this, the text lines
are split up into individual lines, and then a second while loop will run assuming there is a next
word/token. The first step in this line-by-line while loop is checking if the line plus the
buffer(which is a String that will contain the modified text) is less than or equal to the specified
line width. If that’s true, then the program will add word(s) to the buffer, until it reaches the stage
where it is greater than or equal to the assigned line width. If the buffer length becomes greater
than or equal to the line width variable, a line break, a variable defined by the newline character,
is added to the buffer output variable, along with the buffer itself. Buffer will then equal the
word/token plus a space, which will reset the buffer. If an individual word/token is greater than
or equal to line width, then we will add a linebreak, and follow it up with more words and
another linebreak. The final part of this condition is equating the output buffer to the buffer, and
then clearing the buffer to continue the process. When the while loop ends via the terminal case,
the buffer is added to buffer output, and buffer output is printed, showing the fully wordwrapped
text.
