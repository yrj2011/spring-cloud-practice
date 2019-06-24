package com.github.rx;

import rx.Observer;
import rx.Subscription;
import rx.subjects.PublishSubject;

/**
 * 功能描述: rxJava Demo
 *
 * @Author: 杨仁将
 * @Date: 2019/6/24 8:49
 * Version: 1.0
 */
public class RxSubjectDemo {

    public static void main(String [] args){

        PublishSubject<String> stringPublishSubject = PublishSubject.create();
        Subscription subscriptionPrint = stringPublishSubject.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no!Something wrong happened!");
            }

            @Override
            public void onNext(String message) {
                System.out.println(message);
            }
        });
        stringPublishSubject.onNext("Hello World");
    }
}       
