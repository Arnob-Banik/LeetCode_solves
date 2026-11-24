class Solution(object):
    def titleToNumber(self, title):
        col=0
        e=0
        n = len(title)
        for i in range (n-1,-1,-1):
            x=ord(title[i])-64
            x=x*26**e
            e=e+1
            col+=x
        return col
        