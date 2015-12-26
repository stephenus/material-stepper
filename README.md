# Material Stepper

## Use

Extend one of this class

| Class | Preview |
------------ | -------------
| ```TextStepper``` | ![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/text.png?raw=true)  |
| ```ProgressStepper```  |  ![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/progress.png?raw=true) |
| ```DotsStepper```  | ![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/dots.png?raw=true) |
|```TabStepper```  |![textstepper](https://github.com/FrancisCan/MaterialStepper/blob/master/screenshot/tabs.png?raw=true) |

```java
public class TabSample extends TabStepper {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // programatically set colors
        setColorPrimary(Color.parseColor("#795548"));
        setColorPrimaryDark(Color.parseColor("#5d4037"));

        setErrorTimeout(1500);
        setLinear(linear);
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
        return "Tab " + getArguments().getInt("position", 0);
    }

    // step optional title
    @Override
    public String optional() {
        return "Optional " + getArguments().getInt("position", 0);
    }

    // override only if step is limited by condition
    @Override
    public boolean nextIf() {
        return i > 1;
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
