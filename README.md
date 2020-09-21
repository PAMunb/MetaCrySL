# MetaCrySL

[![Build Status](https://travis-ci.org/PAMunb/MetaCrySL.svg?branch=master)](https://travis-ci.org/PAMunb/MetaCrySL)
[![Coverage Status](https://coveralls.io/repos/github/PAMunb/MetaCrySL/badge.svg?branch=master)](https://coveralls.io/github/PAMunb/MetaCrySL?branch=master)

XText-based MetaCrySL language. The original MetaCrySL implementation was developed in Rascal. This one aims to implement the refinements feature from MetaCrySL but using a XText approach.

The CrySL language is used by the [CogniCrypt](https://www.eclipse.org/cognicrypt/) plugin to automatically identify misuse of cryptographic APIs. MetaCrySL further enhances this language by providing the tools that allow developers to write meta-specifications in **"*.mcsl"** files. Those meta-specifications can be refined to actual CrySL rules by use of the refinements language.

### Requirements

* Java 8
* Maven
* XText
* Eclipse IDE

### Setting up your requirements

Make sure Eclipse is running on Java 8. Also, you need to setup your PATH to use Java 8 when using Maven.

We recommend using an up to date version of Eclipse for Java Developers. You can install Xtext on Eclipse by following the instructions on [this link](https://www.eclipse.org/Xtext/download.html).

### Installation Procedure

1. Clone the repository and submodules: git clone --recursive https://github.com/PAMunb/MetaCrySL.git
2. Run maven: mvn -U clean install

### Instructions to develop MetaCrySL in Eclipse

1. Import the MetaCrySL project
2. Add an XText nature to the MetaCrySL project (if not already configured).
3. Expand the src directory in the MetaCrySL project and then expand the **br.unb.cic.mcsl** directory.
4. Right click on "GenerateMetaCrySL.mwe2" 
5. Click on "MWE2 Workflow" via the "Run as ..." option. This will build the necessary files.

### Instructions to test MetaCrySL in Eclipse

1. Execute all steps in section "Instructions to develop in Eclipse".
2. Right click on the **br.unb.cic.mcsl** project and navigate to Run As | Run Configurations...; in the dialog, select Eclipse Application. A new Eclipse instance will be run and a new workbench will appear. 
4. Select the perspective with Window | Perspective | Open Perspective | Plug-in Development.
5. Create a new project with File | New | Project... | Java Project.
6. Create a new file with extension **"*.mcsl"**. 
7. Have fun!

### Project Status

This implementation of MetaCrySL is in development. This is the current status:

- [x] Implementation of specifications language grammar
- [x] Implementation of configuration language grammar
- [x] Implementation of refinements language grammar 
- [x] Test generation: we've developed a Maven plugin called [MCSLTestGeneration](https://github.com/PAMunb/MCSLTestGeneration) to automatically generate parser tests from actual Crysl files.

Pending features:
- [ ] Finish code for merging multiple refinements (deadline: september 02, 2020)
- [ ] Finish code writer for applying merged refinements to spec files (deadline: september 16, 2020)
- [ ] Finish code generator for writing Crysl files (deadline: september 30, 2020)
