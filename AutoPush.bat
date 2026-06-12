@echo off
setlocal

cd /d "%~dp0"

set /p MSG=Enter commit message (or press Enter for "update"): 
if "%MSG%"=="" set MSG=update

echo.
git status
echo.
git add .
git commit -m "%MSG%"
git push

echo.
echo Done! Press any key to close.
pause > nul