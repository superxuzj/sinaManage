package com.boliangshenghe.sina.entity;

public class WeiboSource {
    private Integer id;

    private String mid;

    private String uid;

    private String createdAt;

    private String sourceId;

    private String filter;

    private String content;

    private String mentions;

    private String blogUrl;

    private String parentRtIdDb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt == null ? null : createdAt.trim();
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter == null ? null : filter.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMentions() {
        return mentions;
    }

    public void setMentions(String mentions) {
        this.mentions = mentions == null ? null : mentions.trim();
    }

    public String getBlogUrl() {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl) {
        this.blogUrl = blogUrl == null ? null : blogUrl.trim();
    }

    public String getParentRtIdDb() {
        return parentRtIdDb;
    }

    public void setParentRtIdDb(String parentRtIdDb) {
        this.parentRtIdDb = parentRtIdDb == null ? null : parentRtIdDb.trim();
    }
}