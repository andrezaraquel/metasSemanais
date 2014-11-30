$(function(){
	deletarMeta();	
});

function deletarMeta(){
	$(".buttonDelete").click(function(){
		var idMeta = $(this).attr("id");
		
		$.ajax({
		    url: "/deletarMeta/"+idMeta,
		    type: "DELETE"
		}).done(function(){
		    window.location.href = "/";
		});
	});
}