package todolist

class ToDoList {
    private val taskList = mutableListOf<Task>();

    fun addTask(newtask: Task) {
        taskList.add(newtask)
        println("Добавлена новая задача: ${newtask.name}")
    }

    fun printTask() {
        for (num in 0 until taskList.size) {
            println("Задача под номером ${num + 1} ${taskList[num].name} до ${taskList[num].deadline} с содержанием ${taskList[num].description}")
        }
    }

    fun deleteTask(task: Task) {
        taskList.remove(task)
        println("Удалена задача: ${task.name}")
    }

}