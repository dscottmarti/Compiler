@echo off
echo Compiling Parser... && echo =====================
call javacc Parser.jj
echo. && echo Aggregating Sources... && echo ======================
dir /s /B *.java > sources.txt
type sources.txt
echo. && echo Compiling Sources... && echo ======================
call javac @sources.txt
echo Done!
