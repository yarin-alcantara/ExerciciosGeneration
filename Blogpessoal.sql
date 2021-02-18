USE blog_pessoal;
alter table postagem drop column DATA;
SELECT * FROM blog_pessoal.postagem;

INSERT INTO	blog_pessoal.postagem(DATE,TEXTO,TITULO)
VALUES('2021-02-16 09:00:10.000','Roma é linda','Roma-Italia');