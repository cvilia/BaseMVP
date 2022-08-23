package com.cvilia.basemvp;

public interface IView {
    /**
     * 加载
     */
    void loading();

    /**
     * 加载结束
     */
    void dismissLoading();
}
