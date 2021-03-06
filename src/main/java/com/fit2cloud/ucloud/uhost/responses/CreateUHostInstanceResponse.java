package com.fit2cloud.ucloud.uhost.responses;

import com.fit2cloud.ucloud.Response;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: chilaoqi
 * Date: 7/24/15
 * Time: 11:30 AM
 * Email: xqiang.chi@samsung.com
 */
public class CreateUHostInstanceResponse extends Response{
    private List<String> UHostIds;

    public List<String> getUHostIds() {
        return UHostIds;
    }

    public void setUHostIds(List<String> UHostIds) {
        this.UHostIds = UHostIds;
    }

    @Override
    public String toString() {
        return "CreateUHostInstanceResponse{" +
                "UHostIds=" + UHostIds +
                '}';
    }
}
