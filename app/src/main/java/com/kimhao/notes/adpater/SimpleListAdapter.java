package com.kimhao.notes.adpater;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kimhao.notes.R;
import com.kimhao.notes.adpater.base.BaseListAdapter;

import java.util.List;


public abstract class SimpleListAdapter extends BaseListAdapter<String> {

    public SimpleListAdapter(Context mContext, List<String> list) {
        super(mContext, list);
    }

    @Override
    public View bindView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(getLayout(), null);
            holder = new Holder();
            holder.textView = (TextView)convertView.findViewById(R.id.textView);
            convertView.setTag(holder);
        }else{
            holder = (Holder)convertView.getTag();
        }
        holder.textView.setText(list.get(position));
        return convertView;
    }

    protected abstract @LayoutRes int getLayout();

    static class Holder {
        TextView textView;
    }

}
