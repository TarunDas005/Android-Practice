package com.example.jannat.imageuploaderdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Uri outputCaptureUri;
    private static final int CAPTURE_PHOTO = 1;
    int statusCode = 0;
    public static final int SUCCESS = 1;
    public static final int FAILURE = 0;
    public static final String Upload_Url = "http://192.168.0.100/online_library/uploadCover.php";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void capture(View view) {
        File file = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");
        outputCaptureUri = Uri.fromFile(file);
        Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        captureIntent.putExtra(MediaStore.EXTRA_OUTPUT, outputCaptureUri);
        startActivityForResult(captureIntent, CAPTURE_PHOTO);
    }

    public void uploadphoto(View view) {
        new UploadThread().start();
    }

    class UploadThread extends Thread {
        @Override
        public void run() {
            if (outputCaptureUri != null) {
                // image file to bitmap
                BitmapFactory.Options op = new BitmapFactory.Options();
                op.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap bmp = BitmapFactory.decodeFile(outputCaptureUri.getPath(), op);

                // bitmap to bytearrayoutputstream

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.JPEG, 90, baos);

                //bytearrayoutputstream to byte[]

                byte[] ba = baos.toByteArray();

                //byte[] to base64 encoded string
                final String ba1 = Base64.encodeBytes(ba);

                //Post server

                StringRequest stringRequest = new StringRequest(Request.Method.POST, Upload_Url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                if (statusCode == 200) {
                                    handler.sendEmptyMessage(SUCCESS);
                                } else {
                                    handler.sendEmptyMessage(FAILURE);
                                }

                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                handler.sendEmptyMessage(FAILURE);
                            }
                        }) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("image", ba1);
                        return params;
                    }

                    @Override
                    protected Response<String> parseNetworkResponse(NetworkResponse response) {
                        statusCode = response.statusCode;
                        return super.parseNetworkResponse(response);
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        }
}


Handler handler = new Handler() {
    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case SUCCESS:

                Toast.makeText(getApplicationContext(),
                        "Insert successfully", Toast.LENGTH_LONG).show();

                break;
            case FAILURE:
                Toast.makeText(getApplicationContext(), "error",
                        Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
};

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAPTURE_PHOTO) {
            if (resultCode == RESULT_OK) {
                BitmapFactory.Options ops = new BitmapFactory.Options();
                ops.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(outputCaptureUri.getPath(), ops);
                int imgW = ops.outWidth;
                int imgH = ops.outHeight;
                int scaleFactor = Math.min(imgW / 320, imgH / 240);

                ops.inJustDecodeBounds = false;
                ops.inSampleSize = scaleFactor;
                //ops.inPurgeable = true;

                Bitmap bmp = BitmapFactory.decodeFile(
                        outputCaptureUri.getPath(), ops);
                imageView.setImageBitmap(bmp);
            } else {

            }
        } else {

        }
    }
}
