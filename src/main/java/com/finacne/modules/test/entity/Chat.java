package com.finacne.modules.test.entity;

public class Chat {
    private Integer id;

    private Long chatUuid;

    private Long chatCreateUuid;

    private Long chatJoinUuid;

    private Integer chatType;

    private String createTime;

    private String dataStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getChatUuid() {
        return chatUuid;
    }

    public void setChatUuid(Long chatUuid) {
        this.chatUuid = chatUuid;
    }

    public Long getChatCreateUuid() {
        return chatCreateUuid;
    }

    public void setChatCreateUuid(Long chatCreateUuid) {
        this.chatCreateUuid = chatCreateUuid;
    }

    public Long getChatJoinUuid() {
        return chatJoinUuid;
    }

    public void setChatJoinUuid(Long chatJoinUuid) {
        this.chatJoinUuid = chatJoinUuid;
    }

    public Integer getChatType() {
        return chatType;
    }

    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }
}