package cyp.cokrodev.recyclerviewgridlistandcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPresident extends AppCompatActivity {

    public static String EXTRA_IMAGE = "extra_image";
    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_REMARKS = "extra_remarks";
    public static String EXTRA_DESC = "extra_desc";
    public static String EXTRA_BORN = "extra_born";
    public static String EXTRA_DIE = "extra_die";
    public static String EXTRA_VICE = "extra_vice";

    private TextView tvName;
    private TextView tvRemarks;
    private TextView tvBorn;
    private TextView tvDie;
    private TextView tvVice;
    private TextView tvDesc;


    private ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_president);
        getSupportActionBar().setTitle("Detail President");

        tvName = (TextView) findViewById(R.id.tv_item_name);
        tvRemarks = (TextView) findViewById(R.id.tv_item_remarks);
        tvBorn = (TextView) findViewById(R.id.tvborn);
        tvDie = (TextView) findViewById(R.id.tvdie);
        tvVice = (TextView) findViewById(R.id.tvvice);
        tvDesc = (TextView) findViewById(R.id.tvdesc);
        imgPhoto = (ImageView) findViewById(R.id.img_item_photo);


        String name = getIntent().getStringExtra(EXTRA_NAME);
        String remarks = getIntent().getStringExtra(EXTRA_REMARKS);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String born = getIntent().getStringExtra(EXTRA_BORN);
        String die = getIntent().getStringExtra(EXTRA_DIE);
        String vice = getIntent().getStringExtra(EXTRA_VICE);
        String urlImage = getIntent().getStringExtra(EXTRA_IMAGE);

        Glide.with(this)
                .load(urlImage)
                .override(100, 100)
                .crossFade()
                .into(imgPhoto);

        tvName.setText(name);
        tvRemarks.setText(remarks);
        tvDesc.setText(desc);
        tvBorn.setText(born);
        tvDie.setText(die);
        tvVice.setText(vice);
    }
}
