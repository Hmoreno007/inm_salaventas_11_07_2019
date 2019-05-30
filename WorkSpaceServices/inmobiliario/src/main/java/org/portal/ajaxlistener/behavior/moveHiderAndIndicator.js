DisableComponentListener = {
	disableElement: function(elementId, activeIconUrl){
      var hiderId = elementId + "-disable-layer";
      var indicatorId = elementId + "-indicator-picture";
      
      elementId = "#" + elementId;
      //create the overlay <div>
      $(elementId).after('<div id="' + hiderId 
         + '" style="position:absolute;">'
         + '<img id="' + indicatorId +  '" src="' + activeIconUrl + '"/>'
         + '</div>');
      
      hiderId = "#" + hiderId;
      //setting the style properties of the overlay <div>
      $(hiderId).css('opacity', '0.8');               
      $(hiderId).css('text-align', 'center');
      $(hiderId).css('background-color', 'white');
      //$(hiderId).css('border', '1px solid DarkGray');
      //setting the dimention of the overlay <div>
      $(hiderId).width($(elementId).outerWidth());
      $(hiderId).height($(elementId).outerHeight());       	 
      //positioning the overlay <div> on the component to disable.     
      $(hiderId).position({of: $(elementId),at: 'top left', my: 'top left'});
       
      //positioning the activity indicator in the middle of overlay <div>
      $("#" + indicatorId).position({of: $(hiderId), at: 'center center',
                                     my: 'center center'});
   },

	hideComponent: function(elementId){
		var hiderId = elementId + "-disable-layer";
		$('#' + hiderId).remove();
	}
};
