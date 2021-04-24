# ISM6101 Final Group Project

- The executable Main Class is edu.fiu.earthfi.ProjectEarthFi
- The UML diagrams are in the doc folder
- The JavaDoc is in the javadoc folder

# Sample execution

This is a sample execution of the main class:

```
Starting the basic device flow

1. LTEAntenna - Signal Sent
1.1 PropagatingDevice - Signal Received

2. TrafficController - Air Traffic for baloon launch
2.1 PropagatingDevice - Area clear for launch
2.2 TrafficController - Signal boosted
2.3 PropagatingDevice - Signal is good
2.4 Transponder - Signal Transferred
2.5 PropagatingDevice - Signal established
2.6 GroundControlStation - Signal Directed
2.7 PropagatingDevice - Data acknowledged
2.8 User - Internet data sent
2.9 PropagatingDevice - Internet accessed

3. TrafficController - Decomm signal, device type: Balloon
3.1 Baloon - Decomm done by parachute
3.1.1 Parachute - Decomm done by parachute
3. TrafficController - Decomm signal, device type: Buoy
3.1 Buoy - Decomm done by sinking
```
