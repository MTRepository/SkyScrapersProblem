# SkyScrapersProblem
Solution to the problem of 4by4 Skyscrapers (by FrankK)

https://www.codewars.com/kata/4-by-4-skyscrapers/java (under FreeBSD 2-Clause License)

In a grid of 4 by 4 squares you want to place a skyscraper in each square with only some clues - the number of skyscrapers seen from the outside.
The following rules should be respected:

- The height of a skyscrapers is between 1 and 4;
- no two skyscrapers in a row or column may have the same number of floors;
- a clue is the number of skyscrapers that you can see in a row or column from the outside (see the examples below);
- higher skyscrapers block the view of lower skyscrapers located behind them;
- some clues are not available (any number can be possible).

<h3> Examples (1 by 4 matrix): </h3>

<table><tr>
        <td style="text-align:center; border-color: white;height:16px;"><b>&nbsp;4&nbsp;&#8594</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;1&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;2&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;3&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;4&nbsp;&nbsp;</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&#8592&nbsp;1&nbsp;</b></td>
</tr></table>

<table><tr>
        <td style="text-align:center; border-color: white;height:16px;"><b>&nbsp;2&nbsp;&#8594</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;2&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;1&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;4&nbsp;&nbsp;</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;&nbsp;3&nbsp;&nbsp;</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&#8592&nbsp;2&nbsp;</b></td>
</tr></table>

<h3> Example (4 by 4 matrix): </h3>

<table><tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border-bottom: solid 1px;height:16px;border-color:gray;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border-bottom: solid 1px;height:16px;border-color:gray;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border-bottom: solid 1px;height:16px;border-color:gray;"><b>&nbsp;1&#8595</b></td>
        <td style="text-align:center; border-bottom: solid 1px;height:16px;border-color:gray;"><b>&nbsp;2&#8595</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
    </tr>
    <tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;2</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;1</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;4</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;3</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
    </tr>
    <tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;2&nbsp;&#8594</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;3</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;4</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;1</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;2</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&#8592&nbsp;2&nbsp;</b></td>
    </tr>
    <tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;1&nbsp;&#8594</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;4</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;2</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;3</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;1</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
    </tr>
    <tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;1</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;3</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;2</td>
        <td style="text-align:center; border: solid 1px;height:16px;border-color:gray;">&nbsp;4</td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
    </tr>
    <tr>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;2&nbsp;&#8593</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;3&nbsp;&#8593</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
        <td style="text-align:center; border: 0px;height:16px;"><b>&nbsp;*&nbsp;</b></td>
    </tr></table>


