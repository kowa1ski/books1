package com.example.android.books1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link BooksAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Books} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class BooksAdapter extends ArrayAdapter<Books> {

    /**
     * Constructs a new {@link BooksAdapter}.
     *
     * @param context   of the app
     * @param booksList is the list of books, which is the data source of the adapter
     */
    public BooksAdapter(Context context, List<Books> booksList) {
        super(context, 0, booksList);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }

        // Find the book at the given position in the list
        Books currentBook = getItem(position);

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        String authorName = currentBook.getAuthor();
        // Display the author
        authorView.setText(authorName);

        // Find the TextView with view ID title information
        TextView titleInformationView = (TextView) listItemView.findViewById(R.id.titleInformation);
        String titleInformationPlus = currentBook.getTitleInformation();
        // Display the title information
        titleInformationView.setText(titleInformationPlus);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
