**Задание**:

Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim). Создать по два класса
наследника Animal, умеющих летать, плавать, бегать. При этом добиться того, чтобы не умеющие летать или плавать, не могли этого сделать. САМОЕ ВАЖНОЕ! В файле readme.md в репозитории гитхаб описать
какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
(если они есть). 

**Какие проблемы я увидела**: 

+ Я подумала, что неправильно определять в базовом классе методы, 
  которые могут оказаться неприменимы к потенциальным наследникам,
  то есть, если мы знаем, что не все животные умеют летать, создавать     
  в классе животных метод **fly()** неверно. 
+ Если мы непременно хотим, чтобы такой метод был, можно добавить в класс 
  Animal поле-множество "Способы передвижения", куда положить все доступные 
  для данного вида животного способы передвижения. При этом, конечно, должно 
  также быть поле "Вид животного". В этом случае в теле методов goes, flies, 
  swims и т.п. должна производиться проверка, содержится ли соответствующий 
  способ передвижения во множестве MobilityMethods, и, если он отсутствует,
  выдавать сообщение об ошибке или просто не делать никаких действий. 
+ Если же мы делаем методы **goes, flies, swims** безусловными (то есть, любое 
  животное наделяем изначально способностью передвигаться любым из этих способов), 
  то, чтобы у нас птицы не ползали, а змеи не летали, придется для неприменимых к 
  данному классу методов писать их переопределения (либо заглушки, либо сообщения 
  об ошибке, либо информационные сообщения). А это приводит к раздуванию кода и 
  нарушению принципа DON'T REPEAT YOURSELF.

**Какие еще возникли вопросы по ходу выполнения ДЗ:**

1. Мне непонятно, почему мы метод main всегда объявляем как __*static*__, 
и как это соотносится с тезисом, что "в статических методах мы можем 
использовать только статические методы и переменные(константы)". 
2. Мне непонятно, для чего предназначен модификатор доступа __*protected*__.  
