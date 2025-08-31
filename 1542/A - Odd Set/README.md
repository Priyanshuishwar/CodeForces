<h3><a href="https://codeforces.com/contest/1542/problem/A" target="_blank" rel="noopener noreferrer">Odd Set</a></h3>

<div class="header"><div class="title">A. Odd Set</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given a multiset (i. e. a set that can contain multiple equal integers) containing $$$2n$$$ integers. Determine if you can split it into exactly $$$n$$$ pairs (i. e. each element should be in exactly one pair) so that the sum of the two elements in each pair is <span class="tex-font-style-bf">odd</span> (i. e. when divided by $$$2$$$, the remainder is $$$1$$$).</p></div><div class="input-specification"><div class="section-title">Input</div><p>The input consists of multiple test cases. The first line contains an integer $$$t$$$ ($$$1\leq t\leq 100$$$) — the number of test cases. The description of the test cases follows.</p><p>The first line of each test case contains an integer $$$n$$$ ($$$1\leq n\leq 100$$$).</p><p>The second line of each test case contains $$$2n$$$ integers $$$a_1,a_2,\dots, a_{2n}$$$ ($$$0\leq a_i\leq 100$$$) — the numbers in the set.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print "<span class="tex-font-style-tt">Yes</span>" if it can be split into exactly $$$n$$$ pairs so that the sum of the two elements in each pair is <span class="tex-font-style-bf">odd</span>, and "<span class="tex-font-style-tt">No</span>" otherwise. You can print each letter in any case.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id00960928855419118" id="id00454470815932313" class="input-output-copier">Copy</div></div><pre id="id00960928855419118">5
2
2 3 4 5
3
2 3 4 5 5 5
1
2 4
1
2 3
4
1 5 3 2 6 7 3 4
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0013448758599925592" id="id003101937888950731" class="input-output-copier">Copy</div></div><pre id="id0013448758599925592">Yes
No
No
Yes
No
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, a possible way of splitting the set is $$$(2,3)$$$, $$$(4,5)$$$.</p><p>In the second, third and fifth test case, we can prove that there isn't any possible way.</p><p>In the fourth test case, a possible way of splitting the set is $$$(2,3)$$$.</p></div>