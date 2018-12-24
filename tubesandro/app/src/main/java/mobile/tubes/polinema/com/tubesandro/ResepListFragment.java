package mobile.tubes.polinema.com.tubesandro;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ResepListFragment extends ListFragment {
    private Listener listener;

    public ResepListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Resep.resepmeme.length];
        for (int i=0; i<names.length; i++) {
            names[i] = Resep.resepmeme[i].getNama_meme();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public interface Listener{
        void itemClicked(long id);
    }

    @Override
    public void onAttach( Context context ) {
        super.onAttach ( context );
        this.listener=(Listener) context ;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if(listener != null)
        {
            listener.itemClicked(id);
        }
    }
}
