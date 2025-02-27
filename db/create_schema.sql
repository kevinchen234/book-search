-- We are using PostgreSQL 17.4
-- CSV Header is below
-- book_id,title,author,rating,description,language,isbn,bookFormat,edition,pages,publisher,publishDate,firstPublishDate,likedPercent,price

-- Create the books table
Create table books (
    book_id serial primary key,
    title varchar(255) not null,
    rating float not null,
    description text not null,
    language varchar(255) not null,
    isbn varchar(255) not null,
    book_format varchar(255) not null,
    edition varchar(255) not null,
    pages int not null,
    publisher varchar(255) not null,
    publish_date date not null,
    first_publish_date date not null,
    liked_percent float not null,
    price float not null
);

-- Create the authors table
Create table authors (
    author_id serial primary key,
    name varchar(255) not null
);

-- Create the books_authors table
Create table books_authors (
    book_id int not null,
    author_id int not null,
    primary key (book_id, author_id),
    foreign key (book_id) references books (book_id),
    foreign key (author_id) references authors (author_id)
);
