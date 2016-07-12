package com.TETOSOFT.graphics;

import java.awt.Image;

public class Sprite {

    protected Animation anim;
    
    private float x;
    private float y;
    
    private float dx;
    private float dy;

    
    public Sprite(Animation anim) 
    {
        this.anim = anim;
    }

    
    
    public void update(long elapsedTime) 
    {
        x += dx * elapsedTime;
        y += dy * elapsedTime;
        anim.update(elapsedTime);
    }

    
    public float getX() 
    {
        return x;
    }

    
    public float getY() {
        return y;
    }

    
    public void setX(float x) 
    {
        this.x = x;
    }

   
    public void setY(float y)
    {
        this.y = y;
    }

   
    public int getWidth() 
    {
        return anim.getImage().getWidth(null);
    }

    
    public int getHeight() 
    {
        return anim.getImage().getHeight(null);
    }

    
    public float getVelocityX() 
    {
        return dx;
    }

   
    public float getVelocityY()
    {
        return dy;
    }

    
    public void setVelocityX(float dx) 
    {
        this.dx = dx;
    }

    
    public void setVelocityY(float dy) 
    {
        this.dy = dy;
    }

    
    public Image getImage() 
    {
        return anim.getImage();
    }

    
    public Object clone() 
    {
        return new Sprite(anim);
    }
}
