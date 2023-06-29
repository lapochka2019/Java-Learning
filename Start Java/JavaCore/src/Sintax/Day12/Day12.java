package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//изучение работы с List
public class Day12 {
    public static void main (String[] arg){
        System.out.println("Task1");
        List <String> list = new ArrayList<>(Arrays.asList("Auto1", "Auto2", "Auto3", "Auto4", "Auto5"));
        list.add(2,"Auto6");
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());

        System.out.println("\nTask2");
        System.out.println(task2().toString());

        System.out.println("\nTask3");
        List <MusicBand> musicBand = new ArrayList<>();
        musicBand.add(new MusicBand("M1", 1980));
        musicBand.add(new MusicBand("M2", 1982));
        musicBand.add(new MusicBand("M3", 2022));
        musicBand.add(new MusicBand("M4", 1986));
        musicBand.add(new MusicBand("M5", 2010));
        musicBand.add(new MusicBand("M6", 1990));
        musicBand.add(new MusicBand("M7", 1994));
        musicBand.add(new MusicBand("M8", 1998));
        musicBand.add(new MusicBand("M9", 2000));
        musicBand.add(new MusicBand("M10", 2002));

        System.out.println(musicBand);
        System.out.println(task3(musicBand));

        System.out.println("\nTask4");
        MusicBand band1 = new MusicBand("band1", 2002);
        MusicBand band2 = new MusicBand("band2", 2004);

        MusicArtist m1 = new MusicArtist("Mem11", 20);
        MusicArtist m2 = new MusicArtist("Mem12", 30);
        MusicArtist m3 = new MusicArtist("Mem21", 40);
        MusicArtist m4 = new MusicArtist("Mem22", 50);

        band1.addMember(m1);
        band1.addMember(m2);
        band1.printMembers();

        band2.addMember(m3);
        band2.addMember(m4);

        MusicBand.transferMembers(band2,band1);

        band1.printMembers();

        band1.deleteMember(m3);

        band1.printMembers();

    }
    public static List<String> task2 (){
        List <String> list = new ArrayList<>();
        for (int i=0;i<31;i++) if (i%2==0)list.add(Integer.toString(i));
        for (int i=300;i<351;i++) if (i%2==0)list.add(Integer.toString(i));
        return list;
    }
    public static class MusicBand{
        private String Name;
        private int Year;
        private List <MusicArtist> Members = new ArrayList<>();

        public MusicBand(String Name, int Year) {
            this.Name = Name;
            this.Year = Year;
        }

        public String getName() {
            return Name;
        }

        public int getYear() {
            return Year;
        }

        public void addMember (MusicArtist member){
            Members.add(member);
        }
        public void deleteMember (MusicArtist member){
            Members.remove(member);
        }
        public List<MusicArtist> getMembers() {
            return Members;
        }
        public void printMembers(){
            System.out.println(Members.toString());
        }

        public static void transferMembers(MusicBand a, MusicBand b){//who, where
            for (MusicArtist s:a.Members) {
                b.Members.add(s);
            }
        }

        @Override
        public String toString() {
            return "MusicBand{" +
                    "Name='" + Name + '\'' +
                    ", Year=" + Year +
                    '}';
        }
    }
    public static List<MusicBand> task3(List<MusicBand> list){
        List <MusicBand> musicBandList = new ArrayList<>();
        for (MusicBand l: list) {
            if (l.getYear()>=2000) musicBandList.add(l);
        }
        return musicBandList;
    }
    public static class MusicArtist{
       private String Name;
       private int Age;

        public MusicArtist(String name, int age) {
            Name = name;
            Age = age;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        @Override
        public String toString() {
            return "MusicArtist{" +
                    "Name='" + Name + '\'' +
                    ", Age=" + Age +
                    '}';
        }
    }

}
