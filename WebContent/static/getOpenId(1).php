<?php
    $code = $__GET["code"];

    $appid = "wx729dd86a0f029999";
    $secret = "e89fad08534ea1be4327ef71d6445c33";


    $api = "https://api.weixin.qq.com/sns/jscode2session?appid={$appid}&secret={$appid}&js_code={$code}&grant_type=authorization_code";

    function httpGet($url) {
    $curl = curl_init();
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_TIMEOUT, 500);
    curl_setopt($curl, CURLOPT_URL, $url);

    $res = curl_exec($curl);
    curl_close($curl);

    return $res;
    }


    $str = httpGet($api);

    echo $str;
    echo '这个是获取用户openID的脚本';
 ?>