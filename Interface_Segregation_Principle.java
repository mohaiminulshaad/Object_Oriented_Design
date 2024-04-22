/**
 * @author Mohaiminul Islam Shaad; Student ID : 220201
 * @version 1.0
 * @since 2024-04-22
 */
/**
 * Interface for basic phone functionalities.
 */
interface Phone {
    /**
     * Makes a call to the specified number.
     * @param number The phone number to call.
     */
    void makeCall(String number);

    /**
     * Receives a call from the specified number.
     * @param number The phone number from which the call is received.
     */
    void receiveCall(String number);
}

/**
 * Interface for camera functionalities.
 */
interface Camera {
    /**
     * Takes a photo.
     */
    void takePhoto();

    /**
     * Records a video.
     */
    void recordVideo();
}

/**
 * Interface for music player functionalities.
 */
interface MusicPlayer {
    /**
     * Starts playing music.
     */
    void playMusic();

    /**
     * Pauses the currently playing music.
     */
    void pauseMusic();

    /**
     * Skips to the next track in the playlist.
     */
    void skipTrack();
}

/**
 * Concrete class implementing the Phone interface for a basic phone.
 */
class BasicPhone implements Phone {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Incoming call from " + number);
    }
}

/**
 * Concrete class implementing the Phone and Camera interfaces for a camera phone.
 */
class CameraPhone implements Phone, Camera {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Incoming call from " + number);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video");
    }
}

/**
 * Concrete class implementing the Phone and MusicPlayer interfaces for a music player phone.
 */
class MusicPlayerPhone implements Phone, MusicPlayer {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Incoming call from " + number);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
    }

    @Override
    public void skipTrack() {
        System.out.println("Skipping to the next track");
    }
}

// Client code with main method
public class Interface_Segregation_Principle {
    public static void main(String[] args) {
        Phone basicPhone = new BasicPhone();
        basicPhone.makeCall("123456789");
        basicPhone.receiveCall("987654321");

        Phone cameraPhone = new CameraPhone();
        cameraPhone.makeCall("999");
        ((Camera) cameraPhone).takePhoto();

        Phone musicPlayerPhone = new MusicPlayerPhone();
        musicPlayerPhone.makeCall("456");
        ((MusicPlayer) musicPlayerPhone).playMusic();
    }
}
