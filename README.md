# Neofex Summer Practice 2024
<hr>

## `Task`:
Создать API для работы с сотрудником.
Мы должны иметь возможность добавить нового сотрудника, изменить зарплату сотруднику, изменить его паспортные данные, получить сотрудника по id.

Response карточка сотрудника:
+ name,
+ surname,
+ pasportNumber,
+ pasportDate,
+ salary.

### `Требования:`
+ >Создайте необходимые таблицы для работы с сотрудником, вы сами определяете необходимый набор таблиц и полей в них.
+ >Реализуйте API эндпоинты для добавления нового сотрудника, изменения зарплаты и паспортных данных сотрудника, а
также получения сотрудника по id.

### `Подсказка:`
>Рассмотрите типичные RESTful эндпоинты для реализации каждой из этих функций.
Ответ API должен содержать данные о сотруднике со следующим набором полей
•	name,
•	surname,
•	pasportNumber,
•	pasportDate,
•	salary.

### `Примечание:`
>Предполагается, что изменение зарплаты и изменение паспортных данных будут производиться разными отделами, и может потребовать разделение ответственности в архитектуре приложения.
<hr>

## `Code structure:`

`Controllers` - точки обращеня к API, выполняют минимум задач, обращаются к `сервисам`;\
`DTO` - Data Transfer Object - объекты для передачи данных между клиентом и сервером;\
`Models` - модели, непосредственно используемые на стороне сервера;\
`Repositories` - интерфейсы, позволяющие совершать обращения к БД. В Java с использованием библиотеки JpaRepository, можно использовать ряд автоматически генерируемых интерфейсов, которые автоматически преобразуются в SQL запросы;\
`Services` - основная логика приложения