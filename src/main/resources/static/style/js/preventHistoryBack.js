$(function() {
    　　if (window.history && window.history.pushState) {
    　　$(window).on('popstate', function () {
    　　window.history.pushState('forward', null, '#');
    　　window.history.forward(1);
    　　});
    　　}
    　　window.history.pushState('forward', null, '#'); //在IE中必须得有这两行
    　　window.history.forward(1);
    　　})