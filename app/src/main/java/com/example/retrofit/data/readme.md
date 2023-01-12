this contains data source
local: like database and dao - utils which it converter classes and of course DataStore also
remote: like api

also it contains repository class witch will apply repository interface that will contains all
requirements for applying data source logic

finally contains workers classes.

documentation:

    Data layer
    The data layer of an app contains the business logic. The business logic is what gives value to
        your app—it's made of rules that determine how your app creates, stores, and changes data.
    The data layer is made of repositories that each can contain zero to many data sources. 
        You should create a repository class for each different type of data you handle in your app.
        For example, you might create a MoviesRepository class for data related to movies, 
        or a PaymentsRepository class for data related to payments.
    ---------------------------------------------------------------
Repository classes are responsible for the following tasks:

    - Exposing data to the rest of the app.
    - Centralizing changes to the data.
    - Resolving conflicts between multiple data sources.
    - Abstracting sources of data from the rest of the app.
    - Containing business logic.

Each data source class should have the responsibility of working with only one source of data,
    which can be a file, a network source, or a local database. Data source classes are the bridge
    between the application and the system for data operations.