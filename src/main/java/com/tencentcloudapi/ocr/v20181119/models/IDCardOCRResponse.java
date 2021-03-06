/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IDCardOCRResponse  extends AbstractModel{

    /**
    * 姓名（正面）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别（正面）
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 民族（正面）
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 出生日期（正面）
    */
    @SerializedName("Birth")
    @Expose
    private String Birth;

    /**
    * 地址（正面）
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 身份证号（正面）
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * 发证机关（反面）
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * 证件有效期（反面）
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回。目前支持的扩展字段为：
IdCard身份证照片，请求CropIdCard时返回；
Portrait人像照片，请求CropPortrait时返回；
WarnInfos告警信息（Code告警码，Msg告警信息），识别出翻拍件或复印件时返回。
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取姓名（正面）
     * @return Name 姓名（正面）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名（正面）
     * @param Name 姓名（正面）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取性别（正面）
     * @return Sex 性别（正面）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * 设置性别（正面）
     * @param Sex 性别（正面）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * 获取民族（正面）
     * @return Nation 民族（正面）
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * 设置民族（正面）
     * @param Nation 民族（正面）
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * 获取出生日期（正面）
     * @return Birth 出生日期（正面）
     */
    public String getBirth() {
        return this.Birth;
    }

    /**
     * 设置出生日期（正面）
     * @param Birth 出生日期（正面）
     */
    public void setBirth(String Birth) {
        this.Birth = Birth;
    }

    /**
     * 获取地址（正面）
     * @return Address 地址（正面）
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置地址（正面）
     * @param Address 地址（正面）
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取身份证号（正面）
     * @return IdNum 身份证号（正面）
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * 设置身份证号（正面）
     * @param IdNum 身份证号（正面）
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * 获取发证机关（反面）
     * @return Authority 发证机关（反面）
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * 设置发证机关（反面）
     * @param Authority 发证机关（反面）
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * 获取证件有效期（反面）
     * @return ValidDate 证件有效期（反面）
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * 设置证件有效期（反面）
     * @param ValidDate 证件有效期（反面）
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * 获取扩展信息，根据请求的可选字段返回对应内容，不请求则不返回。目前支持的扩展字段为：
IdCard身份证照片，请求CropIdCard时返回；
Portrait人像照片，请求CropPortrait时返回；
WarnInfos告警信息（Code告警码，Msg告警信息），识别出翻拍件或复印件时返回。
     * @return AdvancedInfo 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回。目前支持的扩展字段为：
IdCard身份证照片，请求CropIdCard时返回；
Portrait人像照片，请求CropPortrait时返回；
WarnInfos告警信息（Code告警码，Msg告警信息），识别出翻拍件或复印件时返回。
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * 设置扩展信息，根据请求的可选字段返回对应内容，不请求则不返回。目前支持的扩展字段为：
IdCard身份证照片，请求CropIdCard时返回；
Portrait人像照片，请求CropPortrait时返回；
WarnInfos告警信息（Code告警码，Msg告警信息），识别出翻拍件或复印件时返回。
     * @param AdvancedInfo 扩展信息，根据请求的可选字段返回对应内容，不请求则不返回。目前支持的扩展字段为：
IdCard身份证照片，请求CropIdCard时返回；
Portrait人像照片，请求CropPortrait时返回；
WarnInfos告警信息（Code告警码，Msg告警信息），识别出翻拍件或复印件时返回。
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birth", this.Birth);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

