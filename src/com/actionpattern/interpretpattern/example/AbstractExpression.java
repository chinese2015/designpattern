package com.actionpattern.interpretpattern.example;

public abstract class AbstractExpression {

    public void interpret(PlayContext context){
        //
        if(context.getContext().length()==0){
            return;
        }


        String playKey = context.getContext().substring(0,1);

        context.setContext(context.getContext().substring(2));

        String playValueStr = context.getContext().substring(0,context.getContext().indexOf(' '));

        double playValue = Double.parseDouble(playValueStr);

        context.setContext(context.getContext().substring(context.getContext().indexOf(' ')+1));

        
        execute(playKey,playValue);

    }

    protected abstract void execute(String playKey, double playValue);
}
