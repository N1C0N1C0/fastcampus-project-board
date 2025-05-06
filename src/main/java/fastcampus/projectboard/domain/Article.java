package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // タイトル
    private String content; // 内容
    private String hashtag; // ハッシュタグ

    private LocalDateTime createdAt; // 作成日時
    private String createdBy; // 作成者
    private LocalDateTime modifiedAt; // 更新日時
    private String modifiedBy; // 更新者
}
