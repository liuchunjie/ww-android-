package test.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebKitSampleExampleActivity extends Activity {

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle); 
        //ʵ����WebView���� 
        WebView webview = new WebView(this); 
        //����WebView���ԣ��ܹ�ִ��Javascript�ű� 
        webview.getSettings().setJavaScriptEnabled(true); 
        //������Ҫ��ʾ����ҳ 
        webview.loadUrl("http://www.baidu.com/"); 
        //����Web��ͼ 
        setContentView(webview); 
	}
}