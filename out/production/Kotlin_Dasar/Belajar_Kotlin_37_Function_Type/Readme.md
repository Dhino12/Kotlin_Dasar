#####Scope Function
Kotlin standard library memiliki beberapa fungsi yang tujuan utamanya
adalah bagaimana menuliskan logika kode di dalam konteks dari sebuah objek.
Fungsi inilah yang dinamakan sebagai scope function. Beberapa fungsi 
yang berada di dalamnya antara lain, `let`, `run`, `with`, `apply`, dan `also`. 
Pada dasarnya beberapa fungsi tersebut melakukan tugas yang sama 
yaitu mengeksekusi blok kode dari dalam sebuah objek. 
Yang membedakannya adalah bagaimana objek tersebut tersedia dan 
seperti apa hasil yang didapat dari seluruh expression yang 
berada di dalam blok.

#####Context Object
Sebelum kita mengulas beberapa fungsi yang menjadi bagian dari 
scope function di atas, kita perlu mengetahui terlebih 
dahulu bagaimana cara mengakses konteks sebuah objek dari dalam 
lambda yang menjadi bagian dari scope function. 
Terdapat 2 (dua) cara, yaitu: diakses sebagai lambda receiver (this) 
dan lambda argumen (it). 
Keduanya memiliki kapabilitas yang sama dan tentunya digunakan 
untuk kasus yang berbeda.
