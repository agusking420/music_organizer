import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * precondition: filename can´t be null or empty.
     * if filename is already on the list, then throw an exception
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        if(filename == null || filename.trim().isEmpty()){
            throw new IllegalArgumentException("el nombre no puede ser nulo ni vacio");
        }
        if(files.contains(filename)){
            throw new IllegalArgumentException("la cancion ya esta incluida en la lista");
        }
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * precondicion: el indice no puede estar fuera del rango de la lista
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index > files.size() -1 || index < 0){ //tambien podria ser index >= files.size()
            throw new IllegalArgumentException("rango de index invalido");
        }
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * 
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index > files.size() -1 || index < 0){ //tambien podria ser index >= files.size()
            throw new IllegalArgumentException("rango de index invalido");
        }
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
