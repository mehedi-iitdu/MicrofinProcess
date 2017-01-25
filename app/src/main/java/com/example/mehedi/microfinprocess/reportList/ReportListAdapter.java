package com.example.mehedi.microfinprocess.reportList;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehedi.microfinprocess.Listener;
import com.example.mehedi.microfinprocess.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.mehedi.microfinprocess.reportList.Shape.drawCircle;

/**
 * Created by mehedi on 1/25/17.
 */

public class ReportListAdapter extends RecyclerView.Adapter<ReportListAdapter.ReportViewHolder>{

    Context context;
    List<ReportData> reportData = new ArrayList<>();
    LayoutInflater inflater;
    Listener listener;

    @Override
    public ReportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.report,parent,false);
        ReportViewHolder reportViewHolder = new ReportViewHolder(view);
        return reportViewHolder;
    }

    public ReportListAdapter(Context context, List<ReportData> reportData) {
        this.context = context;
        this.reportData = reportData;
        this.listener = listener;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(ReportViewHolder holder, int position) {
        holder.bind(reportData.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return reportData.size();
    }

    public class ReportViewHolder extends RecyclerView.ViewHolder{

        TextView report_no;
        TextView report_name;

        public ReportViewHolder(View itemView) {
            super(itemView);

            report_no = (TextView) itemView.findViewById(R.id.report_no);
            report_name = (TextView) itemView.findViewById(R.id.report_name);
        }

        public void bind(final ReportData reportData, final Listener listener){

            report_no.setText(reportData.getReport_no());
            report_name.setText(reportData.getReport_name());
            String color_code_center = reportData.getColor_code_center();
            String color_code_shade = reportData.getColor_code_sahde();
            report_no.setBackgroundDrawable(drawCircle (context, 50, 50, Color.parseColor(color_code_center), Color.parseColor(color_code_shade)));

        }
    }
}
