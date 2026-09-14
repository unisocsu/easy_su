```java
package kernel.unisocsu.easysu;

import android.app.Activity;
import android.os.Bundle;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.IOException;

public class MainActivity extends Activity {
	private Button checkButton;
	private TextView deviceInfoText;
	private Button runButton;
	private Button showPropButton;
	private String deviceInfo;
	@Override
protected  void onCreate (Bundle x) {
	super.onCreate(x);
	//שימו לב הbundle שונה לx בכוונה
	 setContentView (R.layout.activity_main);
	 checkButton = findViewById (R.id.checkbutton);
	 showPropButton = findViewById (R.id.showPropButton);
	 runButton = findViewById (R.id.runButton);
	 deviceInfoText = findViewById(R.id.deviceInfoText);
	 checkButton.setOnClickListener (new View.OnClickListener(){
		 @Override
	 public void onClick (View v){
		 checkDevice();
	 }
	 }
	 );
}
private void checkDevice () {
	String chipinfo = Build.HARDWARE;
	String androidVersion = Build.VERSION.RELEASE;
	int apiVersion = Build.VERSION.SDK_INT;
	try {
		Process process = Runtime.getRuntime().exec("getprop");