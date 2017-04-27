package com.example.android.books1;

/**
 * An {@link Books} object contains information of author and title information.
 */

public class Books {

    /** Information about author */
    private String mAuthor;

    /** Information about title */
    private String mTitleInformation;

    /** Website URL of the book */
    private String mUrl;

    /**
     * Constructs a new {@link Books} object.
     *
     * @param author is author of the book
     * @param titleInformation is the title information
     * @param url is the website URL to find more details about the book
     */
    public Books(String author, String titleInformation, String url) {
        mAuthor = author;
        mTitleInformation = titleInformation;
        mUrl = url;
    }

    /**
     * Returns author.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns title information.
     */
    public String getTitleInformation() {
        return mTitleInformation;
    }

    /**
     * Returns the website URL to find more information about the book.
     */
    public String getUrl() {
        return mUrl;
    }
}
