interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Camera: Photo captured");
    }

    public void playMusic() {
        System.out.println("Music Player: Playing song");
    }

    void phoneDetails() {
        System.out.println("Phone: SmartPhone X");
    }
}

public class SmartPhoneDemo {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
        phone.phoneDetails();
    }
}
