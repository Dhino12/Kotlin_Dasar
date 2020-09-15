####Coroutine Dispatcher
 Tentunya kita harus mengetahui thread mana yang akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine. Untuk menentukannya kita membutuhkan sebuah base class bernama CoroutineDispatcher
 
 * `Dispatcher.Default` Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async, dll jika tidak ada dispatcher lain yang ditentukan
 * `Dispatcher.IO` Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O. Ia akan menggunakan kumpulan thread yang dibuat berdasarkan permintaan
 * `Dispatcher.Unconfined` Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan. Setelah penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
 * `Single Thread Context`  Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan 
 * `Thread Pool` Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan juga menentukan bagaimana proses distribusi bebannya.