package com.example.singh.shipper.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.singh.shipper.R;


public class OrderViewHolder extends RecyclerView.ViewHolder

{
    public TextView txtOrderId, txtOrderStatus,txtOrderPhone,txtOrderAddress,txtDate;
    public Button btnShipping;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txtOrderAddress =(TextView)itemView.findViewById(R.id.order_address);
        txtOrderId =(TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus =(TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone =(TextView)itemView.findViewById(R.id.order_phone);
        txtDate = (TextView)itemView.findViewById( R.id.order_date );
        btnShipping = (Button)itemView.findViewById( R.id.btnShipping );

    }
}
