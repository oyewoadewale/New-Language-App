package com.example.hp.newlanguage;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word>  {

    /**
     * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link Word} objects.
     */

    private int mColourResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colourResourceId) {
        super(context, 0, words);
        mColourResourceId = colourResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getMiwokTranslatio());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentWord.getImageresourceid());

            //Make sure the view is visible if there is an image

            imageView.setVisibility(View.VISIBLE);
        } else {

            //Otherwise hide the image (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // set the theme color for the list item

        View textContainer = listItemView.findViewById(R.id.text_container);

        // find the color that the resource id maps to

        int color = ContextCompat.getColor(getContext(), mColourResourceId);

        // set the background color  of the text container

        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}