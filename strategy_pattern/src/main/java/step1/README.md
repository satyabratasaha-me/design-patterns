So here, the Duck class has three behaviours - Quack, Swim and Display . These are fully implemented functions.

The reason for placing these functions in the parent Duck class was to re-use the three behaviours of the Duck class.
However, with this approach when we want to add two new types of Duck(FlyingDuck and MountainDuck). So what we do-


As both the types of ducks share a same behaviour, and for the sake of code reuse, we add a new method in the Duck class.
Great!!  I am able to now use the fly method from Duck class by inheriting it to the FlyingDuck and MountainDuck class.

But wait a minute!! Did you see that the MallardDuck and the RedHeadDuck was also provided with the capability to fly due to a change in the Duck class which is not as per the design.

So a localized change in one class has caused a non- localized side effect. Hence we should change the design