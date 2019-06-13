package fen.code.architect.module.callback;

public interface ServerCallback {

    void onSuccess(String response);

    void onFailed(Error error);
}
