// we can do this by using HashSet
//or else sorting and two pointers
//or using bit manipulation
//or linkedlist tortoise method.
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int a[]={1,2,2,5,4,3};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];

        }
        return slow;
    }
}
