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
   compile 'com.github.fcannizzaro:material-stepper:1.1.3'
}
```

## Preview

![text](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/text.png?raw=true)
![progress](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/progress.png?raw=true)
![dots](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/dots.png?raw=true)
![tabs](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/tabs.png?raw=true)

# Stepper
Extend one of these classes ```TextStepper```, ```ProgressStepper```, ```DotStepper```, ```TabStepper```

## Methods

### setTitle(String)
set stepper title

### addStep(String)
add a step

### setColorPrimary(int)
set primary color (Toolbar/ Progress & Dot & Tab Circle color )

### setColorPrimaryDark(int)
set status bar & text color

### setErrorTimeout(int)
set timeout (milliseconds) of error message

### useStateAdapter()
use FragmentStatePagerAdapter for ViewPager instead of FragmentPagerAdapter

## Tab Stepper Methods

### setLinear(boolean)
limit user path (user has to complete previous step before move to next)

### showPreviousButton()
show previous button on the left

### disabledTouch()
disable user touch on tabs (prevent click)

### setAlternativeTab(boolean)
use alternative tab style

 - classic

 ![classic](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/classic.png?raw=true)

 - alternative

 ![alternative](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/alternative.png?raw=true)

## Override Method

### onComplete()
called when 'complete' button is pressed

## Sample

```java
public class Sample extends TabStepper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	
	/*
		...
		
		methods
		
		...
	*/
	
	// call super at the end
        super.onCreate(savedInstanceState);
    }

```

# Step
Extend ```AbstractStep```

## Override Methods

### String name()
override step name

### String optional()
override optional subtitle (tab stepper) [Default = R.string.ms_optional]

error
### boolean isOptional()
override if is optional [Default = false]

### boolean nextIf()
override condition to move to next step [Default = true]

##Sample

```java
public class StepSample extends AbstractStep {

    // step name
    @Override
    public String name() {
        return "Step title";
    }

    // step optional title (default: "Optional")
    @Override
    public String optional() {
        return "Optional subtitle";
    }
    
    // set step optional or not (default: false)
    @Override
    public boolean isOptional() {
        return true;
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

    // do something when step is visible
    @Override
    public void onStepVisible() {
        super.onStepVisible();
    }

}

```
 Save data returned in ```onActivityResult```
```java
Bundle data = mStepper.getExtras();
```

# Strings
Overwrite these strings for support multilanguage / custom titles
```xml
<string name="ms_prev">PREV</string>
<string name="ms_next">NEXT</string>
<string name="ms_end">COMPLETE</string>
<string name="ms_continue">CONTINUE</string>
<string name="ms_optional">Optional</string>
<string name="ms_text_step">Step $current of $total</string>
```
