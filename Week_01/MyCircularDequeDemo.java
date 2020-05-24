package com.datastructure.algorithm.week01;

/**
 * 设计实现双端队列:注意是先进先出
 */
public class MyCircularDequeDemo {
    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(3);     // 设置容量大小为3
        boolean b = circularDeque.insertLast(1);// 返回 true
        boolean b1 = circularDeque.insertLast(2);// 返回 true
        boolean b2 = circularDeque.insertFront(3);// 返回 true
        boolean b3 = circularDeque.insertFront(4);// 已经满了，返回 false
        int rear = circularDeque.getRear();// 返回 2
        boolean b4 = circularDeque.isFull();// 返回 true
        boolean b5 = circularDeque.deleteLast();// 返回 true
        boolean b6 = circularDeque.insertFront(4);// 返回 true
        int front = circularDeque.getFront();// 返回 4
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(rear);
        System.out.println(front);
    }
}

class MyCircularDeque {

    // 队列容量
    private int capacity;

    private int[] arr;

    // 头
    private int front;

    // 尾
    private int rear;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        this.capacity = k + 1;
        this.arr = new int[capacity];
        // 头部指向第 1 个存放元素的位置
        // 插入时，先减，再赋值
        // 删除时，索引 +1（注意取模）
        this.front = 0;
        // 尾部指向下一个插入元素的位置
        // 插入时，先赋值，再加
        // 删除时，索引 -1（注意取模）
        this.rear = 0;

    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        // front 被设计在数组的开头，所以是 +1
        front = (front + 1) % capacity;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        // rear 被设计在数组的末尾，所以是 -1
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        // 当 rear 为 0 时防止数组越界
        return arr[(rear - 1 + capacity) % capacity];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

}
