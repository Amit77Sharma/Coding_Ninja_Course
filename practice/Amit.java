package practice;
import java.util.Scanner;
import java.util.Arrays;
public class Amit {
	
	public static double findSongDurationForArtist(Song[] song,String artist1) {
		double totalDuration=0;
		for(int i=0; i<song.length; i++) {
			if(song[i].getartist().equals(artist1)) {
				totalDuration=totalDuration+song[i].getduration();
			}
		}
		return totalDuration;
	}
	
	public static void getSonginAscendingOrder(Song[] song,String artist2) {
		boolean flage=true;
		int min=0;
		for(int i=0; i<song.length-1; i++) {
			min=i;
			for(int j=i+1; j<song.length; j++) {
				if(song[j].getduration()<song[i].getduration()) {
					min=j;
				}
			}
			Song temp=song[min];
			song[min]=song[i];
			song[i]=temp;	
		}
		for(int i=0; i<song.length; i++) {
			if(song[i].getartist().equals(artist2)) {
				System.out.println(song[i].getsongId());
				System.out.println(song[i].gettitle());
				flage=false;
			}
		}
		if(flage==true) {
			System.out.println("there is no song with this artist");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Song[] song=new Song[5];
		for(int i=0; i<song.length; i++) {
			int songId=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			String artist=sc.nextLine();
			double duration=sc.nextDouble();
			sc.nextLine();
			song[i]=new Song(songId,title,artist,duration);
		}
		String artist1=sc.nextLine();
		String artist2=sc.nextLine();
		double d=findSongDurationForArtist(song,artist1);
		if(d==0) {
			System.out.println("There is no song with this artist");
		}else {
			System.out.println(d);
		}
		getSonginAscendingOrder(song,artist2);
	}

}

class Watch{
	
	private int watchId;
	private String watchName;;
	private String artist;
	private double p;
	
	public Song(int watchId, String title, String artist, double duartion) {
		this.songId=songId;
		this.title=title;
		this.artist=artist;
		this.duration=duration;
	}
	
	public int getsongId() {
		return songId;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getartist() {
		return artist;
	}
	public double getduration() {
		return duration;
	}
}
