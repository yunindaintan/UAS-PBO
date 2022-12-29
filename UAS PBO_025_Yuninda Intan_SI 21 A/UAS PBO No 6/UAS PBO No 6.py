class Books():
    def __init__(self):
        self.books = {}
        self.number = 0

    def add_book(self, book):
        self.number += 1
        self.books[self.number] = book

    def __str__(self):
        return str(self.books)

b = Books()
b.add_book("Buku A")
b.add_book("Buku B")
print(f"Buku yang telah ku baca adalah: {b}")