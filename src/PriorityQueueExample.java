import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Agregar elementos a la PriorityQueue
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(50);
        priorityQueue.add(42);
        priorityQueue.add(95);
        priorityQueue.add(102);
        priorityQueue.add(107);
        priorityQueue.add(28);

        // Imprimir el contenido de la PriorityQueue
        System.out.println("Contenido de PriorityQueue: " + priorityQueue);

        // Verificar el elemento más pequeño sin eliminarlo
        System.out.println("Elemento más pequeño sin eliminar: " + priorityQueue.peek());

        // Eliminar el elemento más pequeño
        System.out.println("Elemento más pequeño eliminado: " + priorityQueue.poll());
        System.out.println("Contenido de PriorityQueue después de eliminar el elemento más pequeño: " + priorityQueue);

        // Verificar el tamaño de la PriorityQueue
        System.out.println("Tamaño de PriorityQueue: " + priorityQueue.size());

        // Limpiar la PriorityQueue
        priorityQueue.clear();
        System.out.println("Contenido de PriorityQueue después de limpiar: " + priorityQueue);
    }
}