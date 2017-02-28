# Youtute-Watch-While-Layout (WWL)
Ứng dụng mẫu cài đặt kỹ thuật xem video trong khi bố cục giao diện thay đổi.

WWL cần các cấu hình cơ bản như:
- Player View ID: là view sẽ chứa player và có thể thực hiện kéo thả (drag-drop)
- Metadata View ID: là view sẽ chứa nội dung mở rộng, như ứng dụng youtube sẽ là danh sách các video liên quan
- Metadata Panel View ID: là view sẽ chứa nội dung mở rộng ở Tablet mode, như úng dụng youtube sẽ là nội dung chi tiết của video
- Overlay View ID: là view nằm cao nhất, thường sẽ chứa các view notify hoặc dialog...
- Mini Player Width: là độ rộng khi player thu nhỏ xuống phía dưới màn hình
- Mini Player Padding: là khoảng cách lề phải (right) và dưới (bottom) khi player thu nhỏ xuống phía dưới màn hình
- Is Tablet Mode: là chế độ tablet hay không?

Nếu IsTableMode = False:
- Player View ID: bắt buộc (required)
- Metadata View ID: bắt buộc (required)
- Metadata Panel View ID: không bắt buộc (optional)
- Overlay View ID: không bắt buộc (optional)

Nếu IsTableMode = True:
- Player View ID: bắt buộc (required)
- Metadata View ID: bắt buộc (required)
- Metadata Panel View ID: bắt buộc (required)
- Overlay View ID: không bắt buộc (optional)

WWL sẽ phản hồi với Listener:
```
public interface Listener {
	void WWL_onSliding(float offset);
	void WWL_onClicked();
	void WWL_onHided();
	void WWL_minimized();
	void WWL_maximized();
}
```
Dễ dàng nắm bắt trạng thái hiện tại của WWL:
```
public static final int STATE_HIDED = 0;
public static final int STATE_MAXIMIZED = 1;
public static final int STATE_MINIMIZED = 2;
```

# Demo
+ Android Phone

![1](https://github.com/vn-ttinc/Youtute-Watch-While-Layout/blob/master/screenshots/demo1.gif "")

+ Android Tablet

![1](https://github.com/vn-ttinc/Youtute-Watch-While-Layout/blob/master/screenshots/demo2.gif "")

Nếu thấy chưa hợp lý hoặc cần chỉnh sửa để tốt hơn thì bổ sung [vào đây](https://github.com/vn-ttinc/Youtute-Watch-While-Layout/issues) bạn nhé :)