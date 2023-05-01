@echo off
:: If you already have a valid JAVA_HOME environment variable set, feel free to comment the below two lines
set JAVA_HOME=C:\Users\haide\OneDrive\Documents\NetBeansJDKs\zulu17.42.19-ca-jdk17.0.7-win_x64_1\zulu17.42.19-ca-jdk17.0.7-win_x64
set path=%JAVA_HOME%\bin;%path%
set path=C:\Users\haide\.m2\repository\allure\allure-2.21.0\bin;%path%
allure serve allure-results
pause
exit