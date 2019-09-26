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

<table>
  <tr>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567218-0a62f000-df73-11e9-86be-cc2c9bcc72c6.png" height = "480" width="270"></td>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567242-1b136600-df73-11e9-8ec2-d31a8d68a247.png" height = "480" width="270"></td>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567268-35e5da80-df73-11e9-967f-021a841493f1.png" height = "480" width="270"></td>
  </tr>
  </table>

- ### Linked List:

Here data is moved up and down mainly by pointig out with node addresses.

## Queue:

1. A queue can be defined as an ordered list which enables insert operations to be performed at one end called REAR and delete operations to be performed at another end called FRONT.

2. Queue is referred to be as First In First Out list.

### Array based implementation of Queue:

- Check if the queue is already full by comparing rear to max - 1. if so, then return an overflow error.

- If the item is to be inserted as the first element in the list, in that case set the value of front and rear to 0 and insert the element at the rear end.

- Otherwise keep increasing the value of rear and insert each element one by one having rear as the index. 

<table>
  <tr>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567535-464a8500-df74-11e9-9ead-7a68792b199b.png" height = "480" width="270"></td>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567625-8dd11100-df74-11e9-8180-6c9a476a69ff.png" height = "480" width="270"></td>
    <td><img src="https://user-images.githubusercontent.com/43814992/65567645-9e818700-df74-11e9-9b24-b9161a72932a.png" height = "480" width="270"></td>
  </tr>
  </table>
  
### Linked List implementation of queue:

Algorithm:

- Create a  new node to act as a pointer.
- Set node.data=val;
- IF FRONT = NULL

 SET FRONT = REAR = node
 
 SET FRONT -> NEXT = REAR -> NEXT = NULL
 
 ELSE
 
 SET REAR -> NEXT = node
 
 SET REAR = node
 
 SET REAR -> NEXT = NULL
 
 [END OF IF]
 
- END


<table>
  <tr>
    <td><img src="https://user-images.githubusercontent.com/43814992/65653657-b4a24c80-e033-11e9-984c-e51ecfaaeaaa.png"></td>
  </tr>
  </table>


