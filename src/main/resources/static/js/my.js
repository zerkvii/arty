$('form').validate({
    rules: {
        fname: {
            minlength: 3,
            maxlength: 15,
        }
    },
    errorPlacement: function(error, element) {},
    highlight: function(element) {
        var id_attr = "#" + $(element).attr("id") + "1";
        $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
        $(id_attr).removeClass('icon-ok-circled2').addClass('icon-cancel-circled2');
    },
    unhighlight: function(element) {
        var id_attr = "#" + $(element).attr("id") + "1";
        $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
        $(id_attr).removeClass('icon-cancel-circled2').addClass('icon-ok-circled2');
    },
});

(function(i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function() {
        (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
        m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
})(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

ga('create', 'UA-79865537-1', 'auto');
ga('send', 'pageview');