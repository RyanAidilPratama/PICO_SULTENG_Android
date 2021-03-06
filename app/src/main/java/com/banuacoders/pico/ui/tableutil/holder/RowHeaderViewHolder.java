package com.banuacoders.pico.ui.tableutil.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.banuacoders.pico.R;
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder;

public class RowHeaderViewHolder extends AbstractViewHolder {
    public final TextView rowHeaderTextView;


    public RowHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        rowHeaderTextView = itemView.findViewById(R.id.row_header_textview);
    }
}
