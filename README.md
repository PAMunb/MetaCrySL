# MetaCrySL

[![Build Status](https://travis-ci.org/PAMunb/MetaCrySL.svg?branch=master)](https://travis-ci.org/PAMunb/MetaCrySL)
[![Coverage Status](https://coveralls.io/repos/github/PAMunb/MetaCrySL/badge.svg?branch=master)](https://coveralls.io/github/PAMunb/MetaCrySL?branch=master)

XText-based MetaCrySL language.
The original MetaCrySL implementation was developed in Rascal, this one tries to incorporate the refinements from MetaCrySL but using a XText approach.

### Requirements

* Java 
* Maven
* XText
* Eclipse

### Instructions to develop MetaCrySL in Eclipse

1. Import the MetaCrySL project
2. Add an XText nature to the MetaCrySL project (if not already configured).
3. Expand the src directory in the MetaCrySL project and then expand the ***br.unb.cic.mcsl*** directory.
4. Right click on "GenerateMetaCrySL.mwe2" 
5. Click on "MWE2 Workflow" via the "Run as ..." option. This will build the necessary artifacts.

### Instructions to test MetaCrySL in Eclipse

1. Execute all steps in Instructions to develop in Eclipse.
2. Right click on the ***br.unb.cic.mcsl*** project and navigate to Run As | Run Configurations...; in the dialog, select Eclipse Application.
3. A new Eclipse instance will be run and a new workbench will appear. 
4. Select the perspective with Window | Perspective | Open Perspective | Plug-in Development.
5. Create a new project with File | New | Project... | General | Project.
6. Create a new file with extension ***"*.mcsl"***. 
7. Have fun!

### Features


