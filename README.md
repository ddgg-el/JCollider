# JCollider

__Note:__ This project is an attempt to revive the JCollider Library. See [ScalaCollider](https://github.com/Sciss/ScalaCollider) for an actively maintained SuperCollider client for the Scala programming language instead.

## Statement

JCollider is a Java library to build clients for the SuperCollider server architecture. While staying rather compact, it provides a lot of the functionality found in the SuperCollider Language (sclang) application. JCollider uses the same concept of mirroring the server (scsynth) objects on the client side as sclang, and its API is fairly similar to classes found in sclang. Some additional GUI helper classes are provided.

JCollider is (C)opyright 2004&ndash;2016 by Hanns Holger Rutz. All rights reserved. JCollider is released under the GNU Lesser General Public License v2.1+. The software comes with absolutely no warranties.

To contact the author, send an email to `contact at sciss.de`. For project status, API and current version, visit [the GitHub page](https://github.com/Sciss/JCollider).

## requirements / installation

JCollider is platform independent, but requires a Java 1.6 SE runtime environment (JRE) or development kit (JDK). Since it is designed to control a SuperCollider server, you will have to install one, if you haven't yet done so. The main SuperCollider portal is [supercollider.sf.net](http://supercollider.sf.net/). JCollider uses the [NetUtil OSC library](https://github.com/Sciss/NetUtil) which is licensed under the GNU Lesser General Public License.

## download and building

### IMPORTANT! this repository is not ready for release (yet)  
The current source code can be downloaded here:

- https://github.com/Sciss/JCollider

### SBT
The project builds with [sbt](http://www.scala-sbt.org/) now. To compile, run `sbt compile`. To see the demo, run `sbt test:run`.

__TO BE FIXED__: The demo now detects multiple classes and let you choose between 
```
 [1] de.sciss.jcollider.test.Demo
 [2] de.sciss.jcollider.test.Main
```
both classes have a GUI which does not start running `sbt test:run` 

### Maven
the project can be build with Maven. To compile, run `mvn compiler:compile` 

### Test
The tests work if using an IDE (such as IntelliJ IDEA or VSCode) and running `main()` directly from the class file.
Keepl in mind that `test.Main.main()` needs an argument to run:
```
--test1 (to run Demo)
--test2 (to run MotoRevCtrl)
--test3" (to run BusTests)
--bindefs (to test the UGenInfo.readDefinitions() and the UGenInfo.writeBinaryDefinitions(new File("de/sciss/jcollider/ugendefs.bin")) functionalities
```

## linking

To use JCollider in your project, you can link to the following Maven artifact:

    GroupId: de.sciss
    ArtifactId: jcollider
    Version: 1.0.0

## contributing

Please see the file [CONTRIBUTING.md](CONTRIBUTING.md)

## documentation

Documentation comes in the form of JavaDoc. The generate the docs, run `sbt doc`.

## Projects using JCollider

- [Eisenkraut](https://github.com/Sciss/Eisenkraut) – a cross-platform audio file editor.
- [Superj](http://sourceforge.net/projects/superj/) – an Open Sound Control (OSC) enabled audio scripting server.
- [SwingOSC](https://github.com/Sciss/SwingOSC) – an OpenSoundControl (OSC) server intended for scripting Java(tm), such as to create graphical user interfaces with AWT or Swing classes.
- [Tacchi](https://code.google.com/p/woolooloo/) – combines the multi-touch/fiducial recognition functionality of the opensource reacTIVision, and Community Core Vision projects with the strength of Supercollider in the form of JCollider and the strength of the Java 2D libraries to allow for an opensource alternative to the Reactable.
