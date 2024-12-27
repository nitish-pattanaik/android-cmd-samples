KTC = kotlinc
KT = kotlin
JAVA = java
FILE = main.kt
CLASS = MainKt


# It will include whole kotlin runtime.. it will increase the size of .class but it's self contained
#	$(KTC) $(FILE) -include-runtime -d $(CLASS).jar
#	$(JAVA) -jar $(CLASS).jar or, $(KT) $(CLASS).jar


SFLAGS = -Xdump-directory=C:\PROG_DIR\probe\kotlin-intro\ -Xphases-to-dump-before=ValidateIrBeforeLowering

.PHONY: compile run clean

# compile .kt file to .clss file and that in current directory
genir:
	$(KTC) $(SFLAGS) $(FILE) -d .
compile:
	$(KTC) $(FILE) -d .

# run .class file using kotlin <CLASSNAME>
run: compile
	$(KT) $(CLASS)

# clean .class files from current directory
clean:
	rm -rf $(CLASS).class
