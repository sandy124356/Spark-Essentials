
Objects:

read-avro: Explains how to configure different compression codecs for avro files and how to read/write avro files usin spark.
          (avro supported compression codecs in spark.. 

          The value of spark.sql.avro.compression.codec should be one of 
          bzip2, 
          deflate, 
          uncompressed, 
          xz, 
          snappy

          )
          
          Similarly for parquet: snappy, gzip, and lzo).
                                spark.sql.parquet.compression.codec
                              

          Remember all codecs are in small case. Upper case will error out
          Make sure you add Maven repository dependencies.
           <!-- https://mvnrepository.com/artifact/org.apache.spark/spark-avro -->
        <dependency>
            <groupId>org.apache.spark</groupId>
            <artifactId>spark-avro_2.11</artifactId>
            <version>2.4.4</version>
        </dependency>
