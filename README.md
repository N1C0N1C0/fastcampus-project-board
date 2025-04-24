# fastcampus-project-board

### 【Draw.io】パス
[Draw.io](https://app.diagrams.net/) 

### 講師のノウハウ
[講師のブログ](https://djkeh.github.io)

### Endpoints
<details>
<summary>📋 展開 / 折りたたむ</summary>

| 種類 | URL | Method | 機能 | 説明 |
|------|-----|--------|------|------|
| View | / | GET | ルートページ | 掲示板に遷移 |
|      | /error | GET | エラーページ | |
|      | /login | GET | ログインページ | |
|      | /sign-up | GET | アカウント登録ページ | |
|      | /articles | GET | 掲示板ページ | |
|      | /articles/{article-id} | GET | アカウント登録ページ | |
|      | /articles/search | GET | 投稿ページ | |
|      | /articles/search-hashtag | GET | ハッシュタグ検索 | 掲示板のハッシュタグの検索専用ページ |
| API  | /api/sign-up | POST | アカウント登録 | |
|      | /api/login | GET | ログイン要請 | |
|      | /api/articles | GET | 投稿リスト照会 | |
|      | /api/articles{article-id} | GET | 投稿単一照会 | |
|      | /api/articles | POST | 投稿追加 | |
|      | /api/articles{article-id} | PUT,PATCH | 投稿修正 | |
|      | /api/articles{article-id} | DELETE | 投稿削除 | |
|      | /api/articleComments | GET | コメントリスト照会 | |
|      | /api/articleComments/{article-comment-id} | GET | コメント単一照会 | |
|      | /api/articles{article-id}/articleComments | GET | 関連コメントリスト照会 | 投稿に関連したコメントのリスト照会 |
|      | /api/articles/{article-id}/articleComments/{article-comment-id} | GET | 関連コメント単一照会 | 投稿に関連したコメントの単一照会 |
|      | /api/articles{article-id}/articleComments | POST | コメント登録 | |
|      | /api/articles/{article-id}/articleComments/{article-comment-id} | PUT,PATCH | コメント修正 | |
|      | /api/articles/{article-id}/articleComments/{article-comment-id} | DELETE | コメント削除 | |

</details>

### API Spec
<details>
<summary>📋 展開 / 折りたたむ</summary>

| URL | Method | 入力データ構造 |
|-----|--------|----------------|
| /api/sign-up | GET | ID、パスワード、メール、ニックネーム |
| /api/login | GET | ID、パスワード |
| /api/articles | GET | フィルター：タイトル、本文、ID、ニックネーム、ハッシュタグ |
| /api/articles{article-id} | GET |  |
| /api/articles | POST | タイトル、本文、ID、ハッシュタグ |
| /api/articles{article-id} | PUT,PATCH | タイトル、本文、ハッシュタグ |
| /api/articles{article-id} | DELETE | 投稿ID |
| /api/articleComments | GET | フィルター：本文、ID、ニックネーム |
| /api/articleComments/{article-comment-id} | GET | |
| /api/articles{article-id}/articleComments | GET | フィルター：本文 |
| /api/articles{article-id}/articleComments/{article-comment-id} | GET | |
| /api/articles{article-id}/articleComments | POST | 本文、ID |
| /api/articles{article-id}/articleComments/{article-comment-id} | PUT,PATCH | 本文 |
| /api/articles{article-id}/articleComments/{article-comment-id} | DELETE | 投稿ID |

</details>
