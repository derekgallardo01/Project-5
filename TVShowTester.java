import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.io.*; 
import java.util.*; 

public class TVShowTester  
{  

   // Use an insertion sort, completed correctly, in ascending order by TV show name
   
    static void insertionSortAscending(TVShows array[])
    {
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            TVShows key = array[j]; 
            int i = j-1;  
            while ( (i > -1) && ( array[i].name.compareTo(key.name)>0) ) {  
                array [i+1] = array [i];  
                i--;  
            }
            array[i+1] = key;
        }

        for(int i=0;i<n;i++)print(array[i]);
    }
    
    // Use an insertion sort, completed correctly, in descending order by number of seasons

    static void insertionSortDescending(TVShows array[])
    {
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            TVShows key = array[j]; 
            int i = j-1;  
            while ( (i > -1) && ( array[i].name.compareTo(key.name)<0) ) {  
                array [i+1] = array [i];  
                i--;  
            }
            array[i+1] = key;
        } 
        for(int i=0;i<n;i++)print(array[i]);
    }
    
    // Use a selection sort, completed correctly, in ascending order by year the show premiered

    static void selectionSortAscending(TVShows arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j].name.compareTo(arr[index].name) < 0){  
                    index = j; 
                }  
            }  
            TVShows smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
        for(int i=0;i<arr.length;i++)print(arr[i]);
    }
    
    // Use a selection sort, completed correctly, in descending order by genre

    static void selectionSortDescending(TVShows arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j].name.compareTo(arr[index].name) > 0){  
                    index = j; 
                }  
            }  
            TVShows smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        } 
        for(int i=0;i<arr.length;i++)print(arr[i]);
    }

   // Use a merge sort, completed correctly, in ascending order by number of episodes
   
    static void mergeAsscending(TVShows arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        TVShows L[] = new TVShows[n1];
        TVShows R[] = new TVShows[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].numberOfEpisodes <= R[j].numberOfEpisodes) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    

   // Recursive merge
  
    static void mergeSortAscending(TVShows arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            mergeSortAscending(arr, l, m);
            mergeSortAscending(arr, m + 1, r);
            mergeAsscending(arr, l, m, r);
        }
        for(int i=0;i<arr.length;i++)print(arr[i]);
    }
    
    // Use a merge sort, completed correctly, in descending order by network


    static void mergeDescending(TVShows arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        TVShows L[] = new TVShows[n1];
        TVShows R[] = new TVShows[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].numberOfEpisodes >= R[j].numberOfEpisodes) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
  
    static void mergeSortDescending(TVShows arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            mergeSortDescending(arr, l, m);
            mergeSortDescending(arr, m + 1, r);
            mergeDescending(arr, l, m, r);
        }
        for(int i=0;i<arr.length;i++)print(arr[i]);
    }

    static void print(TVShows te)
    {
        System.out.println(te.name);
        System.out.println(te.yearPremired);
        System.out.println(te.numberOfSeasons);
        System.out.println(te.numberOfEpisodes);
        System.out.println(te.network);
        System.out.println(te.genre);
        System.out.println(te.maleLead);
        System.out.println(te.femaleLead);
    }
    
    // Use a sequential search, completed correctly, to find all shows in the array that lasted for 2 years

    static void sequentialSearchYearPremired(TVShows arr[])
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i].yearPremired>=2)
            {
                print(arr[i]);
            }
        }
    }
    
    // Use a sequential search, completed correctly to find all shows in the array that had more than 100 episodes

    static void sequentialSearchNumberOfEpisodes(TVShows arr[])
    {
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i].numberOfEpisodes>=100)
            {
                print(arr[i]);
            }
        }
    }
    
    // Use a binary search, completed correctly, to find and count all shows in the array that aired on CBS.

    static void binarySearchNetwork(TVShows arr[])
    {
        int n=arr.length;

        int l=0, r=n-1;

        int count=0;
        int end=0, start=0;

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].network.compareTo("CBS")>=0)
            {
                start=m;
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].network.compareTo("CBS")>0)
            {
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        count=end-start+1;

        System.out.println(count);
    }
    
    // Use a binary search, completed correctly, to find and count all shows in the array in the fantasy category

    static void binarySearchCategoryFantasy(TVShows arr[])
    {
        int n=arr.length;

        int l=0, r=n-1;

        int count=0;
        int end=0, start=0;

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].genre.compareTo("CBS")>=0)
            {
                start=m;
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].genre.compareTo("fantasy")>0)
            {
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        count=end-start+1;

        System.out.println(count);
    }
    
    // Use a binary search, completed correctly, to find and count all shows in the array in the drama category

    static void binarySearchCategoryDrama(TVShows arr[])
    {
        int n=arr.length;

        int l=0, r=n-1;

        int count=0;
        int end=0, start=0;

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].genre.compareTo("drama")>=0)
            {
                start=m;
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        while(l<=r)
        {
            int m=(l+r)/2;

            if(arr[m].genre.compareTo("drama")>0)
            {
                r=m-1;
            }
            else
            {
                end=m;
                l=m+1;
            }
        }

        count=end-start+1;

        System.out.println(count);
    }

   // Test Method
   
    public static void main(String[] args)   
    {  
        TVShows tv_shows1[]=new TVShows[100];

        String line = "";  
        String splitBy = ",";  
        int cnt=0;
        try   
        {  
            BufferedReader br = new BufferedReader(new FileReader("tv_shows.csv")); 
            br.readLine(); 
            while ((line = br.readLine()) != null)
            {  
                String[] data = line.split(splitBy);// use comma as separator
                
                // System.out.println(line);
                
                tv_shows1[cnt++]=new TVShows(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]),data[4],data[5],data[6],data[7]);
            }  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }

        TVShows tv_shows[]=new TVShows[cnt];

        for(int i=0;i<cnt;i++)tv_shows[i]=tv_shows1[i];
         
        System.out.println("Insert Sort Result 1");
        insertionSortAscending(tv_shows);
        System.out.println("Insert Sort Result 2");
        insertionSortDescending(tv_shows);
        System.out.println("Selection Sort Result 1");
        selectionSortAscending(tv_shows);
        System.out.println("Selection Sort Result 2");
        selectionSortDescending(tv_shows);
        System.out.println("Merge Sort Results 1");
        mergeSortAscending(tv_shows,0,tv_shows.length-1);
        System.out.println("Merge Sort Results 2");
        mergeSortDescending(tv_shows,0,tv_shows.length-1);
        System.out.println("Sequential Search Results 1");
        sequentialSearchYearPremired(tv_shows);
        System.out.println("Sequential Search Results 2");
        sequentialSearchNumberOfEpisodes(tv_shows);
        System.out.println("Binary Search Results 1");
        binarySearchNetwork(tv_shows);
        System.out.println("Binary Search Results 2");
        binarySearchCategoryFantasy(tv_shows);
        System.out.println("Binary Search Result 3");
        binarySearchCategoryDrama(tv_shows);
    }  
}