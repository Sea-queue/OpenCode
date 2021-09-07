#include<stdio.h>

#define IN 1 /* inside a word */
#define OUT 0 /* outside a word */

/* counting words, word length, number of words in a length,
   asterisks for every 4000 words */

int main(){
  int c, wordlength, numword, counter[27], state;
  char asterisk;
  state = OUT;
  numword = wordlength = 0;
  while ((c = getchar()) != EOF){
    if (c == ' ' || c == '\n' || c == '\t' || c == '\'' || c == '/'
        || c == ':' || c == '-'){
      state = OUT;
      for(int i = 1; i <= 27; i++){
	if (i == wordlength)
	  counter[i]++;
      }
      wordlength = 0;
    }
    else if (state == OUT){
      state = IN;
    }
    wordlength++;
  }
  int j;
  for (j = 1; j <= 27; j++){
    if (counter[j] % 4000 == 0){
      asterisk = '*' * (counter[j] / 4000);
    }
    else asterisk = '*' * (counter[j] / 4000 + 1);
  }
  printf("%2d %6d %c\n", j, counter[j], asterisk);
}
