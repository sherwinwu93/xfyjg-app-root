package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="DictItem")
public class DictItem {
    @ApiModelProperty(value="dictItemId字典项id")
    private Long dictItemId;

    @ApiModelProperty(value="dictItemLabel字典标签")
    private String dictItemLabel;

    @ApiModelProperty(value="dictItemValue字典键值")
    private String dictItemValue;

    @ApiModelProperty(value="dictTypeId字典类型")
    private String dictTypeId;

    @ApiModelProperty(value="parentId父标签键值")
    private String parentId;

    @ApiModelProperty(value="path父类树")
    private String path;

    @ApiModelProperty(value="remark备注")
    private String remark;

    @ApiModelProperty(value="sort排序值,从小到大")
    private Integer sort;

    public Long getDictItemId() {
        return dictItemId;
    }

    public void setDictItemId(Long dictItemId) {
        this.dictItemId = dictItemId;
    }

    public String getDictItemLabel() {
        return dictItemLabel;
    }

    public void setDictItemLabel(String dictItemLabel) {
        this.dictItemLabel = dictItemLabel == null ? null : dictItemLabel.trim();
    }

    public String getDictItemValue() {
        return dictItemValue;
    }

    public void setDictItemValue(String dictItemValue) {
        this.dictItemValue = dictItemValue == null ? null : dictItemValue.trim();
    }

    public String getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(String dictTypeId) {
        this.dictTypeId = dictTypeId == null ? null : dictTypeId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}