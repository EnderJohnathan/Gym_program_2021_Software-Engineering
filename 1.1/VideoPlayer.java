package test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
 
 
public class VideoPlayer {
	
	 //打开本地播放器并播放视频 音频 
    public static  void openExe(String file) {  
    	
        try 
        { 
        	Runtime.getRuntime().exec("\"C:/Program Files/Windows Media Player/wmplayer.exe\""+file);  
        	
        } catch (Exception e)
        {  
            System.out.println("Error!");  
        }  
    }
    
    public static void main(String[] args)
    {
  	
        
    	VideoPlayer.openExe("E:\\dust2_Apr5.mp4");	
    	
    }
}