
echo Remove old byte-code files if any exist
rm *.class

echo View list of source files
ls -l *.java

echo Compile Frame.java
javac SongShuffleFrame.java

echo Compile Main.java
javac SongShuffleMain.java

echo Execute Random Song Generator
java SongShuffleMain

echo End of execution.  Have a nice day.
