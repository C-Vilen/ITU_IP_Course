# ProfanityFilter

## Exercise
Some of your peers have suggested that you swear too much on Twitter. You have a sneaking suspicion that they are right.

Therefore, you have decided to write a `ProfanityFilter` to tweak your tweets (you do not trust yourself to be able to do it).

The swear words that must be filtered out are given as the first line of the standard input. All lines after that must be printed to standard output, with all swear words replaced by the characters `*&#$%` repeated to the length of the swear word. Thus, if `fudgesicles` is a swearword, it must be replaced by `*&#$%*&#$%*`. A swear word is still a swear word, if it is written in a different case, e.g., in upper case, lower case, or a mix of these. However, a word should not be filtered, if it merely contains a swearword.

The input text also contains punctuation marks (`,.!?`), which should not be affected by your filter. These will only show up at the end of words, and only one at a time.

## Sample Test

### Input (stdin):
```sh
hate fudgesicles
I bleeping hate those fudgesicles.
```
### Expected Output:
```sh
I bleeping *&#$ those *&#$%*&#$%*.
```