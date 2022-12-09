# SWLab-5
Reza Erfan Arani - 98105919 - Software Lab #5 - Creational design patterns

## implementation Process
### Abstract Factory
برای این کار من نخست کلاس تست را طبق روش TDD پیاده‌سازی کردم. با گرفتن clientمان که همان `AbstractFactoryClient` است و فکتوری کلیمان که همان `GardenFactory` است دو تست برای آن‌ها پیاده سازی شده است. 
<br> 
اولین تست برای ساخت باغ ژاپنی و دومین تست برای ساخت باغ ایرانی است. بعد از نوشتن اجزای تست و مطمئن بودن از نبود اشکال در نوشتن تست‌ها به سراغ ساختن کلاس‌های اصلی رفتم. برای این که مطمئن باشید اول تست‌ها نوشته شده قبل از رفتن سراغ برنامه اصلی تست‌ها را کامیت کردم.
<br>
در برنامه اصلی نخست در پکیج‌خای `Flowers` و `Trees` شروع به ساخت interface اصلی آن‌ها و ساختن نوع گل خاص و درخت آن‌ها کردم. این گیاهان فعلا تنها کاری که می‌کنند پس دادن اسمشان است. سسپس در پکیج `Factories` یک interface از factory کلی ساختم به اسم `GardenFactory` که یک `Tree` و یک `Flower` در خود دارد. در دو کلاس `JapaneseGardenFactory` و `PersianGardenFactory` نیز به طور خاص گل‌ها و درخت‌های مربوط به اون کشور را می‌سازیم. 
<br>
در آخر با ساختن clientمان به اسم `AbstractFactoryClient` یک فکتوری در آن میگیریم و درخت و گل مربوطه را خود آن فکتوری می‌سازد که ما می‌توانیم اظلاعات گل و درخت ساخته شده را از همین کلاینت دریافت کنیم. می‌بینیم که تست‌هایمان پاس شده و درست کار می‌کند.
### Builder
