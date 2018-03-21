layout 'layout.tpl',title:'hello',
maincontent:contents{
  yield "jooooo"
  table{
   tr{
     td "书名"
     td "价格"
     }
   for(book in books)
   {
     tr{
     td book.bookname
     td book.price
     }
   }
  }
}