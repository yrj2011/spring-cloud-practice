package com.github.rx;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
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
public class RxFromDemo {

    public static void main(String [] args){

        List<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(10);
        items.add(100);
        items.add(200);

        Observable<Integer> observableString = Observable.from(items);
        observableString.subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Observable completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Oh,no! Something wrong happened！");
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("Item is " + item);
            }
        });
    }
}       
