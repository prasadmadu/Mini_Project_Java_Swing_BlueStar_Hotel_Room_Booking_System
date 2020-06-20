var count = 0;
var app = {
   url: '/notify',
   initialize: function() {
      $('notify-bar').focus();
      app.listen();
   },
   listen: function() {
      $('notification').src = app.url + '?' + count;
      count ++;
   },
   post: function() {
      var message = $F('message');
      if(!message > 0) {
	 return;
      }


      var query =
	 'action=post' +
	 '&name=' + encodeURI($F('notify-bar')) +
	 '&message=' + encodeURI(message);
      new Ajax.Request(app.url, {
	 postBody: query,
	 onComplete: function() {
	    $('message').focus();
	    $('message').value = '';
	 }
      });
   },
   update: function(data) {
      var p = document.createElement('p');
      p.innerHTML = data.name + ':<br/>' + data.message;
      
      $('display').appendChild(p);

      new Fx.Scroll('display').down();
   }
};
var rules = {
   '#notify-bar': function(elem) {
      Event.observe(elem, 'keydown', function(e) {
	 if(e.keyCode == 13) {
	    $('login-button').focus();
	 }
      });
   },
   '#login-button': function(elem) {
      elem.onclick = app.login;
   },
   '#message': function(elem) {
      Event.observe(elem, 'keydown', function(e) {
	 if(e.shiftKey && e.keyCode == 13) {
	    $('post-button').focus();
	 }
      });
   },
   '#post-button': function(elem) {
      elem.onclick = app.post;
   }
};
Behaviour.addLoadEvent(app.initialize);
Behaviour.register(rules);
