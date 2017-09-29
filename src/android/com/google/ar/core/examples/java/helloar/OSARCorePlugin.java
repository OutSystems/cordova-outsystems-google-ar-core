package com.google.ar.core.examples.java.helloar;

import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

public class OSARCorePlugin extends CordovaPlugin {

	private Context ctx = null;

	@Override
	protected void pluginInitialize() {
		ctx = cordova.getActivity().getBaseContext();
  	}

	@Override
	public boolean execute(final String action, final CordovaArgs args, final CallbackContext callbackContext) throws JSONException {
		Intent intent = new Intent(ctx, HelloArActivity.class);
		ctx.startActivity(intent);
		return true;
	}
}
