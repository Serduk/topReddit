
package com.sserdiuk.topreddit.data.remote.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RemotePostEntity {

    @SerializedName("approved_at_utc")
    private Object approvedAtUtc;
    @SerializedName("subreddit")
    private String subreddit;
    @SerializedName("selftext")
    private String selftext;
    @SerializedName("author_fullname")
    private String authorFullname;
    @SerializedName("saved")
    private Boolean saved;
    @SerializedName("mod_reason_title")
    private Object modReasonTitle;
    @SerializedName("gilded")
    private Integer gilded;
    @SerializedName("clicked")
    private Boolean clicked;
    @SerializedName("title")
    private String title;
    @SerializedName("subreddit_name_prefixed")
    private String subredditNamePrefixed;
    @SerializedName("link_flair_css_class")
    private String linkFlairCssClass;
    @SerializedName("thumbnail_height")
    private Integer thumbnailHeight;
    @SerializedName("hide_score")
    private Boolean hideScore;
    @SerializedName("name")
    private String name;
    @SerializedName("quarantine")
    private Boolean quarantine;
    @SerializedName("link_flair_text_color")
    private String linkFlairTextColor;
    @SerializedName("author_flair_background_color")
    private String authorFlairBackgroundColor;
    @SerializedName("subreddit_type")
    private String subredditType;
    @SerializedName("ups")
    private Integer ups;
    @SerializedName("total_awards_received")
    private Integer totalAwardsReceived;
    @SerializedName("thumbnail_width")
    private Integer thumbnailWidth;
    @SerializedName("author_flair_template_id")
    private Object authorFlairTemplateId;
    @SerializedName("is_original_content")
    private Boolean isOriginalContent;
    @SerializedName("user_reports")
    private List<Object> userReports = null;
    @SerializedName("secure_media")
    private Object secureMedia;
    @SerializedName("is_reddit_media_domain")
    private Boolean isRedditMediaDomain;
    @SerializedName("is_meta")
    private Boolean isMeta;
    @SerializedName("category")
    private Object category;
    @SerializedName("link_flair_text")
    private String linkFlairText;
    @SerializedName("can_mod_post")
    private Boolean canModPost;
    @SerializedName("score")
    private Integer score;
    @SerializedName("approved_by")
    private Object approvedBy;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("edited")
    private Boolean edited;
    @SerializedName("author_flair_css_class")
    private String authorFlairCssClass;
    @SerializedName("steward_reports")
    private List<Object> stewardReports = null;
    @SerializedName("post_hint")
    private String postHint;
    @SerializedName("content_categories")
    private Object contentCategories;
    @SerializedName("is_self")
    private Boolean isSelf;
    @SerializedName("mod_note")
    private Object modNote;
    @SerializedName("created")
    private Double created;
    @SerializedName("link_flair_type")
    private String linkFlairType;
    @SerializedName("wls")
    private Integer wls;
    @SerializedName("banned_by")
    private Object bannedBy;
    @SerializedName("author_flair_type")
    private String authorFlairType;
    @SerializedName("domain")
    private String domain;
    @SerializedName("allow_live_comments")
    private Boolean allowLiveComments;
    @SerializedName("selftext_html")
    private Object selftextHtml;
    @SerializedName("likes")
    private Object likes;
    @SerializedName("suggested_sort")
    private Object suggestedSort;
    @SerializedName("banned_at_utc")
    private Object bannedAtUtc;
    @SerializedName("view_count")
    private Object viewCount;
    @SerializedName("archived")
    private Boolean archived;
    @SerializedName("no_follow")
    private Boolean noFollow;
    @SerializedName("is_crosspostable")
    private Boolean isCrosspostable;
    @SerializedName("pinned")
    private Boolean pinned;
    @SerializedName("over_18")
    private Boolean over18;
    @SerializedName("awarders")
    private List<String> awarders = null;
    @SerializedName("media_only")
    private Boolean mediaOnly;
    @SerializedName("link_flair_template_id")
    private String linkFlairTemplateId;
    @SerializedName("can_gild")
    private Boolean canGild;
    @SerializedName("spoiler")
    private Boolean spoiler;
    @SerializedName("locked")
    private Boolean locked;
    @SerializedName("author_flair_text")
    private String authorFlairText;
    @SerializedName("visited")
    private Boolean visited;
    @SerializedName("removed_by")
    private Object removedBy;
    @SerializedName("num_reports")
    private Object numReports;
    @SerializedName("distinguished")
    private Object distinguished;
    @SerializedName("subreddit_id")
    private String subredditId;
    @SerializedName("mod_reason_by")
    private Object modReasonBy;
    @SerializedName("removal_reason")
    private Object removalReason;
    @SerializedName("link_flair_background_color")
    private String linkFlairBackgroundColor;
    @SerializedName("id")
    private String id;
    @SerializedName("is_robot_indexable")
    private Boolean isRobotIndexable;
    @SerializedName("report_reasons")
    private Object reportReasons;
    @SerializedName("author")
    private String author;
    @SerializedName("discussion_type")
    private Object discussionType;
    @SerializedName("num_comments")
    private Integer numComments;
    @SerializedName("send_replies")
    private Boolean sendReplies;
    @SerializedName("whitelist_status")
    private String whitelistStatus;
    @SerializedName("contest_mode")
    private Boolean contestMode;
    @SerializedName("mod_reports")
    private List<Object> modReports = null;
    @SerializedName("author_patreon_flair")
    private Boolean authorPatreonFlair;
    @SerializedName("author_flair_text_color")
    private String authorFlairTextColor;
    @SerializedName("permalink")
    private String permalink;
    @SerializedName("parent_whitelist_status")
    private String parentWhitelistStatus;
    @SerializedName("stickied")
    private Boolean stickied;
    @SerializedName("url")
    private String url;
    @SerializedName("subreddit_subscribers")
    private Integer subredditSubscribers;
    @SerializedName("created_utc")
    private Double createdUtc;
    @SerializedName("num_crossposts")
    private Integer numCrossposts;
    @SerializedName("media")
    private Object media;
    @SerializedName("is_video")
    private Boolean isVideo;

    public Object getApprovedAtUtc() {
        return approvedAtUtc;
    }

    public void setApprovedAtUtc(Object approvedAtUtc) {
        this.approvedAtUtc = approvedAtUtc;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public String getSelftext() {
        return selftext;
    }

    public void setSelftext(String selftext) {
        this.selftext = selftext;
    }

    public String getAuthorFullname() {
        return authorFullname;
    }

    public void setAuthorFullname(String authorFullname) {
        this.authorFullname = authorFullname;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public Object getModReasonTitle() {
        return modReasonTitle;
    }

    public void setModReasonTitle(Object modReasonTitle) {
        this.modReasonTitle = modReasonTitle;
    }

    public Integer getGilded() {
        return gilded;
    }

    public void setGilded(Integer gilded) {
        this.gilded = gilded;
    }

    public Boolean getClicked() {
        return clicked;
    }

    public void setClicked(Boolean clicked) {
        this.clicked = clicked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public void setSubredditNamePrefixed(String subredditNamePrefixed) {
        this.subredditNamePrefixed = subredditNamePrefixed;
    }



    public String getLinkFlairCssClass() {
        return linkFlairCssClass;
    }

    public void setLinkFlairCssClass(String linkFlairCssClass) {
        this.linkFlairCssClass = linkFlairCssClass;
    }



    public Integer getThumbnailHeight() {
        return thumbnailHeight;
    }

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    public Boolean getHideScore() {
        return hideScore;
    }

    public void setHideScore(Boolean hideScore) {
        this.hideScore = hideScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public String getLinkFlairTextColor() {
        return linkFlairTextColor;
    }

    public void setLinkFlairTextColor(String linkFlairTextColor) {
        this.linkFlairTextColor = linkFlairTextColor;
    }

    public String getAuthorFlairBackgroundColor() {
        return authorFlairBackgroundColor;
    }

    public void setAuthorFlairBackgroundColor(String authorFlairBackgroundColor) {
        this.authorFlairBackgroundColor = authorFlairBackgroundColor;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Integer getTotalAwardsReceived() {
        return totalAwardsReceived;
    }

    public void setTotalAwardsReceived(Integer totalAwardsReceived) {
        this.totalAwardsReceived = totalAwardsReceived;
    }


    public Integer getThumbnailWidth() {
        return thumbnailWidth;
    }

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    public Object getAuthorFlairTemplateId() {
        return authorFlairTemplateId;
    }

    public void setAuthorFlairTemplateId(Object authorFlairTemplateId) {
        this.authorFlairTemplateId = authorFlairTemplateId;
    }

    public Boolean getIsOriginalContent() {
        return isOriginalContent;
    }

    public void setIsOriginalContent(Boolean isOriginalContent) {
        this.isOriginalContent = isOriginalContent;
    }

    public List<Object> getUserReports() {
        return userReports;
    }

    public void setUserReports(List<Object> userReports) {
        this.userReports = userReports;
    }

    public Object getSecureMedia() {
        return secureMedia;
    }

    public void setSecureMedia(Object secureMedia) {
        this.secureMedia = secureMedia;
    }

    public Boolean getIsRedditMediaDomain() {
        return isRedditMediaDomain;
    }

    public void setIsRedditMediaDomain(Boolean isRedditMediaDomain) {
        this.isRedditMediaDomain = isRedditMediaDomain;
    }

    public Boolean getIsMeta() {
        return isMeta;
    }

    public void setIsMeta(Boolean isMeta) {
        this.isMeta = isMeta;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public String getLinkFlairText() {
        return linkFlairText;
    }

    public void setLinkFlairText(String linkFlairText) {
        this.linkFlairText = linkFlairText;
    }

    public Boolean getCanModPost() {
        return canModPost;
    }

    public void setCanModPost(Boolean canModPost) {
        this.canModPost = canModPost;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Object getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public String getAuthorFlairCssClass() {
        return authorFlairCssClass;
    }

    public void setAuthorFlairCssClass(String authorFlairCssClass) {
        this.authorFlairCssClass = authorFlairCssClass;
    }

    public List<Object> getStewardReports() {
        return stewardReports;
    }

    public void setStewardReports(List<Object> stewardReports) {
        this.stewardReports = stewardReports;
    }

    public String getPostHint() {
        return postHint;
    }

    public void setPostHint(String postHint) {
        this.postHint = postHint;
    }

    public Object getContentCategories() {
        return contentCategories;
    }

    public void setContentCategories(Object contentCategories) {
        this.contentCategories = contentCategories;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Object getModNote() {
        return modNote;
    }

    public void setModNote(Object modNote) {
        this.modNote = modNote;
    }

    public Double getCreated() {
        return created;
    }

    public void setCreated(Double created) {
        this.created = created;
    }

    public String getLinkFlairType() {
        return linkFlairType;
    }

    public void setLinkFlairType(String linkFlairType) {
        this.linkFlairType = linkFlairType;
    }

    public Integer getWls() {
        return wls;
    }

    public void setWls(Integer wls) {
        this.wls = wls;
    }

    public Object getBannedBy() {
        return bannedBy;
    }

    public void setBannedBy(Object bannedBy) {
        this.bannedBy = bannedBy;
    }

    public String getAuthorFlairType() {
        return authorFlairType;
    }

    public void setAuthorFlairType(String authorFlairType) {
        this.authorFlairType = authorFlairType;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Boolean getAllowLiveComments() {
        return allowLiveComments;
    }

    public void setAllowLiveComments(Boolean allowLiveComments) {
        this.allowLiveComments = allowLiveComments;
    }

    public Object getSelftextHtml() {
        return selftextHtml;
    }

    public void setSelftextHtml(Object selftextHtml) {
        this.selftextHtml = selftextHtml;
    }

    public Object getLikes() {
        return likes;
    }

    public void setLikes(Object likes) {
        this.likes = likes;
    }

    public Object getSuggestedSort() {
        return suggestedSort;
    }

    public void setSuggestedSort(Object suggestedSort) {
        this.suggestedSort = suggestedSort;
    }

    public Object getBannedAtUtc() {
        return bannedAtUtc;
    }

    public void setBannedAtUtc(Object bannedAtUtc) {
        this.bannedAtUtc = bannedAtUtc;
    }

    public Object getViewCount() {
        return viewCount;
    }

    public void setViewCount(Object viewCount) {
        this.viewCount = viewCount;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Boolean getNoFollow() {
        return noFollow;
    }

    public void setNoFollow(Boolean noFollow) {
        this.noFollow = noFollow;
    }

    public Boolean getIsCrosspostable() {
        return isCrosspostable;
    }

    public void setIsCrosspostable(Boolean isCrosspostable) {
        this.isCrosspostable = isCrosspostable;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public List<String> getAwarders() {
        return awarders;
    }

    public void setAwarders(List<String> awarders) {
        this.awarders = awarders;
    }

    public Boolean getMediaOnly() {
        return mediaOnly;
    }

    public void setMediaOnly(Boolean mediaOnly) {
        this.mediaOnly = mediaOnly;
    }

    public String getLinkFlairTemplateId() {
        return linkFlairTemplateId;
    }

    public void setLinkFlairTemplateId(String linkFlairTemplateId) {
        this.linkFlairTemplateId = linkFlairTemplateId;
    }

    public Boolean getCanGild() {
        return canGild;
    }

    public void setCanGild(Boolean canGild) {
        this.canGild = canGild;
    }

    public Boolean getSpoiler() {
        return spoiler;
    }

    public void setSpoiler(Boolean spoiler) {
        this.spoiler = spoiler;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getAuthorFlairText() {
        return authorFlairText;
    }

    public void setAuthorFlairText(String authorFlairText) {
        this.authorFlairText = authorFlairText;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Object getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(Object removedBy) {
        this.removedBy = removedBy;
    }

    public Object getNumReports() {
        return numReports;
    }

    public void setNumReports(Object numReports) {
        this.numReports = numReports;
    }

    public Object getDistinguished() {
        return distinguished;
    }

    public void setDistinguished(Object distinguished) {
        this.distinguished = distinguished;
    }

    public String getSubredditId() {
        return subredditId;
    }

    public void setSubredditId(String subredditId) {
        this.subredditId = subredditId;
    }

    public Object getModReasonBy() {
        return modReasonBy;
    }

    public void setModReasonBy(Object modReasonBy) {
        this.modReasonBy = modReasonBy;
    }

    public Object getRemovalReason() {
        return removalReason;
    }

    public void setRemovalReason(Object removalReason) {
        this.removalReason = removalReason;
    }

    public String getLinkFlairBackgroundColor() {
        return linkFlairBackgroundColor;
    }

    public void setLinkFlairBackgroundColor(String linkFlairBackgroundColor) {
        this.linkFlairBackgroundColor = linkFlairBackgroundColor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsRobotIndexable() {
        return isRobotIndexable;
    }

    public void setIsRobotIndexable(Boolean isRobotIndexable) {
        this.isRobotIndexable = isRobotIndexable;
    }

    public Object getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(Object reportReasons) {
        this.reportReasons = reportReasons;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getDiscussionType() {
        return discussionType;
    }

    public void setDiscussionType(Object discussionType) {
        this.discussionType = discussionType;
    }

    public Integer getNumComments() {
        return numComments;
    }

    public void setNumComments(Integer numComments) {
        this.numComments = numComments;
    }

    public Boolean getSendReplies() {
        return sendReplies;
    }

    public void setSendReplies(Boolean sendReplies) {
        this.sendReplies = sendReplies;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public Boolean getContestMode() {
        return contestMode;
    }

    public void setContestMode(Boolean contestMode) {
        this.contestMode = contestMode;
    }

    public List<Object> getModReports() {
        return modReports;
    }

    public void setModReports(List<Object> modReports) {
        this.modReports = modReports;
    }

    public Boolean getAuthorPatreonFlair() {
        return authorPatreonFlair;
    }

    public void setAuthorPatreonFlair(Boolean authorPatreonFlair) {
        this.authorPatreonFlair = authorPatreonFlair;
    }

    public String getAuthorFlairTextColor() {
        return authorFlairTextColor;
    }

    public void setAuthorFlairTextColor(String authorFlairTextColor) {
        this.authorFlairTextColor = authorFlairTextColor;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getParentWhitelistStatus() {
        return parentWhitelistStatus;
    }

    public void setParentWhitelistStatus(String parentWhitelistStatus) {
        this.parentWhitelistStatus = parentWhitelistStatus;
    }

    public Boolean getStickied() {
        return stickied;
    }

    public void setStickied(Boolean stickied) {
        this.stickied = stickied;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSubredditSubscribers() {
        return subredditSubscribers;
    }

    public void setSubredditSubscribers(Integer subredditSubscribers) {
        this.subredditSubscribers = subredditSubscribers;
    }

    public Double getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Double createdUtc) {
        this.createdUtc = createdUtc;
    }

    public Integer getNumCrossposts() {
        return numCrossposts;
    }

    public void setNumCrossposts(Integer numCrossposts) {
        this.numCrossposts = numCrossposts;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

}
