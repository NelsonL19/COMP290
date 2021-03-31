# Author: Nelson Lopez
# PID: 730157511
# I pledge the UNC and COMP290 Honor Code.

# Default rule is at the top
#
# Specify a rule with the formal
# <target> : <prereq>
#      <recipe> [shell commands


bin/stack-demo: obj/stack.o obj/main.o | obj/ bin/
	gcc -g -Wall -std=c11 -o bin/stack-demo obj/stack.o obj/main.o

obj/%.o: src/%.c | obj/
	gcc -g -Wall -std=c11 -c -o $@ $<

%/:
	mkdir -p $@

.PHONY: dirs clean run

dirs:
	mkdir -p obj/
	mkdir -p bin/

clean: 
	rm -rf obj/ bin/

run: bin/stack-demo
	./bin/stack-demo


