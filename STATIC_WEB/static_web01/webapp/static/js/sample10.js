$(document).ready(function() {
    $("form button").on("click", addBookmark);
    // $("form button").off("click", addBookmark);
    // $("form button").one("click", addBookmark);

    //                        mouseenter   mouseleave
    // $("form button").hover(addBookmark, addBookmark);
    $(".item-up").hover(function(e) { itemUp(e, true); }, function(e) { itemUp(e, false); });
    $(".item-down").hover(function(e) { itemDown(e, true); }, function(e) { itemDown(e, false); });
    $(".item-up").on("click", function(e) { itemUp(e, true); });
    $(".item-down").on("click", function(e) { itemDown(e, true); });
});

function itemUp(event, isActive) {
    if(isActive) {
        $(event.target).text("▲");
        if(event.type === "click") {
            $(event.target).parent().prev().before($(event.target).parent());
        }
    } else {
        $(event.target).text("△");
    }
}

function itemDown(event, isActive) {
    if(isActive) {
        $(event.target).text("▼");
        if(event.type === "click") {
            $(event.target).parent().next().after($(event.target).parent());
        }
    } else {
        $(event.target).text("▽");
    }
}

function addBookmark(event) {
    var url = $(event.target.form.url).val();
    var name = $(event.target.form.name).val();

    var aTag = $("<a>").attr("href", url).text(name);
    var liTag = $("<li>");
    liTag.append(aTag);

    $(".bookmark-list").first().append(liTag);
}