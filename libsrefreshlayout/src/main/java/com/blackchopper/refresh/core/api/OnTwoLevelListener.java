package com.blackchopper.refresh.core.api;

import android.support.annotation.NonNull;

/**
 * author  : Black Chopper
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/BlackChopper
 * project : RefreshLayout
 * desc    : 二级刷新监听器
 */
public interface OnTwoLevelListener {
    /**
     * 二级刷新触发
     * @param refreshLayout 刷新布局
     * @return true 将会展开二楼状态 false 关闭刷新
     */
    boolean onTwoLevel(@NonNull Refresh refreshLayout);
}