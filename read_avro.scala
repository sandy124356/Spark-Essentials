import org.apache.spark._
import org.apache.spark.sql._
object read_avro {

  def main(args:Array[String]): Unit =
  {


    val sc= new SparkConf().setAppName("avro-read").set("spark.sql.avro.compression.codec","xz")

    val spark=SparkSession.builder().master("local[*]").config(sc).getOrCreate()

    val source= spark.read.format("avro").load("D:\\spark-output\\cassandra-avro")

    source.show()


    source.write.format("avro").mode("overwrite").save("D:\\spark-output\\cassandra-avrooutuncompressed")



  }

}
