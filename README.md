# Material Stepper

## Preview

![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/text.png?raw=true)
![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/progress.png?raw=true)
![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/dots.png?raw=true)
![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/tabs.png?raw=true)

## Use

Extend one of this classes ```TextStepper```, ```ProgressStepper```, ```DotStepper```, ```TabStepper```

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
