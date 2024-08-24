// in unsprted list - linear search
// in sorted list - binary search
class strings {
static void main(String[] args) {
        int low=0,high=4,mid,key=20;
        int [] arr={10,20,30,40,50};
        while(low<=high){
            mid=(low+high)/2;
            if(key<arr[mid]){
                high =mid-1;
            }
            else{
                    System.out.println(mid);
                    break;
                }
            }
            
        }
            
        }