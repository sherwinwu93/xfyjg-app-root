package com.xfjyg.managementservice.entity.gen;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="DictType")
public class DictType {
    @ApiModelProperty(value="dictTypeId字典类型id")
    private Long dictTypeId;

    @ApiModelProperty(value="dictTypeLabel字典类型名称")
    private String dictTypeLabel;

    @ApiModelProperty(value="dictTypeValue字典类型值")
    private String dictTypeValue;

    @ApiModelProperty(value="status状态（0正常 1正常）")
    private String status;

    @ApiModelProperty(value="remark备注")
    private String remark;

    public Long getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(Long dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    public String getDictTypeLabel() {
        return dictTypeLabel;
    }

    public void setDictTypeLabel(String dictTypeLabel) {
        this.dictTypeLabel = dictTypeLabel == null ? null : dictTypeLabel.trim();
    }

    public String getDictTypeValue() {
        return dictTypeValue;
    }

    public void setDictTypeValue(String dictTypeValue) {
        this.dictTypeValue = dictTypeValue == null ? null : dictTypeValue.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}