package fen.code.architect.module.callback;

public interface RetrofitServerCallback {

    void onSuccess(String response);

    void onFailed(String response);

    void onFailure(Throwable throwable);
}
