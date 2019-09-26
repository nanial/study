package com.finalTask.noteBook;

//Блокнот. Разработать консольное приложение, работающее с Заметками
//в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).+
//Общие пояснения к практическому заданию.
//• В начале работы приложения данные должны считываться из файла, в конце
//работы – сохраняться в файл.+
//• У пользователя должна быть возможность найти запись по любому параметру+
//или по группе параметров (группу параметров можно определить самостоятельно),+
// получить требуемые записи в отсортированном виде,
// найти записи, текстовое поле которой содержит определенное слово,+
// а также добавить новую запись.+
//• Особое условие: поиск, сравнение и валидацию вводимой информации
//осуществлять с использованием регулярных выражений.
//• Особое условие: проверку введенной информации на валидность должен
//осуществлять код, непосредственно добавляющий информацию.

import com.finalTask.noteBook.apiBusiness.NotebookManager;
import com.finalTask.noteBook.apiDao.NotebookDao;
import com.finalTask.noteBook.business.NotebookBuilderFactory;
import com.finalTask.noteBook.business.NotebookManagerImpl;
import com.finalTask.noteBook.dao.NotebookDaoImpl;
import com.finalTask.noteBook.domain.Notebook;
import com.finalTask.noteBook.filter.Filter;


public class Main {

    public static void main(String[] args) throws NullPointerException{

        Notebook not = new NotebookBuilderFactory().getNotebookBuilder().getNotebook();
        NotebookDao nd = new NotebookDaoImpl();
        NotebookManager nm = new NotebookManagerImpl(nd);
        nm.writeInFileNote(not.addNoteInList());
        System.out.println(nm.getListNote(new Filter("forget")));
    }
}
