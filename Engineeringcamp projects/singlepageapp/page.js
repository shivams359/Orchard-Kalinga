// use $(document).ready function to
// make sure that the code executes only after the document's
// DOM has been loaded into the browser.
$(document).ready(function () {
    // when page1Link link is clicked, page1 shows,
    // page2 hides
    $(page1Link).bind("click", function () {
        $(page1).show();
        $(page2).hide();
    });

    // when page2Link link is clicked, page2 shows,
    // page1 hides
    $(page2Link).bind("click", function () {
        $(page1).hide();
        $(page2).show();
    });
});