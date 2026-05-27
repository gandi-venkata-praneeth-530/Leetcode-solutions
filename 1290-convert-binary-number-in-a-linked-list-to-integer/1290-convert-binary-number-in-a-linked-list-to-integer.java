/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int power = 0,decimal =0;
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count+=1;
            temp = temp.next;
        }
        int[] res = new int[count];
        int index=0;
        temp = head;
        while(temp!=null){
            res[index]=temp.val;
            index++;
            temp = temp.next;
        }
        binaryToDecimal(res);
        return decimal;
    }
    public int binaryToDecimal(int[] res){
            for(int i=res.length-1;i>=0;i--){
                if(res[i]==1){
                    decimal+=Math.pow(2,power);
                }
                power++;
            }
        return decimal;
    }
}