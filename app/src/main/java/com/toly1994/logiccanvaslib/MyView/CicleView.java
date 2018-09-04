package com.toly1994.logiccanvaslib.MyView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.toly1994.logic_canvas.bean.Pos;
import com.toly1994.logic_canvas.core.Painter;
import com.toly1994.logic_canvas.core.shape.ShapeArc;
import com.toly1994.logic_canvas.simple.CanvasUtils;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/9/2 0002:6:53<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class CicleView extends View {


    private Context mContext;

    public CicleView(Context context) {
        super(context);
        mContext = context;
    }

    public CicleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        final Painter painter = new Painter(canvas);

        painter.draw(
                new ShapeArc(1)
                        .r(100f)
                        .b(5f).ss(Color.RED)
                        .p(new Pos(200,-200))
        );

//        painter.draw(
//                new ShapeArc()
//                        .r(100f).ang(135f)
//                        .b(4f).ss(Color.RED)
//                        .coo(new Pos(400, 400))
//        );


        CanvasUtils.drawGrid(mContext, 50, canvas);
        CanvasUtils.drawCoord(mContext, new Pos(400, 400), 50, canvas);
    }
}
