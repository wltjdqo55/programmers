class Solution {
    public long solution(int price, int money, int count) {
        long leftMoney = 0;
        
        for(long i=1;i<=count;i++){
            leftMoney += price * i;
        }
        
        return money >= leftMoney ? (long)0 : leftMoney - money;
    }
}