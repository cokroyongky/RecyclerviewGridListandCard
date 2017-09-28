package cyp.cokrodev.recyclerviewgridlistandcard;

import android.view.View;

/**
 * Created by Cokro Yongky Pranowo on 28/09/2017.
 */

// ini untuk menangani item klik pada recycler
//    jadi jangan dihapus
public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }
}