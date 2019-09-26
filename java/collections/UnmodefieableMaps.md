Cameron Skinner's statement above that "Collections.unmodifiableMap guarantees that the map will not be modified" is actually only partly true in general, although it happens to be accurate for the specific example in the question (only because the Character object is immutable). 

I'll explain with an example.
Collections.unmodifiableMap actually only gives you protection that the references to objects held in the map cannot be changed. It does that by restricting the 'put' into the map that it returns. 
However, the original encapsulated map can still be modified from outside the class because Collections.unmodifiableMap does not make any copies of the contents of the map.

In the question posted by Paulo, the Character objects held in the map are luckily unmodifiable. However, in general this may not be true and the unmodifiability advertised by Collections.unmodifiableMap should not be the only safeguard. For instance, see the example below.
The startingLocations map is encapsulated and only returned by leveraging Collections.unmodifiableMap in the getStartingLocations method. However, the scheme is subverted by getting access to any object and then changing it, as seen in "Try 2" in the code above. 

Suffice to say that one can only rely on Collections.unmodifiableMap to give a truly unmodifiable map IF the objects held in the map are themselves immutable. 
If they're not, we'd want to either copy the objects in the map or otherwise restrict access to the object's modifier methods, if possible.
