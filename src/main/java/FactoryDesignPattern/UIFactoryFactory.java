package FactoryDesignPattern;

public class UIFactoryFactory {

    public static UIFactory getUIFactory(PlatformsSupported platformsSupported){

        if(platformsSupported == PlatformsSupported.ANDROID){

            return new AndroidUIFactory();
        }
        else if(platformsSupported == PlatformsSupported.IOS){

            return new IOSUIFactory();
        }
        else{

            throw new IllegalArgumentException("Platform not Supported");
        }
    }
}
