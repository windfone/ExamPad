package com.xjhsk.exampad.ui.exam.contract;

import com.weidingqiang.rxfiflibrary2.base.BasePresenter;
import com.weidingqiang.rxfiflibrary2.base.BaseView;

/**
 * 作者：weidingqiang on 2018/1/12 14:52
 * 邮箱：dqwei@iflytek.com
 */

public interface EJudgePicContract {

    interface View extends BaseView {
        void progessFinish();
    }

    interface Presenter extends BasePresenter<View> {

    }
}
