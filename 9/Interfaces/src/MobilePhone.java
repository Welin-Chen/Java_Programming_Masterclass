public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("No action taken, mobile phone does not have a power botton");
    }

    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on MobilePhone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    public void answer() {
        if (isRinging) {
            System.out.println("Answer the MobilePhone");
            isRinging = false;
        }
    }

    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number is different");
        }
        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }
}