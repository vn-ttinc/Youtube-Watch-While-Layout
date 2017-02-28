package com.ttinc.android.apps.watchwhilelayout.utils;

import com.ttinc.android.apps.watchwhilelayout.R;

/**
 * Created by thangn on 2/27/17.
 */

public class Dataset {
    public static DatasetItem[] datasetItems;

    static {
        int n = 50;
        datasetItems = new DatasetItem[n];
        for (int i = 0; i < n; i++) {
            datasetItems[i] = new DatasetItem(i + 1);
        }
    }

    public static class DatasetItem {
        public int id;
        public String title;
        public String subtitle;
        public String url;

        public DatasetItem(int _id) {
            String _url = "android.resource://com.ttinc.android.apps.watchwhilelayout/" + R.raw.samplevideo_1280x720_5mb;

            this.id = _id;
            this.title = String.format("This is element #%d", _id);
            this.subtitle = "LOLTube";
            this.url = _url;
        }
    }
}
