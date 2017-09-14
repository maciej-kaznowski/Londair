package com.innercirclesoftware.londair.injection.components;

import com.innercirclesoftware.londair.LondAir;
import com.innercirclesoftware.londair.airquality.ui.AirQualityFragment;
import com.innercirclesoftware.londair.injection.modules.AndroidModule;
import com.innercirclesoftware.londair.injection.modules.NetworkModule;
import com.innercirclesoftware.londair.injection.modules.NotificationModule;
import com.innercirclesoftware.londair.injection.modules.PresenterModule;
import com.innercirclesoftware.londair.main.MainActivity;
import com.innercirclesoftware.londair.notifications.ForecastNotificationService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AndroidModule.class,
        PresenterModule.class,
        NetworkModule.class,
        NotificationModule.class,
})
public interface ApplicationComponent {

    void inject(MainActivity activity);

    void inject(AirQualityFragment fragment);

    void inject(ForecastNotificationService service);

    void inject(LondAir app);
}
