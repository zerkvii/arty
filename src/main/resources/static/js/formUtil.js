$.validator.setDefaults({
    submitHandler: function() {
        alert("提交事件!");
    }
});

$().ready(function() {
// 在键盘按下并释放及提交后验证提交表单
    $("#register_form").validate({
        rules: {

            confirm_password: {
                required: true,
                minlength: 5,
                equalTo: "#password"
            },
            agree: "required"
        },
        messages: {
            confirm_password: {
                required: "请输入密码",
                minlength: "密码长度不能小于 5 个字母",
                equalTo: "两次密码输入不一致"
            },
            agree: "请接受我们的声明"
        }
    })
});