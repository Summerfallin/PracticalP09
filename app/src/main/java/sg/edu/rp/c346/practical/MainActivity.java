package sg.edu.rp.c346.practical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<FormulaItem> alFormulaList;
    CustomerAdapter caFormula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFormula = findViewById(R.id.listViewFormula);
        alFormulaList = new ArrayList<>();
        FormulaItem for1 = new FormulaItem("Area of rectangle","Length x Length","Formula type is: Area");
        FormulaItem for2 = new FormulaItem("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        FormulaItem for3 = new FormulaItem("Volume of cube","Length x Length x Length","Formula type is: Volume");
        alFormulaList.add(for1);
        alFormulaList.add(for2);
        alFormulaList.add(for3);
        caFormula=new CustomerAdapter(this,R.layout.formula_item,alFormulaList);
        lvFormula.setAdapter(caFormula);
    }
}
