package fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; // 投稿ID
    private String content; // コメント内容

    private LocalDateTime createdAt; // 作成日時
    private String createdBy; // 作成者
    private LocalDateTime modifiedAt; // 更新日時
    private String modifiedBy; // 更新者
}
