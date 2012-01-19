package test.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebKitSampleExampleActivity extends Activity {

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle); 
        //实例化WebView对象 
        WebView webview = new WebView(this); 
        //设置WebView属性，能够执行Javascript脚本 
        webview.getSettings().setJavaScriptEnabled(true); 
        //加载需要显示的网页 
        webview.loadUrl("http://www.baidu.com/"); 
        //设置Web视图 
        setContentView(webview); 
	}
}