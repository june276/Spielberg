$(function(){
	const showInfoId = $("#showInfoId").val();
    $("#paymentBtn").click(function(){
        let name = $("#movieName").val();
        let adultCnt = $("#adultCnt").val();
        let studentCnt = $("#studentCnt").val();
        let cost = $("#cost").val();
        let totalCnt = Number(adultCnt) + Number(studentCnt);

        $.ajax({
            url: "/purchase/payment",
            type: "GET",
            data:{
                "itemName": name,
                "totalCnt": totalCnt,
                "cost": cost,
                "showInfoId": showInfoId,
            },
            success:function(response)
            {
                location.href = response.next_redirect_pc_url;
            }
        });
    });

});