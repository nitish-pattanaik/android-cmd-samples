KTC = kotlinc
KT = kotlin
JAVA = java
FILE = main.kt
CLASS = MainKt
OUTPUT_DIR = out



# It will include whole kotlin runtime.. it will increase the size of .class but it's self contained
#	$(KTC) $(FILE) -include-runtime -d $(CLASS).jar
#	$(JAVA) -jar $(CLASS).jar or, $(KT) $(CLASS).jar

# -Xlist-phases -> list phases after IR..
# -Xphases-to-dump=IrLowering


FLAGS =  -verbose -Werror -Wextra
EFLAGS = -no-jdk -no-reflect # but -no-stdlib is hard..
XFLAGS = -Xdebug -Xreport-all-warnings -Xuse-fast-jar-file-system


.PHONY: compile run clean

# compile .kt file to .clss file and that in current directory
compile:
	$(KTC) $(FLAGS) $(XFLAGS) $(FILE) -d $(OUTPUT_DIR)

# run .class file using kotlin <CLASSNAME>
run: compile
	$(KT) -cp $(OUTPUT_DIR) $(CLASS)

# clean .class files from current directory
clean:
	rm -rf $(CLASS).class
