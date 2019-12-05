public class Playlist
{
    //1: instance variables
    //var: array of songs
    private Song[] playlist;
    private int countSong = 0;

    //2: constructors
    //sets in memory enough space for 4 songs
    public Playlist()
    {
        playlist = new Song[4];
    } //end zero arg constructor

    //6: Brain Method
    public void addSong(Song aSong)
    {
        //check if you've reached max num of songs
        if(countSong == playlist.length)
        {
            increaseSize();
        }//end check to see if need to increase size of Playlist
        playlist[countSong] = aSong;
        countSong++;
    } //end method to add a song to the playlist

    private void increaseSize()
    {
        //temp array that is twice as long as the original one
        Song[] temp = new Song[playlist.length * 2];

        //copy everything in og array into new, temp one
        for(int s = 0; s < playlist.length; s++)
        {
            temp[s] = playlist[s];
        } //end loop moving songs from 1st to 2nd playlist
        playlist = temp; //changes the name of the temp to playlist
    } //end method to double length of array

    //3: toString
    public String toString()
    {
        String output = "- - - My Playlist - - -\n";
        for(int s = 0; s < countSong; s++)
        {
            output += playlist[s].toString() + "\n- - - - - - - -\n";
        } //end for loop
        return output;
    } //end toString

} //end class Playlist
