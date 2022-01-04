package com.omerglr.newinstax.api.model

import com.google.gson.annotations.SerializedName

data class InstagramGetStoriesResponse(

	@field:SerializedName("tray")
	val tray: List<TrayItem?>? = null,

	@field:SerializedName("nudge_story_reaction_ufi")
	val nudgeStoryReactionUfi: Boolean? = null,

	@field:SerializedName("emoji_reactions_config")
	val emojiReactionsConfig: EmojiReactionsConfig? = null,

	@field:SerializedName("broadcasts")
	val broadcasts: List<Any?>? = null,

	@field:SerializedName("refresh_window_ms")
	val refreshWindowMs: Int? = null,

	@field:SerializedName("story_ranking_token")
	val storyRankingToken: String? = null,

	@field:SerializedName("response_timestamp")
	val responseTimestamp: Int? = null,

	@field:SerializedName("stories_viewer_gestures_nux_eligible")
	val storiesViewerGesturesNuxEligible: Boolean? = null,

	@field:SerializedName("sticker_version")
	val stickerVersion: Int? = null,

	@field:SerializedName("face_filter_nux_version")
	val faceFilterNuxVersion: Int? = null,

	@field:SerializedName("story_likes_config")
	val storyLikesConfig: StoryLikesConfig? = null,

	@field:SerializedName("has_new_nux_story")
	val hasNewNuxStory: Boolean? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class TrayItem(

	@field:SerializedName("media_count")
	val mediaCount: Int? = null,

	@field:SerializedName("has_fan_club_media")
	val hasFanClubMedia: Boolean? = null,

	@field:SerializedName("ad_expiry_timestamp_in_millis")
	val adExpiryTimestampInMillis: Any? = null,

	@field:SerializedName("seen")
	val seen: Int? = null,

	@field:SerializedName("can_gif_quick_reply")
	val canGifQuickReply: Boolean? = null,

	@field:SerializedName("has_video")
	val hasVideo: Boolean? = null,

	@field:SerializedName("expiring_at")
	val expiringAt: Int? = null,

	@field:SerializedName("can_reply")
	val canReply: Boolean? = null,

	@field:SerializedName("ranked_position")
	val rankedPosition: Int? = null,

	@field:SerializedName("prefetch_count")
	val prefetchCount: Int? = null,

	@field:SerializedName("latest_besties_reel_media")
	val latestBestiesReelMedia: Double? = null,

	@field:SerializedName("has_pride_media")
	val hasPrideMedia: Boolean? = null,

	@field:SerializedName("id")
	val id: Long? = null,

	@field:SerializedName("latest_reel_media")
	val latestReelMedia: Int? = null,

	@field:SerializedName("is_cta_sticker_available")
	val isCtaStickerAvailable: Any? = null,

	@field:SerializedName("has_besties_media")
	val hasBestiesMedia: Boolean? = null,

	@field:SerializedName("can_reshare")
	val canReshare: Boolean? = null,

	@field:SerializedName("reel_type")
	val reelType: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("muted")
	val muted: Boolean? = null,

	@field:SerializedName("ranker_scores")
	val rankerScores: RankerScores? = null,

	@field:SerializedName("seen_ranked_position")
	val seenRankedPosition: Int? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
)

data class ItemsItem(

	@field:SerializedName("original_media_has_visual_reply_media")
	val originalMediaHasVisualReplyMedia: Boolean? = null,

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("can_send_custom_emojis")
	val canSendCustomEmojis: Boolean? = null,

	@field:SerializedName("reel_mentions")
	val reelMentions: List<ReelMentionsItem?>? = null,

	@field:SerializedName("caption")
	val caption: Any? = null,

	@field:SerializedName("is_visual_reply_commenter_notice_enabled")
	val isVisualReplyCommenterNoticeEnabled: Boolean? = null,

	@field:SerializedName("expiring_at")
	val expiringAt: Int? = null,

	@field:SerializedName("is_reel_media")
	val isReelMedia: Boolean? = null,

	@field:SerializedName("profile_grid_control_enabled")
	val profileGridControlEnabled: Boolean? = null,

	@field:SerializedName("media_type")
	val mediaType: Int? = null,

	@field:SerializedName("filter_type")
	val filterType: Int? = null,

	@field:SerializedName("device_timestamp")
	val deviceTimestamp: Long? = null,

	@field:SerializedName("deleted_reason")
	val deletedReason: Int? = null,

	@field:SerializedName("original_height")
	val originalHeight: Int? = null,

	@field:SerializedName("supports_reel_reactions")
	val supportsReelReactions: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("caption_position")
	val captionPosition: Double? = null,

	@field:SerializedName("can_see_insights_as_brand")
	val canSeeInsightsAsBrand: Boolean? = null,

	@field:SerializedName("integrity_review_decision")
	val integrityReviewDecision: String? = null,

	@field:SerializedName("original_width")
	val originalWidth: Int? = null,

	@field:SerializedName("comment_inform_treatment")
	val commentInformTreatment: CommentInformTreatment? = null,

	@field:SerializedName("is_unified_video")
	val isUnifiedVideo: Boolean? = null,

	@field:SerializedName("is_paid_partnership")
	val isPaidPartnership: Boolean? = null,

	@field:SerializedName("show_one_tap_fb_share_tooltip")
	val showOneTapFbShareTooltip: Boolean? = null,

	@field:SerializedName("photo_of_you")
	val photoOfYou: Boolean? = null,

	@field:SerializedName("like_and_view_counts_disabled")
	val likeAndViewCountsDisabled: Boolean? = null,

	@field:SerializedName("commerciality_status")
	val commercialityStatus: String? = null,

	@field:SerializedName("organic_tracking_token")
	val organicTrackingToken: String? = null,

	@field:SerializedName("music_metadata")
	val musicMetadata: Any? = null,

	@field:SerializedName("story_hashtags")
	val storyHashtags: List<StoryHashtagsItem?>? = null,

	@field:SerializedName("imported_taken_at")
	val importedTakenAt: Int? = null,

	@field:SerializedName("sharing_friction_info")
	val sharingFrictionInfo: SharingFrictionInfo? = null,

	@field:SerializedName("client_cache_key")
	val clientCacheKey: String? = null,

	@field:SerializedName("product_type")
	val productType: String? = null,

	@field:SerializedName("can_reply")
	val canReply: Boolean? = null,

	@field:SerializedName("taken_at")
	val takenAt: Int? = null,

	@field:SerializedName("caption_is_edited")
	val captionIsEdited: Boolean? = null,

	@field:SerializedName("image_versions2")
	val imageVersions2: ImageVersions2? = null,

	@field:SerializedName("pk")
	val pk: String? = null,

	@field:SerializedName("can_viewer_save")
	val canViewerSave: Boolean? = null,

	@field:SerializedName("is_in_profile_grid")
	val isInProfileGrid: Boolean? = null,

	@field:SerializedName("can_reshare")
	val canReshare: Boolean? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("story_static_models")
	val storyStaticModels: List<Any?>? = null,

	@field:SerializedName("video_dash_manifest")
	val videoDashManifest: String? = null,

	@field:SerializedName("is_dash_eligible")
	val isDashEligible: Int? = null,

	@field:SerializedName("number_of_qualities")
	val numberOfQualities: Int? = null,

	@field:SerializedName("story_link_stickers")
	val storyLinkStickers: List<StoryLinkStickersItem?>? = null,

	@field:SerializedName("video_duration")
	val videoDuration: Double? = null,

	@field:SerializedName("has_audio")
	val hasAudio: Boolean? = null,

	@field:SerializedName("video_versions")
	val videoVersions: List<VideoVersionsItem?>? = null,

	@field:SerializedName("video_codec")
	val videoCodec: String? = null,

	@field:SerializedName("story_music_stickers")
	val storyMusicStickers: List<StoryMusicStickersItem?>? = null
)

data class EmojiReactionsConfig(

	@field:SerializedName("swipe_up_to_show_reactions")
	val swipeUpToShowReactions: Boolean? = null,

	@field:SerializedName("composer_nux_type")
	val composerNuxType: Int? = null,

	@field:SerializedName("ufi_type")
	val ufiType: Int? = null,

	@field:SerializedName("delivery_type")
	val deliveryType: Int? = null,

	@field:SerializedName("reaction_tray_interactive_panning_enabled")
	val reactionTrayInteractivePanningEnabled: Boolean? = null,

	@field:SerializedName("hide_story_view_count")
	val hideStoryViewCount: Boolean? = null,

	@field:SerializedName("overlay_skin_tone_picker_enabled")
	val overlaySkinTonePickerEnabled: Boolean? = null
)

data class StoryMusicStickersItem(

	@field:SerializedName("rotation")
	val rotation: Double? = null,

	@field:SerializedName("music_asset_info")
	val musicAssetInfo: MusicAssetInfo? = null,

	@field:SerializedName("x")
	val X: Double? = null,

	@field:SerializedName("width")
	val width: Double? = null,

	@field:SerializedName("is_hidden")
	val isHidden: Int? = null,

	@field:SerializedName("y")
	val Y: Double? = null,

	@field:SerializedName("is_sticker")
	val isSticker: Int? = null,

	@field:SerializedName("z")
	val Z: Int? = null,

	@field:SerializedName("is_fb_sticker")
	val isFbSticker: Int? = null,

	@field:SerializedName("height")
	val height: Double? = null,

	@field:SerializedName("is_pinned")
	val isPinned: Int? = null
)

data class StoryLink(

	@field:SerializedName("link_type")
	val linkType: String? = null,

	@field:SerializedName("display_url")
	val displayUrl: String? = null,

	@field:SerializedName("link_title")
	val linkTitle: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class FriendshipStatus(

	@field:SerializedName("muting")
	val muting: Boolean? = null,

	@field:SerializedName("is_muting_reel")
	val isMutingReel: Boolean? = null,

	@field:SerializedName("following")
	val following: Boolean? = null,

	@field:SerializedName("outgoing_request")
	val outgoingRequest: Boolean? = null,

	@field:SerializedName("is_bestie")
	val isBestie: Boolean? = null
)

data class CommentInformTreatment(

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("should_have_inform_treatment")
	val shouldHaveInformTreatment: Boolean? = null
)

data class RankerScores(

	@field:SerializedName("ptap")
	val ptap: Double? = null,

	@field:SerializedName("vm")
	val vm: Double? = null,

	@field:SerializedName("fp")
	val fp: Double? = null
)

data class ImageVersions2(

	@field:SerializedName("candidates")
	val candidates: List<CandidatesItem?>? = null
)

data class User(

	@field:SerializedName("is_private")
	val isPrivate: Boolean? = null,

	@field:SerializedName("full_name")
	val fullName: String? = null,

	@field:SerializedName("profile_pic_id")
	val profilePicId: String? = null,

	@field:SerializedName("follow_friction_type")
	val followFrictionType: Int? = null,

	@field:SerializedName("pk")
	val pk: Long? = null,

	@field:SerializedName("profile_pic_url")
	val profilePicUrl: String? = null,

	@field:SerializedName("is_verified")
	val isVerified: Boolean? = null,

	@field:SerializedName("username")
	val username: String? = null,

	@field:SerializedName("friendship_status")
	val friendshipStatus: FriendshipStatus? = null
)

data class TerritoryValidityPeriods(
	val any: Any? = null
)

data class StoryLinkStickersItem(

	@field:SerializedName("story_link")
	val storyLink: StoryLink? = null,

	@field:SerializedName("rotation")
	val rotation: Double? = null,

	@field:SerializedName("x")
	val X: Double? = null,

	@field:SerializedName("width")
	val width: Double? = null,

	@field:SerializedName("is_hidden")
	val isHidden: Int? = null,

	@field:SerializedName("y")
	val Y: Double? = null,

	@field:SerializedName("is_sticker")
	val isSticker: Int? = null,

	@field:SerializedName("z")
	val Z: Int? = null,

	@field:SerializedName("is_fb_sticker")
	val isFbSticker: Int? = null,

	@field:SerializedName("height")
	val height: Double? = null,

	@field:SerializedName("is_pinned")
	val isPinned: Int? = null
)

data class StoryHashtagsItem(

	@field:SerializedName("rotation")
	val rotation: Double? = null,

	@field:SerializedName("x")
	val X: Double? = null,

	@field:SerializedName("width")
	val width: Double? = null,

	@field:SerializedName("is_hidden")
	val isHidden: Int? = null,

	@field:SerializedName("y")
	val Y: Double? = null,

	@field:SerializedName("is_sticker")
	val isSticker: Int? = null,

	@field:SerializedName("z")
	val Z: Int? = null,

	@field:SerializedName("is_fb_sticker")
	val isFbSticker: Int? = null,

	@field:SerializedName("height")
	val height: Double? = null,

	@field:SerializedName("is_pinned")
	val isPinned: Int? = null,

	@field:SerializedName("hashtag")
	val hashtag: Hashtag? = null
)

data class Hashtag(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class MusicAssetInfo(

	@field:SerializedName("dash_manifest")
	val dashManifest: Any? = null,

	@field:SerializedName("fast_start_progressive_download_url")
	val fastStartProgressiveDownloadUrl: String? = null,

	@field:SerializedName("audio_asset_id")
	val audioAssetId: String? = null,

	@field:SerializedName("display_labels")
	val displayLabels: Any? = null,

	@field:SerializedName("cover_artwork_uri")
	val coverArtworkUri: String? = null,

	@field:SerializedName("should_mute_audio_reason")
	val shouldMuteAudioReason: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("progressive_download_url")
	val progressiveDownloadUrl: String? = null,

	@field:SerializedName("audio_asset_start_time_in_ms")
	val audioAssetStartTimeInMs: Int? = null,

	@field:SerializedName("should_mute_audio")
	val shouldMuteAudio: Boolean? = null,

	@field:SerializedName("allows_saving")
	val allowsSaving: Boolean? = null,

	@field:SerializedName("ig_artist")
	val igArtist: Any? = null,

	@field:SerializedName("territory_validity_periods")
	val territoryValidityPeriods: TerritoryValidityPeriods? = null,

	@field:SerializedName("is_bookmarked")
	val isBookmarked: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("is_explicit")
	val isExplicit: Boolean? = null,

	@field:SerializedName("duration_in_ms")
	val durationInMs: Int? = null,

	@field:SerializedName("cover_artwork_thumbnail_uri")
	val coverArtworkThumbnailUri: String? = null,

	@field:SerializedName("display_artist")
	val displayArtist: String? = null,

	@field:SerializedName("overlap_duration_in_ms")
	val overlapDurationInMs: Int? = null,

	@field:SerializedName("dark_message")
	val darkMessage: Any? = null,

	@field:SerializedName("is_trending_in_clips")
	val isTrendingInClips: Boolean? = null,

	@field:SerializedName("audio_cluster_id")
	val audioClusterId: String? = null,

	@field:SerializedName("artist_id")
	val artistId: Any? = null,

	@field:SerializedName("reactive_audio_download_url")
	val reactiveAudioDownloadUrl: Any? = null,

	@field:SerializedName("subtitle")
	val subtitle: String? = null,

	@field:SerializedName("streaming_services")
	val streamingServices: Any? = null,

	@field:SerializedName("has_lyrics")
	val hasLyrics: Boolean? = null,

	@field:SerializedName("highlight_start_times_in_ms")
	val highlightStartTimesInMs: List<Int?>? = null,

	@field:SerializedName("allow_media_creation_with_music")
	val allowMediaCreationWithMusic: Any? = null,

	@field:SerializedName("formatted_clips_media_count")
	val formattedClipsMediaCount: Any? = null,

	@field:SerializedName("placeholder_profile_pic_url")
	val placeholderProfilePicUrl: String? = null
)

data class SharingFrictionInfo(

	@field:SerializedName("bloks_app_url")
	val bloksAppUrl: Any? = null,

	@field:SerializedName("should_have_sharing_friction")
	val shouldHaveSharingFriction: Boolean? = null
)

data class VideoVersionsItem(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("type")
	val type: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class StoryLikesConfig(

	@field:SerializedName("is_enabled")
	val isEnabled: Boolean? = null,

	@field:SerializedName("ufi_type")
	val ufiType: Int? = null
)

data class CandidatesItem(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class ReelMentionsItem(

	@field:SerializedName("display_type")
	val displayType: String? = null,

	@field:SerializedName("rotation")
	val rotation: Double? = null,

	@field:SerializedName("x")
	val X: Double? = null,

	@field:SerializedName("width")
	val width: Double? = null,

	@field:SerializedName("is_hidden")
	val isHidden: Int? = null,

	@field:SerializedName("y")
	val Y: Double? = null,

	@field:SerializedName("is_sticker")
	val isSticker: Int? = null,

	@field:SerializedName("z")
	val Z: Int? = null,

	@field:SerializedName("is_fb_sticker")
	val isFbSticker: Int? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("height")
	val height: Double? = null,

	@field:SerializedName("is_pinned")
	val isPinned: Int? = null
)
