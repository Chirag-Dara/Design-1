import java.util.Stack;

class Pair{
    int value;
    int minValue;

    Pair(int value, int minValue){
        this.value = value;
        this.minValue = minValue;
    }
}
class MinStack {

    Stack<Pair> stack;
    int minValue = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<Pair>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Pair(val, Math.min(val, minValue)));
        } else {
            Pair topPair = stack.peek();
            stack.push(new Pair(val, Math.min(val, topPair.minValue)));
        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return ;
        }
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().minValue;
    }
}