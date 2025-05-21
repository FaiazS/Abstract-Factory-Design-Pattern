package FactoryDesignPattern;

public class Flutter {

    private PlatformsSupported platformsSupported;

    public Flutter(PlatformsSupported platformsSupported){

        this.platformsSupported = platformsSupported;
    }

    public void refreshRate(){

        System.out.println("Setting refresh rate!");
    }

    public UIFactory buildUIFactory(){

        return UIFactoryFactory.getUIFactory(platformsSupported);
    }
}
