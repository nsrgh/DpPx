package com.nosorogstudio.dppx

import com.nosorogstudio.dppx.android.*
import org.junit.Test

// Тест не работает!
// https://stackoverflow.com/questions/34010251/android-pointf-constructor-not-working-in-junit-test/34086643
class PointFTest {

    @Test
    fun property_isCorrect() {
        Density.useHdpi()

        var point = PointF(Dp(100), Dp(50))
        assert(point.xDp == Dp(100))
        assert(point.yDp == Dp(50))
        assert(point.xPx == Px(200))
        assert(point.yPx == Px(100))
        assert(point.x == 200f)
        assert(point.y == 100f)

        point = PointF(Px(100), Px(50))
        assert(point.xDp == Dp(50))
        assert(point.yDp == Dp(25))
        assert(point.xPx == Px(100))
        assert(point.yPx == Px(50))
        assert(point.x == 100f)
        assert(point.y == 50f)

        point.xDp = Dp(200)
        point.yDp = Dp(100)
        assert(point.xDp == Dp(200))
        assert(point.yDp == Dp(100))
        assert(point.xPx == Px(400))
        assert(point.yPx == Px(200))
        assert(point.x == 400f)
        assert(point.y == 200f)

        point.xPx = Px(800)
        point.yPx = Px(400)
        assert(point.xDp == Dp(400))
        assert(point.yDp == Dp(200))
        assert(point.xPx == Px(800))
        assert(point.yPx == Px(400))
        assert(point.x == 800f)
        assert(point.y == 400f)

        point.x = 1600f
        point.y = 800f
        assert(point.xDp == Dp(800))
        assert(point.yDp == Dp(800))
        assert(point.xPx == Px(1600))
        assert(point.yPx == Px(800))
        assert(point.x == 1600f)
        assert(point.y == 800f)
    }
}