####Channels
Seperti kita ketahui, sebuah program dapat memiliki banyak thread dan dalam beberapa thread bisa terdapat jutaan coroutines. Lalu, bagaimana jika ada 2 (dua) coroutines yang saling ingin berinteraksi satu sama lain? Channels adalah jawabnya.

#### Apa itu Channels
Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine
Pada dasarnya, channels sangat mirip dengan BlockingQueue.

 #### Kesimpulan
 Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent. Ia membuat kode concurrent dapat berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan. 
