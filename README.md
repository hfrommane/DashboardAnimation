# DashboardAnimation

### 我们看一下效果
![效果图](https://raw.githubusercontent.com/hfrommane/DashboardAnimation/master/images/%E6%95%88%E6%9E%9C%E5%9B%BE.gif)

### 思路：
没错，我们用自定义View可以做，不过比较复杂。换个思路，我们让美工提供一张背景图和一张橙色指针图（这里要注意了，一定要提供多种分辨率的图片，为适配不同分辨率的手机），给橙色指针一个旋转动画不就可以了吗。

### 核心代码：
```
    /**
     * 旋转动画
     * @param percent
     */
    private void ivRotate(double percent) {
        double percentOffset = percent > 100 ? 100 : percent;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180 * ((int) percentOffset / 100f),
                Animation.RELATIVE_TO_SELF, 0.748f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1500);
        rotateAnimation.setFillAfter(true);
        ivIndex.startAnimation(rotateAnimation);
    }
```

### 项目源码：
[https://github.com/hfrommane/DashboardAnimation](https://github.com/hfrommane/DashboardAnimation)
如果您喜欢，在GitHub上给个Star，感谢！

### 后记：
我们在做项目的时候，有时不要想太复杂。一条路走不通，我们换个思路，说不定很容易就走通了。

