# chatGPTFromTerminal

Use chatGPT from your terminal without ever opening your browser.
# HOW TO USE
  - Copy the .jar and .env files located in ***out/artifacts/chatGPTFromTerminal_jar*** and
    ***root*** respectively.
  - Paste your api key in .env file.
    * You can find your api key [here](https://platform.openai.com/account/api-keys).
  - Copy ***both*** files ***( .jar and .env )*** to the root directory ( like C:\ ).
  - Make an alias for running the .jar file.
    * Goto ***Computer\HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Command Processor*** .
    * Right-click on the pane, select new > string value and name it ***AutoRun***.
    * Right-click on the AutoRun property and select Modify in the Value Data section enter -
    *     doskey <alias_name> = java -jar <full directory where the .jar file is loacted>
    *     doskey a = java -jar C:\chatGPTFromTerminal.jar
  - Now try to open a new instance of terminal and run your alias.

