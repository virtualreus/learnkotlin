package todolist

fun main() {
    val task1 = Task("Магаз", "сегодня вечером", "авававаав")
    val task2 = Task("трунять", "завтпа", "ЛТААПТАПОПА")
    val task3 = Task("чиллить", "послезавтра", "234234234234")

    val todolist = ToDoList();
    todolist.addTask(task1)
    todolist.addTask(task2)
    todolist.addTask(task3)
    todolist.printTask()
    todolist.deleteTask(task2)
    todolist.printTask()
}

