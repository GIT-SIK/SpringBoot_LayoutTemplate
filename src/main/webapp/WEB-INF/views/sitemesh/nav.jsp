<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
</head>

<body>
    <script>
        $(document).ready(() => {
            $('#btn').click(() => {
                $('#search-bg').toggleClass('toggle');
            });
        });
    </script>
    <style>
        body {
            margin: 0;
        }

        .navTop {
            background-color: lightgray;
        }

        #search-bg {
            position: absolute;
            width: 100vw;
            z-index: 1;

            background-color: lightgray;
            text-align: center;
            
            transition: all 0.5s;
            height: 0px;
            overflow: hidden;

        }

        #search-bg input {
            width: 70%;
            margin-top: 10px;
            height: 30px;
            background-color: transparent;
            font-size: 1.2rem;
            border-width: 0 0 1px;
        }

        #search-bg input:focus {
            outline: none;

        }

        #search-bg.toggle {
                   height: 100px;
            transition: all 0.2s;
        }
    </style>


    <div class="navTop">
        <button id="btn"> 버튼 </button>
    </div>
    <div id="search-bg"> <input type="search" placeholder="search"> </div>
</body>

</html>