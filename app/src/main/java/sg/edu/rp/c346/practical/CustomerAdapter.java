package sg.edu.rp.c346.practical;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003749 on 16/7/2018.
 */

public class CustomerAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<FormulaItem> formulaList;
    public CustomerAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaItem> objects) {
        super(context, resource, objects);
        parent_context=context;
        layout_id = resource;
        formulaList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDate = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);
        FormulaItem currentItem = formulaList.get(position);
        tvName.setText(currentItem.getName());
        tvDate.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());

        return rowView;
    }
}
