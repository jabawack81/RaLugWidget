/*
 * Copyright (C) 2009 nEx.Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.jabawack81.widget.ralug;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

public class Widgetlight extends AppWidgetProvider {
    public void onReceive(Context context, Intent intent) {
/*        String actiondark = intent.getAction();
        if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(actiondark))
        {
       	
            RemoteViews viewsdark = new RemoteViews(context.getPackageName(), R.layout.widgetdark);                               
            AppWidgetManager.getInstance(context).updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), viewsdark);
        }
        String actionlight = intent.getAction();
        if (AppWidgetManager.ACTION_APPWIDGET_UPDATE.equals(actionlight))
        {
            RemoteViews viewslight = new RemoteViews(context.getPackageName(), R.layout.widgetlight);
            AppWidgetManager.getInstance(context).updateAppWidget(intent.getIntArrayExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS), viewslight);
        }*/
    }
}
