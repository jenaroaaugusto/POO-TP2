c&r:
	make c r
c:
	javac -s src/ -d bin/ src/*/*.java src/*/*/*.java
r:
	java -cp bin/ locadora.visao.LocadoraGUI
