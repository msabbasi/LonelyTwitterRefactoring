package ca.ualberta.cs.lonelytweet;

import java.util.Date;

import android.util.Log;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		Log.i("To String!", string);
		return string;
	}

	public String getTweetBody() {
		return tweetBody.toUpperCase();
	}
}