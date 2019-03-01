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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcatFileInfo2017  extends AbstractModel{

    /**
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Integer ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 视频拼接源文件的 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 视频拼接源文件的地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 视频拼接源文件的格式。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * 获取错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Integer getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Integer ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取视频拼接源文件的 ID。
     * @return FileId 视频拼接源文件的 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置视频拼接源文件的 ID。
     * @param FileId 视频拼接源文件的 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取视频拼接源文件的地址。
     * @return FileUrl 视频拼接源文件的地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置视频拼接源文件的地址。
     * @param FileUrl 视频拼接源文件的地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 获取视频拼接源文件的格式。
     * @return FileType 视频拼接源文件的格式。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置视频拼接源文件的格式。
     * @param FileType 视频拼接源文件的格式。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

