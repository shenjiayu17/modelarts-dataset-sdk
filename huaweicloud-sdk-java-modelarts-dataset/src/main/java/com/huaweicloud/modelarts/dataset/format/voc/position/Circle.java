/*
 * Copyright 2018 Deep Learning Service of Huawei Cloud. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huaweicloud.modelarts.dataset.format.voc.position;

public class Circle implements Position
{
    private String cx;
    
    private String cy;
    
    private String r;
    
    /**
     * circle for object
     *
     * @param cx x value of center point of a circle
     * @param cy y value of center point of a circle
     * @param r  radius of a circle
     */
    public Circle(String cx, String cy, String r)
    {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }
    
    public String getCx()
    {
        return cx;
    }
    
    public String getCy()
    {
        return cy;
    }
    
    public String getR()
    {
        return r;
    }
    
    @Override
    public PositionType getType()
    {
        return PositionType.CIRCLE;
    }
}
