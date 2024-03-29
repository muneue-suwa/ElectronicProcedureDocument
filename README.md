# 電子化手順書

2019年度インターフェイス設計学のレポート課題

## 課題

あなたは，成長著しいアプリ開発会社の技術者です．（中略）化学プラントを運転するある企業から，タブレット端末（防爆仕様）を用いた２つの操作の電子化手順書の試作が依頼されました．満たすべき仕様は以下の通りです．

### 条件

- 画面のサイズは，VGA（640ピクセル × 480ピクセル）とする．
- キーボードは使わない．（ソフトキーボードは使ってよいが，画面からはみ出さないように配置すること）
- 操作者は操作前に４桁のID番号と操作の日付（形式：YYMMDD，例：191105）を入力する．
- ２つの操作の手順は[手順.docx](procedure_lists/message_procedure.md)の通りとし，１回の操作ではどちらかの操作を行う．
- 手順を実行した場合には，チェックボックス（JButton等で実装）にチェックする．
- 操作の完了時には，実施操作名，操作者ID，操作の日付，および，実行した操作（チェックボックスにチェックされた操作のみ）が表示される．

なお，実用的な画面インターフェイスでは，入力ミスなどに対する取り消し機能が必要であるが，ここでは取消機能については考えなくて良い．
また，ユーザは正しい操作を行うものと仮定して良い．

## 起動方法

```shell-session:HowToRun
cd ElectronicProcedureDocument/
javac src/Main.java
java src.Main
```
