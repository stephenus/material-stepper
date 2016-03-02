# Material Stepper

[![](https://jitpack.io/v/fcannizzaro/material-stepper.svg)](https://jitpack.io/#fcannizzaro/material-stepper)

## Dependency

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Add the dependency

```gradle
dependencies {
    compile 'com.github.fcannizzaro:material-stepper:1.0.2'
}
```

## Preview

![text](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/text.png?raw=true)
![progress](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/progress.png?raw=true)
![dots](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/dots.png?raw=true)
![tabs](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/tabs.png?raw=true)

## Tab Style
 - classic

 ![classic](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/classic.png?raw=true)

 - alternative

 ![alternative](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/alternative.png?raw=true)

## Use

Extend one of these classes ```TextStepper```, ```ProgressStepper```, ```DotStepper```, ```TabStepper```

```java
public class TabSample extends TabStepper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // programatically set colors
        setColorPrimary(Color.parseColor("#795548"));
        setColorPrimaryDark(Color.parseColor("#5d4037"));

        setErrorTimeout(1500);

        // only TabStepper
        setLinear(true);
        
        // alternative tab style (see screenshot)
        setAlternativeTab(true);

        setTitle("Stepper Title");

        addStep(new Step());
        addStep(new Step());
        addStep(new Step());

        super.onCreate(savedInstanceState);
    }
```
Extend ```AbstractStep```
```java
public class StepSample extends AbstractStep {

   ...

    // step name
    @Override
    public String name() {
        return "Step title";
    }

    // step optional title
    @Override
    public String optional() {
        return "Optional subtitle";
    }

    // override only if step is limited by condition
    @Override
    public boolean nextIf() {
        return i > 5;
    }

    // error showed on change next step ( see nextIf )
    @Override
    public String error() {
        return "<b>Condition</b>";
    }
}
```
 Save data returned in ```onActivityResult```
```java
Bundle data = mStepper.getExtras();
```
