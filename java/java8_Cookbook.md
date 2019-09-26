**Convert a List< V > to List< T >**

    List<String> listOfStrings …
    List<Album> listOfAlbums = listOfStrings.stream().map(p -> albumParser(p)).collect(Collectors.toList());


**Convert a List< V > to Map< T,V >**

    listOfAlbums.stream().collect(Collectors.toMap(Album::getName , Function.identity()));

**Remove Nulls From a List**

	list.removeAll(Collections.singleton(null))
