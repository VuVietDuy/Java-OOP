# Java-OOP
Learning Java OOP
- OOP stands for object-Oriented Programming
- Object-oriented programming has several advantages over procedural programming:
  - OOP is faster and easier to execute
  - OOP provides a clear structure for the programs
  - OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
  - OOP makes it possible to create full reusable applications with less code and shorter development time
## Encapsulation
- Là trạng thái của đối tượng được bảo vệ không cho các truy cập từ code bên ngoài như thay đổi trạng thái hay nhìn trực tiếp
- Đây là tính chất đảm bảo sự toàn vẹn, bảo mật của đối tượng trong Java, tính đóng gói được thể hiện thông qua phạm vi truy cập access modifier (private, protected, public)
- Các lớp liên quan đến nhau có thể được gom chng lại thành package
## Abstraction
- Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng. Tính trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng
 bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình.
- Tính trừu tượng giúp bạn tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
- Trong Java, chúng là sử dụng abstract class và abstract interface để có tính trừu tượng.
## Inheritance
- Là khả năng cho phép xây dựng một lớp dựa trên các định nghĩa của một lớp đã có. Lớp đã có gọi là lớp Cha, lớp mới phát sinh gọi là lớp Con
- Lớp con sẽ kế thừa TẤT CẢ các thành phần của lớp cha,
- Có thẻ chia sẻ hay mở  rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại
## Polymorphism
- Khi một tác vụ được thực hiện theo nhiều cách khác nhau được gọi là tình đa hình. Thể hiện rõ nhất qua việc gọi phương thức, các phương thức hoàn toàn có thể GIỐNG NHAU, nhưng việc XỬ LÝ LUỒNG CÓ THẾ KHÁC NHAU.
- Trong java, sử dụng nạp chồng phương thức (method overloading) và ghi đè phương thức (method overriding) đẻ có tính đa hình
- NẠP CHỒNG (Overloading) Đây là khả năng cho phép một lớp ó nhiều thuộc tính, phương thức cùng tên nhưng với tham số khác nhau về loại cũng như số lượng. Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện
- GHI ĐÈ (Overriding) là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng lớp Con viết lại theo cách dùng của nó, và xuất hiện ở lớp Cha và tiếp tục xuất hiện ở lớp con.Khi dùng override,
 lúc thực thi, nếu lớp con khong có phương thức riêng, phương thức của lớp cha sẽ được gọi, ngược lại nếu lớp con có, phương thức của lớp Con sẽ được gọi
