package org.example;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

public class Launcher {
    private static int start = 1;
    private static int count = 5;
    private static final CompositeDisposable COMPOSITE_DISPOSABLE = new CompositeDisposable();
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
/*    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon");
        source.subscribe(s -> System.out.println("Observer 1 received: " + s));
        source.map(String::length)
                .filter(integer -> integer >= 5)
                .subscribe(s -> System.out.println("Observer 2 received:" + s));
    }*/
/*    public static void main(String[] args) {
        ConnectableObservable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon")
                .publish();
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        source.map(String::length)
                .subscribe(integer -> System.out.println("Observer 2: " + integer));

        source.connect();
    }*/
/*    public static void main(String[] args) {
        Observable.range(5, 10)
                .subscribe(integer -> System.out.println("Received :" + integer));
    }*/
/*    public static void main(String[] args) {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(aLong -> System.out.println(aLong+ " Misssssss"));
        sleep(5000);
    }*/
/*    public static void main(String[] args) {
        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        seconds.subscribe(aLong -> System.out.println("Observer 1 :" + aLong));
        sleep(5000);
        seconds.subscribe(aLong -> System.out.println("Observer 2: " + aLong));
        sleep(5000);
    }*/
/*    public static void main(String[] args) {
        ConnectableObservable seconds = Observable.interval(1, TimeUnit.SECONDS)
                .publish();
        seconds.subscribe(o -> System.out.println("Observer 1: " + o));
        seconds.connect();
        sleep(5000);
        seconds.subscribe(o -> System.out.println("Observer 2: " + o));
        seconds.connect();
        sleep(5000);

    }*/
/*    public static void main(String[] args) {
        Observable<String> empty= Observable.empty();
        empty.subscribe(System.out::println,
                Throwable::printStackTrace,
                ()-> System.out.println("Done!"));
    }*/
/*    public static void main(String[] args) {
        Observable<String> observable= Observable.never();
        observable.subscribe(System.out::println,
                Throwable::printStackTrace,
                ()-> System.out.println("Done!"));
        sleep(5000);

    }*/
/*    public static void main(String[] args) {
        Observable.error(new Exception("Crash and burn!"))
                .subscribe(o -> System.out.println("Received: " + o),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!"));
    }*/
/*    public static void main(String[] args) {
        Observable.error(()-> new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!"));
    }*/
/*    public static void main(String[] args) {
        Observable<Integer> source = Observable.range(start, count);
        source.subscribe(integer -> System.out.println("Observer 1: "+ integer));
        count=10;

        source.subscribe(integer -> System.out.println("Observer 2: "+ integer));
    }*/
/*    public static void main(String[] args) {
        Observable<Integer> source = Observable.defer(() -> Observable.range(start, count));
        source.subscribe(integer -> System.out.println("Observer 1: " + integer));
        count = 10;

        source.subscribe(integer -> System.out.println("Observer 2: " + integer));
    }*/
/*    public static void main(String[] args) {
        Observable.just(1 / 0)
                .subscribe(integer -> System.out.println("Received: " + integer),
                        i -> System.out.println("Error Captured: " + i));
    }*/
/*    public static void main(String[] args) {
        Observable.fromCallable(() -> 1 / 0)
                .subscribe(integer -> System.out.println("Received: " + integer),
                        e -> System.out.println("Error captured: " + e));
    }*/
/*    public static void main(String[] args) {
        Single.just("Hello")
                .map(String::length)
                .subscribe(System.out::println,
                        Throwable::printStackTrace);

    }*/
/*    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        source.first("Nill")
                .subscribe(System.out::println);
    }*/
/*    public static void main(String[] args) {
        Maybe<Integer> presentSource = Maybe.just(100);
        presentSource.subscribe(integer -> System.out.println("Process 1 received:" + integer),
                Throwable::printStackTrace,
                () -> System.out.println("Process 1 Done!"));
        Maybe<Integer> emptySource = Maybe.empty();
        emptySource.subscribe(integer -> System.out.println("Process 2 received:" + integer),
                Throwable::printStackTrace,
                () -> System.out.println("Process 2 Done!"));
    }*/
/*    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon");
        source.firstElement().subscribe(s -> System.out.println("Received: " + s),
                Throwable::printStackTrace,
                () -> System.out.println("Done!"));
    }*/
/*    public static void main(String[] args) {
        Completable.fromRunnable(Launcher::runProcess)
                .subscribe(() -> System.out.println("Done!"));
    }*/

    /*    public static void main(String[] args) {
            Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

            Disposable disposable = seconds.subscribe(aLong -> System.out.println("Received 1:" + aLong));

            sleep(5000);
            disposable.dispose();
            sleep(5000);
        }*/
/*    public static void main(String[] args) {
        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS);

        ResourceObserver<Long> myObserver = new ResourceObserver<>() {
            @Override
            public void onNext(Long value) {
                System.out.println(value);
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
        Disposable disposable = source.subscribeWith(myObserver);
    }*/
/*    public static void main(String[] args) {

        Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);
        Disposable disposable1 = seconds.subscribe(aLong -> System.out.println("Received 1:" + aLong));
        Disposable disposable2 = seconds.subscribe(aLong -> System.out.println("Received 2:" + aLong));
        COMPOSITE_DISPOSABLE.addAll(disposable1,disposable2);
        sleep(5000);
        COMPOSITE_DISPOSABLE.dispose();
        sleep(5000);
    }*/

/*    public static void main(String[] args) {
        Observable<Integer> source = Observable.create(observableEmitter -> {
            try {
                for (int i = 0; i < 1000; i++) {
                    while (!observableEmitter.isDisposed()) {
                        observableEmitter.onNext(i);
                    }
                    if (observableEmitter.isDisposed()) return;
                }
            } catch (Throwable throwable) {
                observableEmitter.onError(throwable);
            }

        });
    }*/

    //Operator filter, return a boolean values, if true next step, if false don't next step
/*    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                .filter(s -> s.length() != 5)
                .subscribe(s -> System.out.println("Received: " + s));
    }*/
    public static void main(String[] args) {

    }

    private static void runProcess() {
        //System.out.println("run");
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
