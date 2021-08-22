# Kata Mars Rover

A Mars rover is an automated motor vehicle that propels itself across the surface of the planet Mars upon arrival. Rovers have several advantages over stationary landers: they examine more territory, and they can be directed to interesting features, they can place themselves in sunny positions to weather winter months, and they can advance the knowledge of how to perform very remote robotic vehicle control. There have been four successful robotically operated Mars rovers. The Jet Propulsion Laboratory managed the Mars Pathfinder mission and its now inactive Sojourner rover. It currently manages the Mars Exploration Rover mission's active Opportunity rover and inactive Spirit, and, as part of the Mars Science Laboratory mission, the Curiosity rover. On January 24, 2016 NASA reported that current studies on the Mars by the Curiosity and Opportunity rovers will now be searching for evidence of ancient life, including a biosphere based on autotrophic, chemotrophic, and/or chemolithoautotrophic microorganisms, as well as ancient water, including fluvio-lacustrine environments (plains related to ancient rivers or lakes) that may have been habitable. The search for evidence of habitability, taphonomy (related to fossils), and organic carbon on Mars is now a primary NASA objective.
### Yellow belt	
The rover knows its landing zone.
```
Sample code:
Landing position: 5, 5, N
Command: ""
Final position: 5, 5, N
````
### Green belt
The rover knows its final position.
The rover receives a list of letters as command.
When the rover receives the command "M" it moves forward.
When the rover receives the command "R" it turns 90 degrees right.
When the rover receives the command "L" it turns 90 degrees left.
```
Sample code:
Landing position: 1, 2, N
Command: "MMM"
Final position: 1, 5, N
```

### Red belt
Now the rover has to know the world dimensions.
If the rover passes the world's edge, it appears in the opposite world position (Planets are spherical).
```
Sample code:
World dimensions: 5, 5
Landing position: 1, 1, N
Command: "MMMMM"
Final position: 1, 1, N
```

### Black belt
Do not use conditionals.
Use methods (no returns).
Apply solid to dead.

https://katayuno-app.herokuapp.com/katas/2