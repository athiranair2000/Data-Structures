# Data Structures

## Sorting Technics:


- ### Bubble Sort:

It's simple and intuitive.  Bubble Sort compares neighboring elements and forces larger elements to 'bubble' to the end of an array while simultaneously 'floating' smaller elements to the top/front of a list. 

Datastructure used here is an array.

Here's the basic idea of the Bubble Sort algorithm:

1. Start at the beginning of a list (array) of items.
2. Compare the item you're looking at to the next item in the list.
3. If this item is greater than the next one, swap them.
4. Move on to the next item.
5. Repeat steps 1-4 until you go through the whole list without doing any swaps.

- ### Insertion Sort:

An element in an array is assigned as key.

Basic Idea of insertion  algorithm:

1. Starts with 1rst element of the array.
2. Compares it with previous index element till it reaches zeroth index.
3. If item assigned as key is lesser than the previous index elements then swapping occurs.
4. Move on to the next item and assign it as key.
5. Repeat steps 1-4 until you go through the whole list without doing any swaps.

- ### Merge Sort:
Datastructure used here is an array.
- Merge sort is recursive.
- Very efficient for large datasets.
- Merge sort does log n merge steps because merge step doubles the list size.It does n work for merge steps because it must look at every item.
- It runs O(n logn)

## Stack:

- It can be a type of an array or a linked list.

- push: add an element

- pop: delete an element.

- Stack is a recursive data structure having pointer to its top element.

- Stacks are sometimes called as Last-In-First-Out (LIFO) lists i.e. the element which is inserted first in the stack, will be deleted last from the stack. 

- ### Linked List:

Here data is moved up and down mainly by pointig out with node addresses.

