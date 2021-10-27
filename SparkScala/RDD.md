Drops first RDD value
```scala
rdd.mapPartitionsWithIndex{(idx,value) => if(idx==0) value.drop(1) else value}.collect
```

```scala
val firstrecord = rdd.first
rdd.filter(x =>!x.contains(firstrecord)).collect
```