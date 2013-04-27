cd tigame/parser/
java -jar ../../antlr-4.0-complete.jar -visitor Lang.g4
cd ../../

rm tigame/*.class
rm tigame/parser/*.class
rm tigame/interp/*.class
rm tigame/gui/*.class

javac -cp .:antlr-4.0-complete.jar tigame/parser/*.java
javac -cp .:antlr-4.0-complete.jar tigame/interp/*.java
javac -cp .:antlr-4.0-complete.jar tigame/gui/*.java
javac -cp .:antlr-4.0-complete.jar tigame/Run.java
