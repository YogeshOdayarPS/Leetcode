class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> list=new LinkedList<>();

        int val;
        ListNode next;
        ListNode temp=list1;
        while(temp!=null){
            
            list.add(temp.val);
            temp=temp.next;

        }
        temp=list2;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int x: list){
            curr.next=new ListNode(x);
            curr=curr.next;

        }
        return dummy.next;
        

    }
}