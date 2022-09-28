package com.example.alwaysrememberhim_wallpapers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    public Context mContext;

    public ImageAdapter(Context mContext){
        this.mContext=mContext;
    }

    public int[] imageArray={
            R.drawable.jesus1,
            R.drawable.jesus2,
            R.drawable.jesus3,
            R.drawable.jesus4,
            R.drawable.jesus5,
            R.drawable.jesus6,
            R.drawable.jesus7,
            R.drawable.jesus8,
            R.drawable.jesus9,
            R.drawable.jesus10,
            R.drawable.jesus11,
            R.drawable.jesus12,
            R.drawable.jesus13,
            R.drawable.jesus14,
            R.drawable.jesus15,
            R.drawable.jesus16,
            R.drawable.jesus17,
            R.drawable.jesus18,
            R.drawable.jesus19,
            R.drawable.jesus20
    };

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(360,720));
        return imageView;
    }
}
