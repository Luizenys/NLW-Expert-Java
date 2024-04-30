INSERT INTO questions (id, description, technology) VALUES
('ad63c668-0c8f-47c7-8e8d-abbc014b6177', 'Como criar uma classe em Java?', 'JAVA'),
('c2adc2c5-dce5-4ebb-a22d-22e034b8079c', 'Explique o conceito de polimorfismo em Java.', 'JAVA'),
('b5059b35-7c4f-4d5e-9a41-a0d4ea61fc1f', 'Como lidar com exceções em Java?', 'JAVA');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('4908b53e-c54a-41cf-8859-8767f8f963e3','ad63c668-0c8f-47c7-8e8d-abbc014b6177', true, 'Usando a palavra-chave "class"'),
('26caff90-f76f-466d-a840-8021d93fdd72','ad63c668-0c8f-47c7-8e8d-abbc014b6177', false, 'Definindo uma interface em Java'),
('41574223-0b82-4b35-9abd-24fe73c35015','ad63c668-0c8f-47c7-8e8d-abbc014b6177', false, 'Utilizando métodos estáticos'),
('d4003629-3c5b-4684-9eb8-9e91d99b475a','ad63c668-0c8f-47c7-8e8d-abbc014b6177', false, 'Criando um construtor padrão');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('5c64a61d-5462-416c-a541-b1416d810e4a','c2adc2c5-dce5-4ebb-a22d-22e034b8079c', false, 'Herança simples'),
('1e37c781-0242-432d-9462-fd61c9004576','c2adc2c5-dce5-4ebb-a22d-22e034b8079c', false, 'Encapsulamento em Java'),
('9058ada4-c923-474f-820b-0a64fd791e13','c2adc2c5-dce5-4ebb-a22d-22e034b8079c', false, 'Sobrecarga de métodos'),
('72ccd478-c7e8-4102-9c98-ef5311e19832','c2adc2c5-dce5-4ebb-a22d-22e034b8079c', true, 'Capacidade de um objeto de assumir várias formas');

INSERT INTO alternatives (id, question_id, is_correct, description) VALUES
('e37cfc01-db57-4207-9972-100cbcf19de1','b5059b35-7c4f-4d5e-9a41-a0d4ea61fc1f', false, 'Ignorando a exceção'),
('1e61c095-9ffc-430d-adef-565c8ff248fd','b5059b35-7c4f-4d5e-9a41-a0d4ea61fc1f', true, 'Utilizando blocos try-catch'),
('49dbc465-41b3-44c8-9235-cecb48716b53','b5059b35-7c4f-4d5e-9a41-a0d4ea61fc1f', false, 'Declarando uma exceção sem tratamento'),
('25c66bb9-fdc9-43e3-aa66-36f20a53d9d6','b5059b35-7c4f-4d5e-9a41-a0d4ea61fc1f', false, 'Usando a palavra-chave "finally"');