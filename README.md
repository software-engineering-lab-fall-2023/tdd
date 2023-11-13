<div dir="rtl">

# سوال اول

خیر، آزمون نرم‌افزار پس از پیاده‌سازی و توسعه تناقضی با روش TDD ندارد. در واقع، TDD یک روش توسعه نرم‌افزار است که شامل نوشتن تست‌های واحد (unit tests) قبل از پیاده‌سازی کد برنامه می‌شود. این تست‌ها به عنوان یک سازوکار اطمینان از صحت و عملکرد صحیح کد در طول توسعه محسوب می‌شوند.

در TDD، مراحل اصلی به شرح زیر هستند:

نوشتن تست (Test): نوشتن تست واحد که یک ویژگی یا عملکرد خاص را مشخص کند. این تست در ابتدا نباید اجرا شود (به عبارت دیگر، باید شکست بخورد).

پیاده‌سازی (Code Implementation): نوشتن کد مورد نیاز برای اجرای تست با موفقیت و رفع خطاهای احتمالی.

اجرای تست (Run Test): اجرای تست برای اطمینان از صحت کد نوشته شده و تضمین اینکه تغییرات جدید مشکلی ایجاد نکرده‌اند.

این چرخه به صورت مکرر تکرار می‌شود و به تدریج کلیهٔ ویژگی‌ها و اجزای نرم‌افزار توسط تست‌های واحد پوشش داده می‌شوند. بنابراین، این روش باعث افزایش اطمینان از کیفیت کد، اصلاح سریع خطاها، و افزایش قابلیت اطمینان نرم‌افزار می‌شود.

در اصل این هدف دو مدل تست نویسی است که تفاوت را ایجاد میکند. در unit test هدف اصلی بررسی عملکرد صحیح کد بعد از پیاده سازی و داشتن تست هایی است که در گذر زمان و با تغییر کد بخش های مختلف اطمینان یابد که کد هنوز عملکرد مورد نظر را داراست اما در tdd هدف آن است که نیازمندی های پروژه در تست ها مشخص شده و سپس کد هایی را بزنیم که با حداقل تلاش نتیجه مورد نظر را محقق میسازند.
# سوال دوم

# سوال سوم
 
خیر همه انواع آزمون نرم افزار بر عهده برنامه نویس نیست بلکه توسط یک تیم از QA ها یا tester ها انجام میشود.
این تیم میتواند شامل برنامه نویسان، تست کاران، مهندسان امنیت، مدیران پروژه و سایر اعضای تیم توسعه باشد.

# سوال چهارم

در گام طراحی باید این اصول را در نظر بگیریم تا ساختاری که در نظر داریم از این اصول پیروی کنند مثلا در طراحی کلاس ها single responsibility را در نظر بگیریم.

در گام پیاده سازی هم باید این اصول را در نظر داشته باشیم تا کد ما بخشی از آنها را نقض نکند مثلا پیاده سازی ما باید به گونه ای باشد تا قابلیت open closed را پشتیبانی کند.


# سوال پنجم

از نظر ساختار کد در این مرحله امکان این کار وجود داشت زیرا هنگام ساخت مربع اضلاع مشخص می‌شدند و دیگر نیازی به تغییر که باعث ایجاد مشکل است نبود. ولی از نظر اصول SOLID این کار درست نیست زیر طبق اصل Liskov Substitution باید بتوان از یک شی کلاس فرزند به جای شی کلاس پدر استفاده کرد در حالی که امکان استفاده از مربع به عنوان مستطیل وجود ندارد. دلیل این موضوع این است که برای مثال در مستطیل ما ۲ طول برای اضلاع داریم ولی مربع فقط یک طول دارد و این موضوع باعث می‌شود یک متغیر بی معنی در کلاس مستطیل داشته باشیم و در نتیجه نمی‌توان به جای شی از کلاس مستطیل، از مربع استفاده کرد.
</div>