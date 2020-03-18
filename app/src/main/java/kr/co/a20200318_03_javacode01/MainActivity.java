package kr.co.a20200318_03_javacode01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//알트 엔터 에러줄에서
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1) 이벤트 설정
//        2) 초기화면 값 세팅 .setText 등
//        +main함수는 가능한한 작은 코드만 남기자.
//        => onCreate메쏘드도 가능한 깔끔하게 정리
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        
    }

    @Override
    public void setValues() {

    }
}
