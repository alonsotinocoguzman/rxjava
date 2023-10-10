package org.example;

import io.reactivex.Observable;

public class Launcher {
/*    public static void main(String[] args) {
        Observable<Long> secondIntervals =
                Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(System.out::println);
        sleep(5000);
    }*/

    /*    public static void main(String[] args) {
            Observable<String> stringObservable = Observable.create(observableEmitter -> {
                observableEmitter.onNext("Alpha");
                observableEmitter.onNext("Beta");
                observableEmitter.onNext("Gamma");
                observableEmitter.onNext("Delta");
                observableEmitter.onNext("Epsilon");
            });
            stringObservable.subscribe(s -> System.out.println("RECEIVED: " + +s));
        }*/
/*    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.create(observableEmitter -> {
            try {
                observableEmitter.onNext("Alpha");
                observableEmitter.onNext("Beta");
                observableEmitter.onNext("Gamma");
                observableEmitter.onNext("Delta");
                observableEmitter.onNext("Epsilon");
            } catch (Throwable throwable) {
                observableEmitter.onError(throwable);
            }
        });
        stringObservable.subscribe(s -> System.out.println("RECEIVED: " + s), Throwable::printStackTrace);
    }*/
/*    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.create(observableEmitter -> {
            try {
                observableEmitter.onNext("Alpha");
                observableEmitter.onNext("Beta");
                observableEmitter.onNext("Gamma");
                observableEmitter.onNext("Delta");
                observableEmitter.onNext("Epsilon");
            } catch (Throwable throwable) {
                observableEmitter.onError(throwable);
            }
        });
        Observable<Integer> integerObservable = stringObservable.map(String::length);
        Observable<Integer> filter = integerObservable.filter(integer -> integer >= 5);
        filter.subscribe(s -> System.out.println("RECEIVED: " + s));
    }*/
/*    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.create(observableEmitter -> {
            try {
                observableEmitter.onNext("Alpha");
                observableEmitter.onNext("Beta");
                observableEmitter.onNext("Gamma");
                observableEmitter.onNext("Delta");
                observableEmitter.onNext("Epsilon");
            } catch (Throwable throwable) {
                observableEmitter.onError(throwable);
            }
        });
        stringObservable.map(String::length).filter(i -> i >= 5).subscribe(System.out::println);
    }*/
/*    public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");
        stringObservable.map(String::length).filter(i -> i >= 5).subscribe(System.out::println);
    }*/
/*    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<String> stringObservable = Observable.fromIterable(stringList);
        stringObservable
                .map(String::length)
                .filter(i -> i >= 5)
                .subscribe(System.out::println);
    }*/
  /*  public static void main(String[] args) {
        Observable<String> stringObservable = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observer<Integer> integerObservable = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("RECEIVED: " + integer);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done!");
            }
        };
        stringObservable.map(String::length).filter(i -> i <= 5)
                .subscribe(integerObservable);
    }*/
/*    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(integer -> System.out.println("RECEIVED: " + integer),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!!!!!"));
    }*/
/*    public static void main(String[] args) {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(integer -> System.out.println("RECEIVED: " + integer),
                        Throwable::printStackTrace);
    }*/
/*    public static void main(String[] args) {
        Observable<String> source= Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon");
        source.subscribe(s-> System.out.println("Observer 1 received: " + s));
        source.subscribe(s-> System.out.println("Observer 2 received: " + s));
    }*/
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon");
        source.subscribe(s -> System.out.println("Observer 1 received: " + s));
        source.map(String::length)
                .filter(integer -> integer >= 5)
                .subscribe(s -> System.out.println("Observer 2 received:" + s));
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
