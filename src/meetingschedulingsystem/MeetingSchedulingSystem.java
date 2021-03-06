/*
 * Copyright (C) 2015 Yehya Awad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package meetingschedulingsystem;

/**
 * The main class, this contains the main() function that initializes components of the program, adds sample data, and the GUI,
 * @author Yehya Awad
 * 
 */
public class MeetingSchedulingSystem {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
        initGUI();
    }
    
    /**
     * Initializes application
     */
    public static void init() {
        DataManager.init();
        
        // Some Sample data
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room("McGarvey Commons");
        Meeting sample1 = new Meeting("Who will we fire today", "1", 9);
        Meeting sample2 = new Meeting("Chicken or Beef?", "2", 12);
        DataManager.addRoom(room1);
        DataManager.addRoom(room2);
        DataManager.addRoom(room3);
        boolean x = DataManager.addMeeting(sample1);
        boolean y = DataManager.addMeeting(sample2);
        Person me = new Person("Yehya", "Awad", "717-460-6012");
        Person pers1 = new Person("John", "Doe", "123-989-0123");
        DataManager.addPerson(me);
        DataManager.addPerson(pers1);
    }
    
    /**
     * Initializes GUI of application
     */
    public static void initGUI() {
        LoadingFrame load = new LoadingFrame();
        MainMenu main = new MainMenu();
    }
}
