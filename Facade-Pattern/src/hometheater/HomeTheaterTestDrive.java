package hometheater;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		hometheater.Tuner tuner = new hometheater.Tuner("Top-O-Line AM/FM Tuner", amp);
		hometheater.DvdPlayer dvd = new hometheater.DvdPlayer("Top-O-Line DVD Player", amp);
		hometheater.CdPlayer cd = new hometheater.CdPlayer("Top-O-Line CD Player", amp);
		hometheater.Projector projector = new hometheater.Projector("Top-O-Line Projector", dvd);
		hometheater.TheaterLights lights = new hometheater.TheaterLights("Theater Ceiling Lights");
		hometheater.Screen screen = new hometheater.Screen("Theater Screen");
		hometheater.PopcornPopper popper = new hometheater.PopcornPopper("Popcorn Popper");
 
		hometheater.HomeTheaterFacade homeTheater =
				new hometheater.HomeTheaterFacade(amp, tuner, dvd, cd,
						projector, screen, lights, popper);
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
