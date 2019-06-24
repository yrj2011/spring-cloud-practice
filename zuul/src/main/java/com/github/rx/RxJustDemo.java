package com.github.rx;

import rx.Observable;
import rx.Observer;
import rx.Subscription;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述: rxJava Demo
 *
 * @Author: 杨仁将
 * @Date: 2019/6/24 8:49
 * Version: 1.0
 */
public class RxJustDemo {

    public static void main(String [] args){

        Observable<String> observableString = Observable.just(helloWorld());

        Subscription subscriptionPrint = observableString.subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no! Something wrong happened!");
            }

            @Override
            public void onNext(String message) {
                System.out.println(message);
            }
        });
    }

    private static String helloWorld(){
        return "Hello World";
    }
}       
