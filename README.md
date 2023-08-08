## Использование API ключа

API ключ используется для обеспечения безопасности доступа к REST API. Вы должны передать ключ в заголовке `X-API-KEY` для каждого запроса.

Пример использования ключа в заголовке: X-API-KEY: SHREK

## Доступные эндпойнты

- `POST /create`: Создать новый справочник.
- `GET /getAll`: Получить список всех справочников.
- `GET /getFields/{id}`: Получить список полей справочника по ID.
- `DELETE /delete/{id}`: Удалить справочник по ID.
- `PUT /add-data`: Добавить данные в справочник.
- `GET /find/{id}`: Найти справочник по ID.
- `DELETE /deleteData/{id}/{dataId}`: Удалить данные из справочника.
- `PUT /update`: Обновить данные в справочнике.

## Заметки

Пожалуйста, убедитесь, что вы передаете корректный API ключ в заголовке `X-API-KEY` при использовании этих эндпойнтов.

---
Автор: Amir Dikhanbayev