Exercise
You have decided to learn a new language because you are bored. You recently heard someone talk about "Peptalk", and you think that sounds interesting and useful. You decide to create a program that can help you learn the language by translating natural language to "Peptalk".

Definition of "Peptalk":

Every syllable of the word is repeated, such that the repetion starts with a "p"
In the repetition of the syllable, all leading consonants (if any) are replaced by a "p", i.e. cof-fe-e becomes cofpof-fepe-epe
A syllable is defined as: zero or more consonants followed by a single vowel followed by zero or more consonants. For this assignment, only {aeiou} are considered vowels.
For this assignment, we will use the following simplified rule for determining where to split a word into syllables: A word is subdivided into syllables in such a way that there is an even split of consonants between adjacent syllables. In case of an odd number of consonants between vowels, the latter syllable gets an extra consonant. Example, which also highlights the imperfection of the rule:
assignment
(a)ss(i)gnm(e)nt
(a)s-s(i)g-nm(e)nt
as-sig-nment
as-pas-sig-pig-nment-pent
aspassigpignmentpent
For this assignment you must have a main method that reads the input from stdin and outputs to stdout. The input will be sequence of words.

Create a class called PepTalk. This class should be able to encode "peptalk".

