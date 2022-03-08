### Official README
[here](README-official.md)
### Partial Typeflow Analysis
The main algorithm implementation is in [AnalysisMethod.java](substratevm/src/com.oracle.graal.pointsto/src/com/oracle/graal/pointsto/meta/AnalysisMethod.java).\
[`introClassJava-benchmarks/`](introClassJava-benchmarks/src/com/mxy) contains the modified benchmark [IntroClassJava](https://github.com/Spirals-Team/IntroClassJava), and the simple test code on it is inserted in [NativeImageGenerator.java](substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/NativeImageGenerator.java) (requiring the test to be triggered manually in Debug mode)
